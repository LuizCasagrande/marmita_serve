package com.marmitex.controller;

import com.marmitex.framework.CrudRestController;
import com.marmitex.framework.CrudService;
import com.marmitex.model.RelatorioPedidoCliente;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("relatorio-cliente")
public class RelatorioPedidoClienteController extends CrudRestController<RelatorioPedidoCliente, Long> {
    @Override
    public CrudService<RelatorioPedidoCliente, Long> getService() {
        return null;
    }
}
