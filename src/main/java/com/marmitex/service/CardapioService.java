package com.marmitex.service;

import com.marmitex.framework.CrudService;
import com.marmitex.model.Cardapio;

import java.util.List;

public interface CardapioService extends CrudService<Cardapio, Long> {
    List<Cardapio> findByInativoFalse();
}
