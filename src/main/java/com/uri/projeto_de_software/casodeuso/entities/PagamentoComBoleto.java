package com.uri.projeto_de_software.casodeuso.entities;

import com.uri.projeto_de_software.casodeuso.constants.EstadoPagamento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PagamentoComBoleto extends Pagamento{

    private static final long serialVersionUID = 1L;

    private Date dataDeVencimento;

    private Date dataDePagamento;

    public PagamentoComBoleto(Long id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
        super(id, estado, pedido);
        this.dataDePagamento = dataPagamento;
        this.dataDeVencimento = dataVencimento;
    }

}
