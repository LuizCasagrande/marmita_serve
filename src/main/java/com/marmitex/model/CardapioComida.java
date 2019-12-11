package com.marmitex.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "CARDAPIO_COMIDA")
public class CardapioComida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonBackReference
    @OneToMany(mappedBy = "comida", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comida> comidaList = new ArrayList<>();

    @ManyToOne
    private Cardapio cardapio;

}
