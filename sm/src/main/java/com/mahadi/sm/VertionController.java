package com.mahadi.sm;

import com.mahadi.sm.dto.ProfileDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/version")
public class VertionController {

    @GetMapping(version = "1.0")
    public ResponseEntity<String> defaultApiVertion() {
        return ResponseEntity.ok("defaultApiVertion 1");
    }

    @GetMapping(version = "2.0+")
    public ResponseEntity<String> apiVertionv2() {
        return ResponseEntity.ok("ApiVertionv 2");
    }
}