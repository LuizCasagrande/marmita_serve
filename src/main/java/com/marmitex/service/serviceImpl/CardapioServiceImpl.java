package com.marmitex.service.serviceImpl;

import com.marmitex.data.CardapioData;
import com.marmitex.framework.CrudServiceImpl;
import com.marmitex.model.Cardapio;
import com.marmitex.service.CardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Service
public class CardapioServiceImpl extends CrudServiceImpl<Cardapio, Long> implements CardapioService {

    @Autowired
    private CardapioData cardapioData;

    @Override
    public JpaRepository<Cardapio, Long> getRepository() {
        return cardapioData;
    }

    @Override
    public void preSave(Cardapio entity) {
        if (entity.isInativo()){
            cardapioData.updateInativoByDiaSemana(entity.getDiaSemana());
        }
    }

    @Override
    public Cardapio save(Cardapio entity) {
        preSave(entity);
        return super.save(entity);
    }

    @Override
    public List<Cardapio> findByInativoFalse() {
        return cardapioData.findByInativoFalse();
    }


}
