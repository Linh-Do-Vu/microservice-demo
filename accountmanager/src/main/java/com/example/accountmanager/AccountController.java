package com.example.accountmanager;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class AccountController {
    @GetMapping(value = "account")
    public ResponseEntity<?> accountWork () {
        return new ResponseEntity<>("account working", HttpStatus.OK) ;
    } ;
}
