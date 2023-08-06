package com.example.boleteria.controller;

import com.example.boleteria.interfaces.EventoRepository;
import com.example.boleteria.model.Evento;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/evento")
public class EventoController {

    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    EventoRepository eventoRepository;

    @GetMapping("/find-all")
    String findAll(){
        Iterable<Evento> eventos = eventoRepository.findAll();
        for(Evento evento : eventos){
            log.info("{}", evento.getNombre());
        }
        return "evento-list";
    }
}
