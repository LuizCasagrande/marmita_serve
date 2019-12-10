package com.marmitex.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "COMIDA_INGREDIENTES")
@ToString(of = "id")
public class ComidaIngrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_INGREDIENTES")
    private Ingrediente ingrediente;

    @JsonBackReference
    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_COMIDA")
    private Comida comida;
}
