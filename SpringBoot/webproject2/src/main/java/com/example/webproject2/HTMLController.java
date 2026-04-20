package com.example.webproject2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HTMLController {
    @GetMapping("/")
    public String index(){
        return "index";

    }
    @GetMapping("/reg")
   
    
    public String about(){
        
        return "reg";
    }
    
}

