package com.marmitex.data;

import com.marmitex.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface PedidoData extends JpaRepository<Pedido, Long> {

    @Transactional
    @Modifying
    @Query("UPDATE Pedido SET pago = true WHERE id = :id")
    void setPago(@Param("id") Long id);

    @Transactional
    @Modifying
    @Query("UPDATE Pedido SET status = true WHERE id = :id")
    void setCancelado(@Param("id") Long id);
}
