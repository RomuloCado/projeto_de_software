package com.uri.projeto_de_software.casodeuso.repositories;

import com.uri.projeto_de_software.casodeuso.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
