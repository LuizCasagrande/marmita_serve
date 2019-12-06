package com.marmitex.model;

import com.marmitex.jwt.filter.UserCredentials;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "CLIENTES")
public class Cliente implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME", nullable = false, length = 100)
    private String nome;

    @Column(name = "ADMIN", nullable = false)
    private boolean admin;

    @Column(name = "CPF", nullable = false, length = 11)
    private String cpf;

    @Column(name = "TELEFONE", nullable = false, length = 11)
    private String telefone;

    @Column(name = "SENHA", nullable = false, length = 10)
    private String senha;

    @Column(name = "CEP", nullable = false, length = 8)
    private String cep;

    @Column(name = "LOGRADOURO", nullable = false, length = 100)
    private String logradouro;

    @Column(name = "NUMERO", nullable = false)
    private Integer numero;

    @Column(name = "BAIRRO", nullable = false, length = 100)
    private String bairro;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.cpf;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
