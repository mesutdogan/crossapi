package com.doganmesut.crossapi.controller;

import com.doganmesut.crossapi.model.LastActivity;
import com.doganmesut.crossapi.model.LastActivityDto;
import com.doganmesut.crossapi.service.LastActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mesut on 02.07.2017.
 */

@RestController
@RequestMapping(value = "/last-activity")
public class LastActivityController {

    @Autowired
    private LastActivityService lastActivityService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public LastActivity addLastActivity(@RequestBody LastActivityDto lastActivity) {

      return lastActivityService.save(new LastActivity(lastActivity.getUsername(),lastActivity
      .getTime(),new GeoJsonPoint(Double.parseDouble(lastActivity.getLatitude()),Double.parseDouble(lastActivity.getLongtitude()))));
    }

    @RequestMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<LastActivity> findNearActivties(@RequestParam String longtitude,@RequestParam String latitude){
        return lastActivityService.findNearActivities(longtitude,latitude);
    }


}
