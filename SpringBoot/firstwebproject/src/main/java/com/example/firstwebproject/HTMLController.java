package com.example.firstwebproject;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HTMLController {
    @GetMapping("/")
    
    public String index(){
        return "<h1>WELCOME IN SPRING BOOT APPLICATION</h1>";
    }
}
