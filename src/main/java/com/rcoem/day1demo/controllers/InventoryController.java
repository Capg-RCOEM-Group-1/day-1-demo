package com.rcoem.day1demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
    @GetMapping("/inventory")
    public String getInventory(){
        return "This is the inventory of the rental store";
    }
}
