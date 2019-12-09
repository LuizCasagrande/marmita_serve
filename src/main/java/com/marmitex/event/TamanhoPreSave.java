package com.marmitex.event;

import com.marmitex.model.Pedido;
import com.marmitex.model.Tamanho;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class TamanhoPreSave extends ApplicationEvent {
    @Getter
    private Tamanho tamanho;

    public TamanhoPreSave(Object source, Tamanho tamanho) {
        super(source);
        this.tamanho = tamanho;
    }
}
