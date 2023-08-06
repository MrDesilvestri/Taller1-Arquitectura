package com.example.boleteria.controller;

import com.example.boleteria.interfaces.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping("/find-all")
    String findAll(){
        return "person-list";
    }
}
