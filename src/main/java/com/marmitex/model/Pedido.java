package com.marmitex.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.marmitex.Enum.DiaSemana;
import com.marmitex.config.LocalDateDeserializer;
import com.marmitex.config.LocalDateSerializer;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "PEDIDO")
@ToString(of = "id")
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

    @OneToOne
    @JoinColumn(name = "ID", nullable = false)
    private Cardapio cardapio;

    @Column(name = "STATUS")
    private boolean status = false;

    @Column(name = "PAGO")
    private boolean pago = false;

    @Enumerated(EnumType.STRING)
    @Column(name = "DIA_SEMANA")
    private DiaSemana diaSemana;

    @PrePersist
    public void preSave() {
        var dataAtual = LocalDate.now();
        if (diaSemana.getDia() < dataAtual.getDayOfWeek().getValue()) {
            throw new RuntimeException("Não é possivel fazer um pedido para data menor que atual");
        }

        var diferencaDias = diaSemana.getDia() - dataAtual.getDayOfWeek().getValue();
        data = dataAtual.plusDays(diferencaDias);
    }
}

