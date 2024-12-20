package com.example.spring_devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/getData")
    public String getData(){
        return "This is Jenkins and docker connection project";
    }
}
