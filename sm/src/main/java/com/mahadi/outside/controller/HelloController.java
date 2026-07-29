package com.mahadi.outside.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static tools.jackson.databind.type.LogicalType.Map;

@RestController
public class HelloController {


    @GetMapping({"/home/name/{name-id}/post/{post-id}","/home/name/{name-id}"})
    public String sayHello(@PathVariable("name-id") Integer nameId, @PathVariable(name = "post-id" ,required = false) Integer postId) {
        if (postId == null) {
            return "Hello " + nameId;
        }

       return "Hello " + nameId + " " + postId;
    }

    @GetMapping({"/h/name/{name-id}/post/{post-id}"})
    public String sayHello(@PathVariable Map<String,String> j   ) {
        if (j.get("post-id") == null) {
            return "Hello " + j.get("name-id");
        }

        return "Hello " + j.get("name-id") + " h  " + j.get("post-id");
    }
}
