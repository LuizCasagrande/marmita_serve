package com.marmitex.service;

import com.marmitex.framework.CrudService;
import com.marmitex.model.Cliente;

public interface ClienteService extends CrudService<Cliente, Long> {

    Cliente findBycpf(String cpf);
}
