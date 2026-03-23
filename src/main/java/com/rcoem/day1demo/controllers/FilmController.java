package com.rcoem.day1demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmController {
    @GetMapping("/film")
    public String getFilm() {
        return "Film available for rent!";
    }

}
