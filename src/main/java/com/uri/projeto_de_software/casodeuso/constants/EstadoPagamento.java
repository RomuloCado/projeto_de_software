package com.uri.projeto_de_software.casodeuso.constants;

import lombok.Getter;

@Getter
public enum EstadoPagamento {

    PENDENTE("Pendente"),
    QUITADO("Quitado"),
    CANCELADO("Cancelado");

    private String descricao;

    EstadoPagamento(String descricao) {
        this.descricao = descricao;
    }
}

