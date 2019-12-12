package com.marmitex.listener;

import com.marmitex.event.TamanhoPreSave;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class ValidaPesoDaMarmita implements ApplicationListener<TamanhoPreSave> {

    private static final Double PESO_MAXIMO = 5000D;

    @Override
    public void onApplicationEvent(TamanhoPreSave tamanhoPreSave) {
        var tamanhoPedido = tamanhoPreSave.getTamanho().getPeso();
        if (tamanhoPedido >= PESO_MAXIMO) {
            throw new RuntimeException("O peso não pode  exeder 5 Kg");
        }
    }
}
