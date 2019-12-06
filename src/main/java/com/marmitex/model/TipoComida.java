package com.marmitex.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "COMIDA_TIPO")
public class TipoComida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonBackReference
    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_COMIDA")
    private Comida comida;

    @OneToOne(optional = false)
    @JoinColumn(name = "ID_TIPO", referencedColumnName = "id")
    private Tipo tipo;
}
