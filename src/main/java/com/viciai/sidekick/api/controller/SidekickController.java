package com.viciai.sidekick.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SidekickController {
    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }
}
