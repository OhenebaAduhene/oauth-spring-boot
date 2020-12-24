package com.example.WebSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

//    @GetMapping("/")
//    String hello(){
//        return ("<h1>Hello world </h1>");
//    }

    @GetMapping("/")
    String login(){
        return "Welcome to my page";
    }
}
