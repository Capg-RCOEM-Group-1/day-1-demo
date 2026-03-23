package com.rcoem.day1demo.controllers;


import com.rcoem.day1demo.repository.KarekramRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KarekramController {
    private KarekramRepository karekramRepository;

    public KarekramController(KarekramRepository karekramRepository) {
        this.karekramRepository = karekramRepository;
    }

    @GetMapping("/karekrams")
    public ResponseEntity<?> getKarekrams(){

        return ResponseEntity.ok().body(karekramRepository.findAll());
    }
}
