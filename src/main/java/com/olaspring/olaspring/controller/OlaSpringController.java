package com.olaspring.olaspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endpoint")
public class OlaSpringController {

    @GetMapping
    public String olaSpring() {
        return "Olá Spring!!!";
    }
}
