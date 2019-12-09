package com.marmitex.service.serviceImpl;

import com.marmitex.data.DetestadaData;
import com.marmitex.framework.CrudServiceImpl;
import com.marmitex.model.Detestada;
import com.marmitex.service.DetestadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DetestadaServiceImpl extends CrudServiceImpl<Detestada, Long> implements DetestadaService {

    @Autowired private DetestadaData detestadaData;

    @Override
    public JpaRepository<Detestada, Long> getRepository() {
        return detestadaData;
    }
}
