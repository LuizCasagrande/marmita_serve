package com.marmitex.controller;

import com.marmitex.framework.CrudRestController;
import com.marmitex.framework.CrudService;
import com.marmitex.model.Cliente;
import com.marmitex.service.ClienteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cliente")
public class ClienteController extends CrudRestController<Cliente, Long> {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @Override
    public CrudService<Cliente, Long> getService() {
        return clienteService;
    }
}
