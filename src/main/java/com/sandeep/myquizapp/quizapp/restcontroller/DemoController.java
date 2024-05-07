package com.sandeep.myquizapp.quizapp.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String hello(){
        return "this is my server";
    }
}
