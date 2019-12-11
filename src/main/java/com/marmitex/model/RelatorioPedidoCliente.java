package com.marmitex.model;


import lombok.Data;

import java.util.Date;

@Data
public class RelatorioPedidoCliente {

    private  Number id;

    private Date dataDoPedido;

    private boolean status;

    private  boolean pago;

    private Number quantidade;

    private Number peso;

    private Number valorTotal;




}
