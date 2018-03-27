package com.dog.dogtest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dogController {


    @GetMapping("/readdog")
    public String readDog()
    {
        return "dog";
    }

}
