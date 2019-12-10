package com.marmitex.service;

import com.marmitex.framework.CrudService;
import com.marmitex.model.Comida;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ComidaService extends CrudService<Comida, Long> {
    List<Comida> findByInativoFalse();
}
