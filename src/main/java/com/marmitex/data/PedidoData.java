package com.marmitex.data;

import com.marmitex.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoData extends JpaRepository<Pedido, Long> {
}
