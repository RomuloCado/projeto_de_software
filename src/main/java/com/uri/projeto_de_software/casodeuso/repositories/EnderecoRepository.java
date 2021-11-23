package com.uri.projeto_de_software.casodeuso.repositories;

import com.uri.projeto_de_software.casodeuso.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
