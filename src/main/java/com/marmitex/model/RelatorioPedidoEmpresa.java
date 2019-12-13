package com.marmitex.model;


import lombok.Data;

@Data
public class RelatorioPedidoEmpresa {

    private Number id;

    private String nome;

    private Number quantidade;

    private Number peso;

    private Number valorTotal;

    private Number valorTotalPorPeso;

}
