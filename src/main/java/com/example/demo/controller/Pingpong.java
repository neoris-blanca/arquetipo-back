package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class Pingpong {

    @GetMapping("ping")
    public String ping() {
        return "pong";
    }

}
