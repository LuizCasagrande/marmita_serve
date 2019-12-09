package com.marmitex.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "DETESTADO")
public class Detestada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "ID_COMIDA", nullable = false)
    private Comida comida;
}
