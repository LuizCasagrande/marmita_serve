package com.marmitex.data;

import com.marmitex.model.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoData extends JpaRepository<Tipo, Long> {
}
