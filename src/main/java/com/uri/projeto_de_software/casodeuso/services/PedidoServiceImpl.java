package com.uri.projeto_de_software.casodeuso.services;

import com.uri.projeto_de_software.casodeuso.entities.Pedido;
import com.uri.projeto_de_software.casodeuso.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public Pedido find(Long id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        return pedido.orElse(null);
    }
}
