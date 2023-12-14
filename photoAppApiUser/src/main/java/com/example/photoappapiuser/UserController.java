package com.example.photoappapiuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
//    @Autowired
//    private Environment env ;
    @GetMapping(value = "/check")
    public ResponseEntity<?> showString () {
        return new ResponseEntity<>("work" , HttpStatus.ACCEPTED);
    }
}
