package com.marmitex.service.serviceImpl;

import com.marmitex.data.TamanhoData;
import com.marmitex.framework.CrudServiceImpl;
import com.marmitex.model.Tamanho;
import com.marmitex.service.TamanhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TamanhoServiceImpl extends CrudServiceImpl<Tamanho, Long> implements TamanhoService {

    @Autowired
    private TamanhoData tamanhoData;

    @Override
    public JpaRepository<Tamanho, Long> getRepository() {
        return tamanhoData;
    }
}
