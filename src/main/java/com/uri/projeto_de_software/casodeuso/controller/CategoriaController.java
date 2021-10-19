package com.uri.projeto_de_software.casodeuso.controller;

import com.uri.projeto_de_software.casodeuso.entities.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoriaController {

    @GetMapping(value = "/categorias")
    public List<Categoria> searchCategories(){

        Categoria categoria1 = new Categoria(1L, "Informática");
        Categoria categoria2 = new Categoria(2L, "Escritório");

        List<Categoria> categories = new ArrayList<>();
        categories.add(categoria1);
        categories.add(categoria2);

        return categories;
    }
}
