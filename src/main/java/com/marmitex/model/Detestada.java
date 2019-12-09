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
}
