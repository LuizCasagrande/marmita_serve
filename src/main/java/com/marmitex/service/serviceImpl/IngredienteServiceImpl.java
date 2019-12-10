package com.marmitex.service.serviceImpl;

import com.marmitex.data.IngredienteData;
import com.marmitex.framework.CrudServiceImpl;
import com.marmitex.model.Ingrediente;
import com.marmitex.service.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class IngredienteServiceImpl extends CrudServiceImpl<Ingrediente, Long> implements IngredienteService {

    @Autowired private IngredienteData ingredienteData;

    @Override
    public JpaRepository<Ingrediente, Long> getRepository() {
        return ingredienteData;
    }

    @Override
    public List<Ingrediente> findByInativoFalse() {
        return ingredienteData.findByInativoFalse();
    }
}
