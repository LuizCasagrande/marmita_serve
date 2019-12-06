package com.marmitex.service.serviceImpl;

import com.marmitex.data.TipoComidaData;
import com.marmitex.framework.CrudServiceImpl;
import com.marmitex.model.Tipo;
import com.marmitex.model.TipoComida;
import com.marmitex.service.TipoComidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoComidaServiceImpl extends CrudServiceImpl<TipoComida, Long> implements TipoComidaService {

    @Autowired
    private TipoComidaData tipoComidaData;

    @Override
    public JpaRepository<TipoComida, Long> getRepository() {
        return tipoComidaData;
    }
}
