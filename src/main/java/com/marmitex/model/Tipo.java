package com.marmitex.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@Table(name = "TIPO")
@ToString(of = "id")
public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TIPO_COMIDA", length = 100, nullable = false)
    private String tipoComida;

    @Column(name = "INATIVO")
    private boolean inativo = false;
}
