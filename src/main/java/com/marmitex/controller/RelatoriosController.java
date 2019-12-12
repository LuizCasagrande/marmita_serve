package com.marmitex.controller;

import com.marmitex.data.RelatorioNativeQuery;
import com.marmitex.model.Cliente;
import com.marmitex.model.RelatorioPedidoCliente;
import com.marmitex.model.RelatorioPedidoEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("relatorio")
public class RelatoriosController {

    @Autowired private RelatorioNativeQuery relatorioNativeQuery;

    @GetMapping("pedido-empresa")
    public List<RelatorioPedidoEmpresa> relatorioPedidoEmpresa() {
        return relatorioNativeQuery.relatorioPedidoEmpresa();
    }

    @GetMapping("pedido-cliente")
    public List<RelatorioPedidoCliente> relatorioPedidoCliente() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Cliente cliente = (Cliente) authentication.getPrincipal();

        return relatorioNativeQuery.relatorioPedidoCliente(cliente.getId());
    }

    @GetMapping("total-a-pagar")
    public Number relatorioPedidoClienteTotalAPagar() {
        return relatorioNativeQuery.relatorioPedidoClienteTotalAPagar();
    }
    @GetMapping("total-pago")
    public Number relatorioPedidoClienteTotalPago() {
        return relatorioNativeQuery.relatorioPedidoClienteTotalPago();
    }


}
