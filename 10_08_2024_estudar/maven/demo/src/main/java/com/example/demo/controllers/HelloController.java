package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @GetMapping("/")
    public String getMethodName() {

        String teste = "";

        try {
            teste = "Marcos";

        } catch (Exception e) {
            e.printStackTrace();

        }

        return teste;
    }

}
