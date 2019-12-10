package com.marmitex.controller;

import com.marmitex.framework.CrudRestController;
import com.marmitex.framework.CrudService;
import com.marmitex.model.Tipo;
import com.marmitex.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tipo")
public class TipoController extends CrudRestController<Tipo, Long> {

    @Autowired  private TipoService tipoService;

    @Override
    public CrudService<Tipo, Long> getService() {
        return tipoService;
    }

    @GetMapping("ativos")
    public List<Tipo> ingredienteListAtivos(){
        return tipoService.findByInativoFalse();
    }
}
