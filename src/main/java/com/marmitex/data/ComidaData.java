package com.marmitex.data;

import com.marmitex.model.Comida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComidaData extends JpaRepository<Comida, Long> {
}
