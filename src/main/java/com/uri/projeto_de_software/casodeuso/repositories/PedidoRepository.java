package com.uri.projeto_de_software.casodeuso.repositories;

import com.uri.projeto_de_software.casodeuso.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
