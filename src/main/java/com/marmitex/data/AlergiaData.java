package com.marmitex.data;

import com.marmitex.model.Alergia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlergiaData extends JpaRepository<Alergia, Long> {
}
