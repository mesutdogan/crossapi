package com.doganmesut.crossapi.service;

import com.doganmesut.crossapi.BaseService;
import com.doganmesut.crossapi.model.LastActivity;
import com.doganmesut.crossapi.repository.LastActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.GeoResults;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.NearQuery;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mesut on 08.07.2017.
 */

@Service
public class LastActivityService implements BaseService<LastActivity,String> {

    @Autowired
    private LastActivityRepository lastActivityRepository;

    @Autowired
    private MongoOperations operations;

    @Override
    public LastActivity save(LastActivity lastActivity) {
       return lastActivityRepository.save(lastActivity);
    }

    @Override
    public LastActivity findOne(String s) {
        return lastActivityRepository.findOne(s);
    }

    @Override
    public List<LastActivity> findAll() {
        return lastActivityRepository.findAll();
    }

    public List<LastActivity> findNearActivities(String latitude,String longtitude){
        Point location = new Point(Double.parseDouble(latitude),Double.parseDouble(longtitude));
        return lastActivityRepository.findByLocationNear( new Point(Double.valueOf(longtitude), Double.valueOf(latitude)),
                new Distance(100.0, Metrics.KILOMETERS));


    }
}
