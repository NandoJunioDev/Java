package com.NandoJunioDev.PrimeiroTesteSpring.controller;

import com.NandoJunioDev.PrimeiroTesteSpring.domain.User;
import com.NandoJunioDev.PrimeiroTesteSpring.service.HelloWoldService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    private HelloWoldService helloWoldService;
    public HelloWorldController(HelloWoldService helloWoldService) {
        this.helloWoldService = helloWoldService;
    }
    @GetMapping
public String HelloWorld() {
    return helloWoldService.HelloWorldService("  Nando Junio");
}

@PostMapping("")
public String HelloWorldPost(@RequestBody User body) {
    return "Hello World Post" + body.getName();
}
}
