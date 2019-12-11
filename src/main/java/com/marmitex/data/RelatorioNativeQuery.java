package com.marmitex.data;

import com.marmitex.model.RelatorioPedidoCliente;
import com.marmitex.model.RelatorioPedidoEmpresa;
import io.github.gasparbarancelli.NativeQuery;

import java.util.List;

public interface RelatorioNativeQuery extends NativeQuery {

    List<RelatorioPedidoEmpresa> relatorioPedidoEmpresa();

    List<RelatorioPedidoCliente> relatorioPedidoCliente();

}
