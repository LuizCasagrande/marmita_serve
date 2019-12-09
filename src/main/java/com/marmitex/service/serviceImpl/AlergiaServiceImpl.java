package com.marmitex.service.serviceImpl;

import com.marmitex.data.AlergiaData;
import com.marmitex.framework.CrudServiceImpl;
import com.marmitex.model.Alergia;
import com.marmitex.model.Cardapio;
import com.marmitex.service.AlergiaService;
import com.marmitex.service.CardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AlergiaServiceImpl extends CrudServiceImpl<Alergia, Long> implements AlergiaService {

    @Autowired private AlergiaData alergiaData;

    @Override
    public JpaRepository<Alergia, Long> getRepository() {
        return alergiaData;
    }
}
