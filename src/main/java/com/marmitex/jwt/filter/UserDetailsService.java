package com.marmitex.jwt.filter;

import com.marmitex.model.Cliente;
import com.marmitex.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired private ClienteService clienteService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Cliente cliente = clienteService.findBycpf(s);
        if(cliente == null){
            throw new UsernameNotFoundException("Usuario não encontrado");
        }
        return cliente;
    }
}
