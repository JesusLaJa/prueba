package com.example.demo_v2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("hola")
    public String hola() {
        return "Hola Jesus, esta es la prueba de Hola Mundo con SpringBoot.";
    }

    @GetMapping("suma")
    public String suma(@RequestParam (value="num1") int num1, @RequestParam (value="num2") int num2) {
        return "El resultado de la suma es :" + Integer.parseInt(String.valueOf(num1+num2));
    }


}
