package com.doganmesut.crossapi.repository;

import com.doganmesut.crossapi.model.LastActivity;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by mesut on 02.07.2017.
 */

public interface LastActivityRepository extends MongoRepository<LastActivity, String> {
    List<LastActivity> findByLocationNear(Point p, Distance d);

}
