package com.marmitex.event;

import com.marmitex.model.Pedido;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class PedidoPreSave extends ApplicationEvent {

    @Getter
    private Pedido pedido;

    public PedidoPreSave(Object source, Pedido pedido) {
        super(source);
        this.pedido = pedido;
    }

}
