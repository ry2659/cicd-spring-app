package com.cicd.spring.controller;

import com.cicd.spring.utility.Util;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

    @GetMapping("v1")
    private ResponseEntity<String> showWelcome(){
        System.out.println("here 1");
        return new ResponseEntity<>(Util.welcomeTemplate, HttpStatus.OK);
    }

    @GetMapping
    private ResponseEntity<String> showWelcome1(){
        System.out.println("here 2");
        return new ResponseEntity<>(Util.welcomeTemplate, HttpStatus.OK);
    }
}
