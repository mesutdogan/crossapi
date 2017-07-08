package com.doganmesut.crossapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by mesut on 02.07.2017.
 */

@Document(collection = "crs_user")
public class User {


    @Id
    private Long id;

    @Indexed(unique = true)
    private String userName;

    private double lastLong;

    private double lastLang;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getLastLong() {
        return lastLong;
    }

    public void setLastLong(double lastLong) {
        this.lastLong = lastLong;
    }

    public double getLastLang() {
        return lastLang;
    }

    public void setLastLang(double lastLang) {
        this.lastLang = lastLang;
    }
}
