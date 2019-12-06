package com.marmitex.listener;

import com.marmitex.event.PedidoPreSave;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ValidaDataParaPedido implements ApplicationListener<PedidoPreSave> {
    private  final LocalDateTime horaPedido =  LocalDateTime.now();
    @Override
    public void onApplicationEvent(PedidoPreSave pedidoPreSave) {
        if (horaPedido.getHour() >= 10) {
            throw new RuntimeException("Ops! Os pedidos para hoje foram encerrados. " +
                    "Para melhor atender nossos clientes aceitamos pedidos até as 10h.");
        }
    }
}


