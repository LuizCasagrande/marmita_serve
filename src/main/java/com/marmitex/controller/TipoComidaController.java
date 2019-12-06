package com.marmitex.controller;

import com.marmitex.framework.CrudRestController;
import com.marmitex.framework.CrudService;
import com.marmitex.model.TipoComida;
import com.marmitex.service.TipoComidaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tipo-comida")
public class TipoComidaController extends CrudRestController<TipoComida, Long> {

    private final TipoComidaService tipoComidaService;

    public TipoComidaController(TipoComidaService tipoComidaService) {
        this.tipoComidaService = tipoComidaService;
    }

    @Override
    public CrudService<TipoComida, Long> getService() {
        return tipoComidaService;
    }

}
