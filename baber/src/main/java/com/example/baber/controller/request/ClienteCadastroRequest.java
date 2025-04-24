package com.example.baber.controller.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteCadastroRequest {

    private String nomeCompleto;
    private String email;
    private String senha;

    public ClienteCadastroRequest(){}

    public ClienteCadastroRequest(String nomeCompleto, String email, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
    }
}
