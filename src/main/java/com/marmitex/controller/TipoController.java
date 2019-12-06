package com.marmitex.controller;

import com.marmitex.framework.CrudRestController;
import com.marmitex.framework.CrudService;
import com.marmitex.model.Tipo;
import com.marmitex.service.TipoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tipo")
public class TipoController extends CrudRestController<Tipo, Long> {

    private TipoService tipoService;

    @Override
    public CrudService<Tipo, Long> getService() {
        return tipoService;
    }
}
