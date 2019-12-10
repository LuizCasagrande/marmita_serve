package com.marmitex.controller;

import com.marmitex.framework.CrudRestController;
import com.marmitex.framework.CrudService;
import com.marmitex.model.Comida;
import com.marmitex.service.ComidaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("comida")
public class ComidaController extends CrudRestController<Comida, Long> {

    private final ComidaService comidaService;

    public ComidaController(ComidaService comidaService) {
        this.comidaService = comidaService;
    }

    @Override
    public CrudService<Comida, Long> getService() {
        return comidaService;
    }

    @Override
    @GetMapping("{query}")
    public Optional<Comida> findById(@PathVariable("query") Long aLong) {
        var comida = super.findById(aLong).get();
        comida.getIngredientesList().size();
        comida.getTipoList().size();
        return Optional.of(comida);
    }

    @GetMapping("ativos")
    public List<Comida> ingredienteListAtivos(){
        return comidaService.findByInativoFalse();
    }
}
