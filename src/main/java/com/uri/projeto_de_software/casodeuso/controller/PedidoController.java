package com.uri.projeto_de_software.casodeuso.controller;

import com.uri.projeto_de_software.casodeuso.entities.Pedido;
import com.uri.projeto_de_software.casodeuso.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping(value = "/pedidos/{id}")
    public ResponseEntity<Pedido> searchClientes(@PathVariable(value = "id") Long id){
        Pedido pedido = pedidoService.find(id);
        return ResponseEntity.ok().body(pedido);
    }
}
