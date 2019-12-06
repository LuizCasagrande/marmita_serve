package com.marmitex.data;

import com.marmitex.model.Cardapio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardapioData extends JpaRepository<Cardapio, Long> {
}
