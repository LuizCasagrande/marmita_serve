package com.marmitex.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "COMIDAS")
public class Comida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "COMIDA", nullable = false)
    private String comida;

    @JsonManagedReference
    @OneToMany(mappedBy = "ingrediente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ComidaIngrediente> ingredientesList = new ArrayList<>();

    @JsonManagedReference
    @OneToMany(mappedBy = "tipo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TipoComida> tipoList = new ArrayList<>();

    @Column(name = "INATIVO")
    private boolean inativo;
}
