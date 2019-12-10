package com.marmitex.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@Table(name = "PEDIDO_TAMANHO")
@ToString(of = "id")
public class TamanhoPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_TAMANHO")
    private Tamanho tamanho;

    @JsonBackReference
    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_PEDIDO")
    private Pedido pedido;

    @Column(name = "QUANTIDADE")
    private Integer quantidade;

    @Column(name = "PRECO")
    private Double preco;

}
