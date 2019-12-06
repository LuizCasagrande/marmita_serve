package com.marmitex.service.serviceImpl;

import com.marmitex.data.TamanhoPedidoData;
import com.marmitex.framework.CrudServiceImpl;
import com.marmitex.model.TamanhoPedido;
import com.marmitex.service.TamanhoPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TamanhoPedidoServiceImpl extends CrudServiceImpl<TamanhoPedido, Long> implements TamanhoPedidoService {

    @Autowired
    private TamanhoPedidoData tamanhoPedidoData;

    @Override
    public JpaRepository<TamanhoPedido, Long> getRepository() {
        return tamanhoPedidoData;
    }
}
