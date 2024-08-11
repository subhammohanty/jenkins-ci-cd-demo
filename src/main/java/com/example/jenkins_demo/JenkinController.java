package com.example.jenkins_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class JenkinController {

    @GetMapping("/greetings/{name}")
    public String getMessage(@PathVariable("name") String name){
        return "Congratulation you have successfully completed the setup !" + name;
    }
}

