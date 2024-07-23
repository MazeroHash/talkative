package com.example.springlearn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String hello() {
        return "Hey! Hello j";
    }

}
