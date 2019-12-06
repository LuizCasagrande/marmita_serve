package com.marmitex.data;

import com.marmitex.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteData extends JpaRepository<Ingrediente, Long> {
}
