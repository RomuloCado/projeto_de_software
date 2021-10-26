package com.uri.projeto_de_software.casodeuso.services;

import com.uri.projeto_de_software.casodeuso.entities.Categoria;
import com.uri.projeto_de_software.casodeuso.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria find(Long id) {
        Optional<Categoria> categorias = categoriaRepository.findById(id);
        return categorias.orElse(null);
    }
}
