package com.marmitex.controller;

import com.marmitex.framework.CrudRestController;
import com.marmitex.framework.CrudService;
import com.marmitex.model.Favorito;
import com.marmitex.service.FavoritoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("favorito")
public class FavoritoController extends CrudRestController<Favorito, Long> {

    private final FavoritoService favoritoService;

    public FavoritoController(FavoritoService favoritoService) {
        this.favoritoService = favoritoService;
    }

    @Override
    public CrudService<Favorito, Long> getService() {
        return favoritoService;
    }
}
