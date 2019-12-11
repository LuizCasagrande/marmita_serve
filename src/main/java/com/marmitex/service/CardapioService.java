package com.marmitex.service;

import com.marmitex.framework.CrudService;
import com.marmitex.model.Cardapio;
import com.marmitex.model.Pedido;

import java.util.List;

public interface CardapioService extends CrudService<Cardapio, Long> {
    void preSave(Cardapio entity);
    List<Cardapio> findByInativoFalse();
}
