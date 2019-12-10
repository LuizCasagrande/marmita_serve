package com.marmitex.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
@Data
@Entity
@Table(name = "INGREDIENTES")
@ToString(of = "id")
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "INGREDIENTES", nullable = false, length = 100)
    private String ingredientes;

    @Column(name = "INATIVO")
    private boolean inativo = false;

}
