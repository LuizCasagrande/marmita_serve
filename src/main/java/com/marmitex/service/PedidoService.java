package com.marmitex.service;

import com.marmitex.framework.CrudService;
import com.marmitex.model.Pedido;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PedidoService extends CrudService<Pedido, Long> {
     void preSave(Pedido entity);
     void setPago(Long id);
     void setCancelado(@Param("id") Long id);
}
