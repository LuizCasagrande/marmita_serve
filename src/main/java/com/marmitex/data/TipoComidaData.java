package com.marmitex.data;

import com.marmitex.model.Tipo;
import com.marmitex.model.TipoComida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoComidaData extends JpaRepository<TipoComida, Long> {
}
