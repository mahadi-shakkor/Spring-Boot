package com.mahadi.sm;

import com.mahadi.sm.dto.ProfileDto;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HelloController {

//
//    @RequestMapping(value = {"/dummy/users/{userid}/posts/{postid}"}, method = {RequestMethod.GET, RequestMethod.POST})
//    public String sayHello(@PathVariable("userid") Integer nameId, @PathVariable(name = "postid", required = false) Integer postId) {
//        if (postId == null) {
//            return "Hello " + nameId;
//        }
//
//        return "Hello " + nameId + " " + postId;
//    }
//
//    @GetMapping("/searchs")
//    public String search(@RequestParam String query) {
//        return "Hello " + query;
//    }
//
//    @GetMapping("/map/searchs")
//    public String search2(@RequestParam Map<String, String> query) {
//        return "Hello " + query.get("query");
//    }
//
//    @GetMapping("/map/searchs2")
//    public String searchRequestHeader(@RequestHeader(value = "aa", required = false, defaultValue = "faaa") String query) {
//        return "Hello " + query;
//    }
//
//    @GetMapping("/map/searchs3")
//    public String searchRequestHeader(@RequestHeader HttpHeaders headers) {
//        return "Hello " + headers.get("aa");
//    }
//
//    @GetMapping("/show")
//    public String show(@RequestBody ProfileDto profile) {
//        return "Hello World" + profile.toString();
//    }
//
//    @GetMapping("/req-entity")
//    public ResponseEntity<String> show(RequestEntity<ProfileDto> requestEntity) {
//        return ResponseEntity
//                .status(HttpStatus.CREATED)
//                .header("Content-Type", "application/json")
//                .body(requestEntity.getBody().toString());
//    }
//
//    @GetMapping({"","/","/v1"})
//    public ResponseEntity<String> defaultPathVersion(){
//        return ResponseEntity.ok("return from v1");
//    }
//    @GetMapping("/v2")
//    public ResponseEntity<String> defaultPathVersionV2(){
//        return ResponseEntity.ok("return from v2");
//    }
//    @GetMapping(params="version=1")
//    public ResponseEntity<String> param1PathVersion(){
//        return ResponseEntity.ok("return from v1");
//    }
//    @GetMapping(params="version=2")
//    public ResponseEntity<String> param2PathVersionV2(){
//        return ResponseEntity.ok("return from v2");
//    }
//
//    @GetMapping(headers="version=1")
//    public ResponseEntity<String> headers1PathVersion(){
//        return ResponseEntity.ok("return from v1");
//    }
//    @GetMapping(headers="version=2")
//    public ResponseEntity<String> headers2PathVersionV2(){
//        return ResponseEntity.ok("return from v2");
//    }
//
//    @GetMapping(produces ="application/v1+json")
//    public ResponseEntity<String> produces1PathVersion(){
//        return ResponseEntity.ok("return- from -v1");
//    }
//    @GetMapping(produces ="application/v2+json")
//    public ResponseEntity<String> produces2PathVersionV2(){
//        return ResponseEntity.ok("return- from -v2");
//    }
}


//    @GetMapping({"{userid}/posts/{postid}"})
//    public String sayHello(@PathVariable Map<String,String> j   ) {
//        if (j.get("postid") == null) {
//            return "Hello " + j.get("userid");
//        }
//
//        return "Hello " + j.get("userid") + " h  " + j.get("postid");
//    }



