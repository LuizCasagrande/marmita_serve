package com.marmitex.service;

import com.marmitex.framework.CrudService;
import com.marmitex.model.Comida;
import org.springframework.stereotype.Service;

@Service
public interface ComidaService extends CrudService<Comida, Long> {
}
