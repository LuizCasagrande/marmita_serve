package com.marmitex.data;

import com.marmitex.Enum.DiaSemana;
import com.marmitex.model.Cardapio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CardapioData extends JpaRepository<Cardapio, Long> {

    List<Cardapio> findByInativoFalse();

    @Transactional
    @Modifying
    @Query("UPDATE Cardapio set inativo = true where diaSemana = :diaSemana")
    void updateInativoByDiaSemana(@Param("diaSemana")DiaSemana diaSemana);
}
