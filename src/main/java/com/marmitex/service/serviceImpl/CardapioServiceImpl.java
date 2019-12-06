package com.marmitex.service.serviceImpl;

import com.marmitex.data.CardapioData;
import com.marmitex.framework.CrudServiceImpl;
import com.marmitex.model.Cardapio;
import com.marmitex.service.CardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CardapioServiceImpl extends CrudServiceImpl<Cardapio, Long> implements CardapioService {

    @Autowired
    private CardapioData cardapioData;

    @Override
    public JpaRepository<Cardapio, Long> getRepository() {
        return cardapioData;
    }
}
