package com.uri.projeto_de_software.casodeuso.services;

import com.uri.projeto_de_software.casodeuso.entities.Cliente;
import com.uri.projeto_de_software.casodeuso.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente find(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElse(null);
    }
}
