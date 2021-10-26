package com.uri.projeto_de_software.casodeuso.controller;

import com.uri.projeto_de_software.casodeuso.entities.Categoria;
import com.uri.projeto_de_software.casodeuso.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping(value = "/categorias/{id}")
    public ResponseEntity<Categoria> searchCategories(@PathVariable(value = "id") Long id){
        Categoria categoria = categoriaService.find(id);
        return ResponseEntity.ok().body(categoria);
    }
}
