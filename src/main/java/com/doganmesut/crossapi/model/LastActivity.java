package com.doganmesut.crossapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexType;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

/**
 * Created by mesut on 08.07.2017.
 */

@Document(collection = "crs_user_last_activity")
public class LastActivity {

    private String id;

    @Indexed(unique = true)
    private String username;
    private String time;

    @TextIndexed
    @GeoSpatialIndexed(type = GeoSpatialIndexType.GEO_2DSPHERE)
    GeoJsonPoint location;

    public LastActivity(){

    }

    public LastActivity(String username, String time, GeoJsonPoint location) {
        this.username = username;
        this.time = time;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
