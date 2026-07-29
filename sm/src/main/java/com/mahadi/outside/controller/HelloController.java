package com.mahadi.outside.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping({"/home/name/{name-id}/post/{post-id}","/home/name/{name-id}"})
    public String sayHello(@PathVariable("name-id") Integer nameId, @PathVariable(value = "post-id" ,required = false) Integer postId) {
        if (postId == null) {
            return "Hello " + nameId;
        }

       return "Hello " + nameId + " " + postId;
    }
}
