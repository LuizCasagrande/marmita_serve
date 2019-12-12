package com.marmitex.data;

import com.marmitex.model.RelatorioPedidoCliente;
import com.marmitex.model.RelatorioPedidoEmpresa;
import io.github.gasparbarancelli.NativeQuery;
import io.github.gasparbarancelli.NativeQueryParam;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RelatorioNativeQuery extends NativeQuery {

    List<RelatorioPedidoEmpresa> relatorioPedidoEmpresa();

    List<RelatorioPedidoCliente> relatorioPedidoCliente(@NativeQueryParam("id") Long id);

    Number TotalAPagar();

}
