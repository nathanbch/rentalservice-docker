package com.ingnum.rentalservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BonjourController {

    @GetMapping("/bonjour")
    public String bonjour() {
        return "bonjour";
    }

    @GetMapping("/appel-php")
    public String callPhpService() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(
            "http://php-service",
            String.class
        );
    }
}


