package com.example.boleteria.controller;

import com.example.boleteria.interfaces.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sala")
public class SalaController {
    @Autowired
    SalaRepository salaRepository;

    @GetMapping("/find-all")
    String findAll(){
        return "sala-list";
    }
}
