package ru.netology.springBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/start")
    private String hello(){
        return "hello from my SpringBoot App!";
    }

}
