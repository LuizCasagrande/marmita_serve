package com.marmitex.controller;

import com.marmitex.framework.CrudRestController;
import com.marmitex.framework.CrudService;
import com.marmitex.model.TamanhoPedido;
import com.marmitex.service.TamanhoPedidoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tamanho-pedido")
public class TamanhoPedidoController extends CrudRestController<TamanhoPedido, Long> {

    private final TamanhoPedidoService tamanhoPedidoService;

    public TamanhoPedidoController(TamanhoPedidoService tamanhoPedidoService) {
        this.tamanhoPedidoService = tamanhoPedidoService;
    }

    @Override
    public CrudService<TamanhoPedido, Long> getService() {
        return tamanhoPedidoService;
    }
}
