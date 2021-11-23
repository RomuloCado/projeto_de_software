package com.uri.projeto_de_software.casodeuso.repositories;

import com.uri.projeto_de_software.casodeuso.entities.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
