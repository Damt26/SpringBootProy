package com.damt.SpringBootProy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {
    @RequestMapping("/")
    @ResponseBody
    public ResponseEntity<String> function(){
        return new ResponseEntity<>("HOLA123 desde el controlador prueba", HttpStatus.OK);
    }
}
