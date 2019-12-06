package com.marmitex.controller;

import com.marmitex.framework.CrudRestController;
import com.marmitex.framework.CrudService;
import com.marmitex.model.RelatorioPedidoEmpresa;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("relatorio")
public class RelatorioPedidoEmpresaController extends CrudRestController<RelatorioPedidoEmpresa, Long> {

    @Override
    public CrudService<RelatorioPedidoEmpresa, Long> getService() {
        return null;
    }
}
