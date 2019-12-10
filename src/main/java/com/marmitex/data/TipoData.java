package com.marmitex.data;

import com.marmitex.model.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipoData extends JpaRepository<Tipo, Long> {

    List<Tipo> findByInativoFalse();

}
