package com.example.baber.entities;


import lombok.*;
import jakarta.persistence.*;


@Setter
@Getter
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeCompleto;
    private String email;
    private String senha;

    public Cliente(){
    }

    public Cliente(String nomeCompleto, String email, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
    }
}
