package com.marmitex.service;

import com.marmitex.framework.CrudService;
import com.marmitex.model.Tipo;

import java.util.List;

public interface TipoService extends CrudService<Tipo, Long> {
    List<Tipo> findByInativoFalse();
}
