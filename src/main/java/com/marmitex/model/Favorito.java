package com.marmitex.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "FAVORITO")
public class Favorito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "ID", nullable = false)
    private Comida comida;
}
