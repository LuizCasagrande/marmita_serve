package com.marmitex.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.marmitex.Enum.DiaSemana;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "CARDAPIO")
@ToString(of = "id")
public class Cardapio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CARDAPIO")
    private String cardapio;

    @Column(name = "INATIVO")
    private boolean inativo = false;

    @Enumerated(EnumType.STRING)
    @Column(name = "DIA_SEMANA")
    private DiaSemana diaSemana;

    @JsonManagedReference
    @OneToMany(mappedBy = "cardapio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CardapioComida> cardapioComidaList = new ArrayList<>();

}
