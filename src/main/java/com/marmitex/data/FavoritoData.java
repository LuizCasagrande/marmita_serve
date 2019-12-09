package com.marmitex.data;

import com.marmitex.model.Favorito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoritoData extends JpaRepository<Favorito, Long> {
}
