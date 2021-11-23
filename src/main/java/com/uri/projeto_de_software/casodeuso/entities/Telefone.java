package com.uri.projeto_de_software.casodeuso.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Telefone implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String numero;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    @JsonBackReference
    private Cliente cliente;

    public Telefone(String numero){
        this.numero = numero;
    }
}
