package com.doganmesut.crossapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mesut on 02.07.2017.
 */

@RestController
public class BaseController {

    @RequestMapping(value = "/hey")
    public String hey(){
        return "hello";
    }
}
