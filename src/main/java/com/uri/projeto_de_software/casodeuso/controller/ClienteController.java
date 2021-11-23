package com.uri.projeto_de_software.casodeuso.controller;

import com.uri.projeto_de_software.casodeuso.entities.Cliente;
import com.uri.projeto_de_software.casodeuso.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/clientes/{id}")
    public ResponseEntity<Cliente> searchClientes(@PathVariable(value = "id") Long id){
        Cliente cliente = clienteService.find(id);
        return ResponseEntity.ok().body(cliente);
    }
}
