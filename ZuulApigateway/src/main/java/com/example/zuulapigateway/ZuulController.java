package com.example.zuulapigateway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("zuul")
public class ZuulController {
    @GetMapping("check")
    public ResponseEntity<?> checkZull () {
        return new ResponseEntity<>("zulll work", HttpStatus.OK) ;
    }
}
