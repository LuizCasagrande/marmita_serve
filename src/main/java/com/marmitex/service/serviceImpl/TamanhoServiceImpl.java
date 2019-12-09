package com.marmitex.service.serviceImpl;

import com.marmitex.data.TamanhoData;
import com.marmitex.event.PedidoPreSave;
import com.marmitex.event.TamanhoPreSave;
import com.marmitex.framework.CrudServiceImpl;
import com.marmitex.model.Pedido;
import com.marmitex.model.Tamanho;
import com.marmitex.service.TamanhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TamanhoServiceImpl extends CrudServiceImpl<Tamanho, Long> implements TamanhoService {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    private TamanhoData tamanhoData;

    @Override
    public JpaRepository<Tamanho, Long> getRepository() {
        return tamanhoData;
    }


    public void preSave(Tamanho entity) {
        applicationEventPublisher.publishEvent(new TamanhoPreSave(this, entity));
    }

    @Override
    public Tamanho save(Tamanho entity) {
        preSave(entity);
        return getRepository().save(entity);
    }
}
