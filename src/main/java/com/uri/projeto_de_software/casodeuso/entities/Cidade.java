package com.uri.projeto_de_software.casodeuso.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cidade implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "estado_id")
    @JsonBackReference
    private Estado estado;

    @OneToMany(mappedBy = "cidade")
    @JsonManagedReference
    private List<Endereco> enderecos;

    public Cidade(String nome){
        this.nome = nome;
        this.enderecos = new ArrayList<>();
    }
}
