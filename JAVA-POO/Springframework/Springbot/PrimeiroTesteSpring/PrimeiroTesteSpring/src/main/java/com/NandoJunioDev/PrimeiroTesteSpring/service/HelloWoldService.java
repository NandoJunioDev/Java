package com.NandoJunioDev.PrimeiroTesteSpring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class HelloWoldService {
    @GetMapping
    public String HelloWorldService(String name) {
        return "Hello World! Servicee" + name;
    }

}
