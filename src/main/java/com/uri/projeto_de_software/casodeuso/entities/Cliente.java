package com.uri.projeto_de_software.casodeuso.entities;

import com.uri.projeto_de_software.casodeuso.constants.TipoCliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
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

    private TipoCliente tipoCliente;

    private String cpfOuCnpj;

    @OneToMany(mappedBy = "cliente", cascade=CascadeType.PERSIST)
    private List<Endereco> enderecos;

    @OneToMany(mappedBy = "cliente", cascade=CascadeType.PERSIST)
    private List<Telefone> telefones;

}
