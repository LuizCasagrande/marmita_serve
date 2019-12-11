package com.marmitex.controller;

import com.marmitex.framework.CrudRestController;
import com.marmitex.framework.CrudService;
import com.marmitex.model.Cardapio;
import com.marmitex.service.CardapioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cardapio")
public class CardapioController extends CrudRestController<Cardapio, Long> {

    private final CardapioService cardapioService;

    public CardapioController(CardapioService cardapioService) {
        this.cardapioService = cardapioService;
    }

    @Override
    public CrudService<Cardapio, Long> getService() {
        return cardapioService;
    }

    @GetMapping("ativos")
    public List<Cardapio> ingredienteListAtivos(){
        return cardapioService.findByInativoFalse();
    }

}
