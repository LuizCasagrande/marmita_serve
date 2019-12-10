package com.marmitex.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TAMANHOS")
@ToString(of = "id")
public class Tamanho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PESO_MARMITA" , nullable = false)
    private Double peso;

    @Column(name = "INATIVO")
    private boolean inativo = false;

    @Column(name = "PRECO")
    private Double preco;
}
