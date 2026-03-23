package com.rcoem.day1demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Karekram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String karekram;

    public Karekram() {
    }

    public Karekram(Integer id, String karekram) {
        this.id = id;
        this.karekram = karekram;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKarekram() {
        return karekram;
    }

    public void setKarekram(String karekram) {
        this.karekram = karekram;
    }
}

