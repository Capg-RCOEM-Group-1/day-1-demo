package com.rcoem.day1demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("health")
public class HealthController {
    @GetMapping("/")
    public String health() {
        return "ok";
    }
}
