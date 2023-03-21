package com.damt.SpringBootProy.controller;

import com.damt.SpringBootProy.entity.CategoriaEntity;
import com.damt.SpringBootProy.entity.MenuEntity;
import com.damt.SpringBootProy.repository.MenuRepository;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/menu")
public class MenuRestController {
    private MenuRepository menuRepository;

    public MenuRestController(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }
    @GetMapping("/")
    List<MenuEntity> get(){
        return menuRepository.findAll();
    }

    @PostMapping("/")
    ResponseEntity<MenuEntity> newMenu(@RequestBody MenuEntity newMenu){
        MenuEntity entity1 = new MenuEntity("agua", "1", new CategoriaEntity(1));
        return new ResponseEntity<>(menuRepository.saveAndFlush(entity1), HttpStatusCode.valueOf(200));
    }

}
