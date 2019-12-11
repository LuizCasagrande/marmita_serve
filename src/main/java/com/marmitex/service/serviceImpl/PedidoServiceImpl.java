package com.marmitex.service.serviceImpl;

import com.marmitex.data.PedidoData;
import com.marmitex.event.PedidoPreSave;
import com.marmitex.framework.CrudServiceImpl;
import com.marmitex.model.Cliente;
import com.marmitex.model.Pedido;
import com.marmitex.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl extends CrudServiceImpl<Pedido, Long> implements PedidoService {
    @Autowired private  ApplicationEventPublisher applicationEventPublisher;

    @Autowired private PedidoData pedidoData;

    @Override
    public void preSave(Pedido entity) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Cliente cliente = (Cliente) authentication.getPrincipal();
        entity.setCliente(cliente);
        applicationEventPublisher.publishEvent(new PedidoPreSave(this, entity));
    }

    @Override
    public Pedido save(Pedido entity) {
        preSave(entity);
        return getRepository().save(entity);
    }

    @Override
    public JpaRepository<Pedido, Long> getRepository() {
        return pedidoData;
    }

    @Override
    public void setPago(Integer id) {
        pedidoData.setPago(id);
    }

    @Override
    public void setCancelado(Integer id) {
        pedidoData.setCancelado(id);
    }


}
