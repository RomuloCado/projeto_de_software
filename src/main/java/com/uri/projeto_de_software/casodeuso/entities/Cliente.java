package com.uri.projeto_de_software.casodeuso.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.uri.projeto_de_software.casodeuso.constants.TipoCliente;
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
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String tipoCliente;

    private String cpfOuCnpj;

    @OneToMany(mappedBy = "cliente")
    @JsonManagedReference
    private List<Endereco> enderecos;

    @OneToMany(mappedBy = "cliente")
    @JsonManagedReference
    private List<Telefone> telefones;

    public Cliente (String nome, String email, TipoCliente tipoCliente, String cpfOuCnpj){
        this.nome = nome;
        this.email = email;
        this.tipoCliente = tipoCliente.getDescricao();
        this.cpfOuCnpj = cpfOuCnpj;
        this.enderecos = new ArrayList<>();
        this.telefones = new ArrayList<>();
    }

}
