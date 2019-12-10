package com.marmitex.data;

import com.marmitex.model.Tamanho;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TamanhoData extends JpaRepository<Tamanho, Long> {

    List<Tamanho> findByInativoFalse();
}
