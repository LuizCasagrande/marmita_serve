package com.marmitex.service;

import com.marmitex.framework.CrudService;
import com.marmitex.model.Ingrediente;

import java.util.List;

public interface IngredienteService extends CrudService<Ingrediente, Long> {
    List<Ingrediente> findByInativoFalse();
}
