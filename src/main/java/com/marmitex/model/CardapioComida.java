package com.marmitex.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CARDAPIO_COMIDA")
public class CardapioComida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonBackReference
    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_CARDAPIO")
    private Cardapio cardapio;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_COMIDA")
    private Comida comida;

}
