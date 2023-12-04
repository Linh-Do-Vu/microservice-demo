package com.example.photoappapiuser;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class UserController {
    @GetMapping(value = "user")
    public ResponseEntity<?> showString () {
        return new ResponseEntity<>("work", HttpStatus.ACCEPTED);
    }
}
