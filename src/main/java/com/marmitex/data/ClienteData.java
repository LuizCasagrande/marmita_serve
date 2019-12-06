package com.marmitex.data;

import com.marmitex.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteData extends JpaRepository<Cliente, Long> {

    Cliente findBycpf(String cpf);
}
