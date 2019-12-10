package com.marmitex.data;

import com.marmitex.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredienteData extends JpaRepository<Ingrediente, Long> {

    List<Ingrediente> findByInativoFalse();
}
