package com.marmitex.controller;

import com.marmitex.framework.CrudRestController;
import com.marmitex.framework.CrudService;
import com.marmitex.model.Tamanho;
import com.marmitex.service.TamanhoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tamanho")
public class TamanhoController extends CrudRestController<Tamanho, Long> {

    private final TamanhoService tamanhoService;

    public TamanhoController(TamanhoService tamanhoService) {
        this.tamanhoService = tamanhoService;
    }

    @Override
    public CrudService<Tamanho, Long> getService() {
        return tamanhoService;
    }
}
