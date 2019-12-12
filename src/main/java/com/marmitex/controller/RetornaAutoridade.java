package com.marmitex.controller;

import com.marmitex.model.Cliente;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("autoridade")
public class RetornaAutoridade {

    @GetMapping("autoridade")
    private boolean retornaAutoridade(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Cliente user = (Cliente) authentication.getPrincipal();]
        return user.isAdmin();
    }
}
