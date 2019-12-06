package com.marmitex.service.serviceImpl;

import com.marmitex.data.ComidaData;
import com.marmitex.framework.CrudServiceImpl;
import com.marmitex.model.Comida;
import com.marmitex.service.ComidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ComidaServiceImpl extends CrudServiceImpl<Comida, Long> implements ComidaService {

    @Autowired
    private ComidaData comidaData;

    @Override
    public JpaRepository<Comida, Long> getRepository() {
        return comidaData;
    }
}
