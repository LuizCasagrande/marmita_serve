package com.marmitex.data;

import com.marmitex.Enum.DiaSemana;
import com.marmitex.model.RelatorioPedidoCliente;
import com.marmitex.model.RelatorioPedidoEmpresa;
import io.github.gasparbarancelli.NativeQuery;
import io.github.gasparbarancelli.NativeQueryParam;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface RelatorioNativeQuery extends NativeQuery {

    List<RelatorioPedidoEmpresa> relatorioPedidoEmpresa(@NativeQueryParam("diaSemana") String diaSemana);

    List<RelatorioPedidoCliente> relatorioPedidoCliente(@NativeQueryParam("id") Long id,
                                                        @NativeQueryParam("dataInicial") LocalDate dataInicial,
                                                        @NativeQueryParam("dataFinal") LocalDate dataFinal);

    Number relatorioPedidoClienteTotalAPagar(@NativeQueryParam("id") Long id,
                                             @NativeQueryParam("dataInicial") LocalDate dataInicial,
                                             @NativeQueryParam("dataFinal") LocalDate dataFinal);

    Number relatorioPedidoClienteTotalPago(@NativeQueryParam("id") Long id,
                                           @NativeQueryParam("dataInicial") LocalDate dataInicial,
                                           @NativeQueryParam("dataFinal") LocalDate dataFinal);

}
