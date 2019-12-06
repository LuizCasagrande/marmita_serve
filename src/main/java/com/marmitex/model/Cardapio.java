package com.marmitex.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CARDAPIO")
public class Cardapio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CARDAPIO")
    private String cardapio;

    @Column(name = "INATIVO")
    private boolean inativo = false;
}
