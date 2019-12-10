package com.marmitex.data;

import com.marmitex.model.Comida;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComidaData extends JpaRepository<Comida, Long> {

    List<Comida> findByInativoFalse();
}
