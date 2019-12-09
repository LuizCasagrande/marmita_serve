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

}
