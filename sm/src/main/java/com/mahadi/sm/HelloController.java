package com.mahadi.sm;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HelloController {


    @RequestMapping(value = {"/dummy/users/{userid}/posts/{postid}"},method = {RequestMethod.GET,RequestMethod.POST})
    public String sayHello(@PathVariable("userid") Integer nameId, @PathVariable(name = "postid" ,required = false) Integer postId) {
        if (postId == null) {
            return "Hello " + nameId;
        }

       return "Hello " + nameId + " " + postId;
    }
    @GetMapping("/searchs")
    public String search(@RequestParam String query) {
        return "Hello " + query;
    }

    @GetMapping("/map/searchs")
    public String search2(@RequestParam  Map<String,String> query) {
        return "Hello " + query.get("query");
    }

    @GetMapping("/map/searchs2")
    public String searchRequestHeader(@RequestHeader(value = "aa" ,required = false,defaultValue = "faaa") String query ) {
        return "Hello " + query;
    }

    @GetMapping("/map/searchs3")
    public String searchRequestHeader(@RequestHeader HttpHeaders headers ) {
        return "Hello " + headers.get("aa");
    }

//    @GetMapping({"{userid}/posts/{postid}"})
//    public String sayHello(@PathVariable Map<String,String> j   ) {
//        if (j.get("postid") == null) {
//            return "Hello " + j.get("userid");
//        }
//
//        return "Hello " + j.get("userid") + " h  " + j.get("postid");
//    }


}
