package com.marmitex.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.marmitex.config.LocalDateDeserializer;
import com.marmitex.config.LocalDateSerializer;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "PEDIDO")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id ;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Column(name = "DATA")
    private LocalDate data;

    @JsonManagedReference
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TamanhoPedido> tamanhoPedidoList = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "ID_CLIENTE", nullable = false)
    private Cliente cliente;

}
