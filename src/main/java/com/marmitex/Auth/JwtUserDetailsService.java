package com.marmitex.Auth;

import com.marmitex.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired private ClienteService clienteService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var cliente = clienteService.findBycpf(username);
        if(cliente == null){
            throw new UsernameNotFoundException("Usuário não encontrado");
        }
        return cliente;
    }
}
