package com.marmitex.controller;

import com.marmitex.framework.CrudRestController;
import com.marmitex.framework.CrudService;
import com.marmitex.model.Alergia;
import com.marmitex.service.AlergiaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("alergia")
public class AlergiaController extends CrudRestController<Alergia, Long> {

    private final AlergiaService alergiaService;

    public AlergiaController(AlergiaService alergiaService) {
        this.alergiaService = alergiaService;
    }

    @Override
    public CrudService<Alergia, Long> getService() {
        return alergiaService;
    }
}
