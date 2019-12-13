package com.marmitex.controller;

import com.marmitex.Enum.DiaSemana;
import com.marmitex.data.RelatorioNativeQuery;
import com.marmitex.model.Cliente;
import com.marmitex.model.RelatorioPedidoCliente;
import com.marmitex.model.RelatorioPedidoEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("relatorio")
public class RelatoriosController {

    @Autowired private RelatorioNativeQuery relatorioNativeQuery;


    @GetMapping("pedido-empresa")
    public List<RelatorioPedidoEmpresa> relatorioPedidoEmpresa(@RequestParam("diaSemana") DiaSemana diaSemana) {
        return relatorioNativeQuery.relatorioPedidoEmpresa();
    }

    @GetMapping("pedido-cliente")
    public List<RelatorioPedidoCliente> relatorioPedidoCliente(@RequestParam("dataInicial")LocalDate dataInicial, @RequestParam("dataFinal")LocalDate dataFinal) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Cliente cliente = (Cliente) authentication.getPrincipal();

        return relatorioNativeQuery.relatorioPedidoCliente(cliente.getId(), dataInicial, dataFinal);
    }

    @GetMapping("total-a-pagar")
    public Number relatorioPedidoClienteTotalAPagar(@RequestParam("dataInicial")LocalDate dataInicial, @RequestParam("dataFinal")LocalDate dataFinal) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Cliente cliente = (Cliente) authentication.getPrincipal();
        return relatorioNativeQuery.relatorioPedidoClienteTotalAPagar(cliente.getId(), dataInicial, dataFinal);
    }
    @GetMapping("total-pago")
    public Number relatorioPedidoClienteTotalPago(@RequestParam("dataInicial")LocalDate dataInicial, @RequestParam("dataFinal")LocalDate dataFinal) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Cliente cliente = (Cliente) authentication.getPrincipal();
        return relatorioNativeQuery.relatorioPedidoClienteTotalPago(cliente.getId(), dataInicial, dataFinal);
    }


}
