package com.marmitex.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "COMIDAS")
@ToString(of = "id")
public class Comida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "COMIDA", nullable = false)
    private String comida;

    @JsonManagedReference
    @OneToMany(mappedBy = "comida", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ComidaIngrediente> ingredientesList = new ArrayList<>();

    @JsonManagedReference
    @OneToMany(mappedBy = "comida", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TipoComida> tipoList = new ArrayList<>();

    @Column(name = "INATIVO")
    private boolean inativo;
}
