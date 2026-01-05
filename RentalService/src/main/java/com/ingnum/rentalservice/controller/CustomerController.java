package com.ingnum.rentalservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @GetMapping("/customer/{name}")
    public String customer(@PathVariable String name) {
        return "Bonjour " + name;
    }
}

