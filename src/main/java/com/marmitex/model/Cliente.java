package com.marmitex.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@Entity
@Table(name = "CLIENTES")
@ToString(of = "id")
public class Cliente implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME", nullable = false, length = 100)
    private String nome;

    @Column(name = "ADMIN", nullable = false)
    private boolean admin = false;

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

    @PrePersist
    public void preInsert(){
        this.senha = new BCryptPasswordEncoder().encode(this.senha);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        if(admin){
            authorities.add((GrantedAuthority) () -> "ADMIN");
        }else{
            authorities.add((GrantedAuthority) () -> "CLIENTE");
        }
        return authorities;
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
