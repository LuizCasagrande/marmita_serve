package com.marmitex.service.serviceImpl;

import com.marmitex.data.TipoData;
import com.marmitex.framework.CrudServiceImpl;
import com.marmitex.model.Tipo;
import com.marmitex.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoServiceImpl extends CrudServiceImpl<Tipo, Long> implements TipoService {

    @Autowired
    private TipoData tipoData;

    @Override
    public JpaRepository<Tipo, Long> getRepository() {
        return tipoData;
    }
}
