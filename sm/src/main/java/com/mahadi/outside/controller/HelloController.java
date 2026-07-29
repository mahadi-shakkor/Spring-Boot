package com.mahadi.outside.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static tools.jackson.databind.type.LogicalType.Map;

@RestController
public class HelloController {


//    @GetMapping({"/dummy/users/{userid}/posts/{postid}","/api/dummy/users/{userid}"})
//    public String sayHello(@PathVariable("userid") Integer nameId, @PathVariable(name = "postid" ,required = false) Integer postId) {
//        if (postId == null) {
//            return "Hello " + nameId;
//        }
//
//       return "Hello " + nameId + " " + postId;
//    }

    @GetMapping({"/dummy/users/{userid}/posts/{postid}"})
    public String sayHello(@PathVariable Map<String,String> j   ) {
        if (j.get("postid") == null) {
            return "Hello " + j.get("userid");
        }

        return "Hello " + j.get("userid") + " h  " + j.get("postid");
    }
}
