package com.doganmesut.crossapi.controller;

import com.doganmesut.crossapi.model.User;
import com.doganmesut.crossapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mesut on 02.07.2017.
 */

@RestController
@RequestMapping(value = "/user")
public class UserConrtoller {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public User save(@RequestBody  User user){
        return userService.save(user);
    }
    @RequestMapping(value = "/hey")
    public String hey(){
        return "hello";
    }
}
