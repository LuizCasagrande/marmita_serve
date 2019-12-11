package com.marmitex.Enum;

import lombok.Getter;

public enum DiaSemana {
    SEGUNDA(1),
    TERCA(2),
    QUARTA(3),
    QUINTA(4),
    SEXTA(5);

    @Getter
    private Integer dia;


    DiaSemana(Integer dia) {
        this.dia = dia;
    }
}
