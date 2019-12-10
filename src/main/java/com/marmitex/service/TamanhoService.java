package com.marmitex.service;

import com.marmitex.framework.CrudService;
import com.marmitex.model.Tamanho;

import java.util.List;

public interface TamanhoService extends CrudService<Tamanho, Long> {
    List<Tamanho> findByInativoFalse();
}
