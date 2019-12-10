package com.marmitex.service;

import com.marmitex.framework.CrudService;
import com.marmitex.model.Pedido;
import org.springframework.data.jpa.repository.Query;

public interface PedidoService extends CrudService<Pedido, Long> {
     void preSave(Pedido entity);
     void setPago(Integer id);
}
