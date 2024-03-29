package com.marmitex.model;

import ch.qos.logback.core.net.server.Client;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ALERGIA")
@ToString(of = "id")
public class Alergia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", nullable = false)
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "ID_INGREDIENTE", nullable = false)
    private Ingrediente ingrediente;

}
