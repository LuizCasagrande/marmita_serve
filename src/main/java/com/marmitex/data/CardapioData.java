package com.marmitex.data;

import com.marmitex.model.Cardapio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CardapioData extends JpaRepository<Cardapio, Long> {

    List<Cardapio> findByInativoFalse();
}
