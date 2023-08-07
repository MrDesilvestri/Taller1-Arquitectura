package com.example.boleteria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.boleteria.interfaces.StatusRepository;

@Controller
@RequestMapping("/status")
public class StatusController{

    @Autowired
    StatusRepository statusRepository;
    
    @RequestMapping(value = "/getStatus", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Boolean isValid() {
        return true;
    }

    @GetMapping("/getStatusInfo")
    ResponseEntity<?> getStatusInfo() {
        return ResponseEntity.status(HttpStatus.OK).body("1:true");
    }
}
