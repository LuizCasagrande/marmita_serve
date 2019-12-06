package com.marmitex.controller;

import com.marmitex.framework.CrudRestController;
import com.marmitex.framework.CrudService;
import com.marmitex.model.Detestada;
import com.marmitex.service.DetestadaService;

public class DetestadasController extends CrudRestController<Detestada, Long> {

    private final DetestadaService detestadaService;

    public DetestadasController(DetestadaService detestadaService) {
        this.detestadaService = detestadaService;
    }

    @Override
    public CrudService<Detestada, Long> getService() {
        return detestadaService;
    }


}
