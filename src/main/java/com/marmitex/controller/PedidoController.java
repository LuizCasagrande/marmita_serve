package com.marmitex.controller;

import com.marmitex.framework.CrudRestController;
import com.marmitex.framework.CrudService;
import com.marmitex.model.Pedido;
import com.marmitex.service.PedidoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("pedido")
public class PedidoController extends CrudRestController<Pedido, Long> {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @Override
    public CrudService<Pedido, Long> getService() {
        return pedidoService;
    }

    @GetMapping("pago/{id}")
    public void setPago(@PathVariable("id") Integer id){
        pedidoService.setPago(id);
    }

    @GetMapping("cancelado/{id}")
    public void setCancelado(@PathVariable("id") Integer id){
        pedidoService.setCancelado(id);
    }

    @Override
    @GetMapping("{query}")
    public Optional<Pedido> findById(@PathVariable("query") Long aLong) {
        return super.findById(aLong);
    }
}
