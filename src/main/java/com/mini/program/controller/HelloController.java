package com.mini.program.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by NullPointer on 2018/10/29.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    public String hello(){
        return "hello world" ;
    }
}
