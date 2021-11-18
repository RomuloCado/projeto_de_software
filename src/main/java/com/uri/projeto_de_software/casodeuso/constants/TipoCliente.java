package com.uri.projeto_de_software.casodeuso.constants;

import lombok.Getter;

@Getter
public enum TipoCliente {

    PESSOA_FISICA("Pessoa Física"),
    PESSOA_JURIDICA("Pessoa Jurídica");

    private String descricao;

    TipoCliente(String descricao) {
        this.descricao = descricao;
    }

}
