package com.example.boleteria.controller;

import com.example.boleteria.interfaces.BoletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/boleta")
public class BoletaController {
    @Autowired
    BoletaRepository boletaRepository;

    @GetMapping("/find-all")
    String findAll(){
        return "data";
    }

    
}
