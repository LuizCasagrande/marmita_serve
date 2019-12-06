package com.marmitex.service;

import com.marmitex.framework.CrudService;
import com.marmitex.model.Pedido;

public interface PedidoService extends CrudService<Pedido, Long> {
     void preSave(Pedido entity);
}
