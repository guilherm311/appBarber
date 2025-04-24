package com.example.baber.controller.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteCadastroResponse {

    String nomeCompleto;
    String email;

    public ClienteCadastroResponse() {
    }

    public ClienteCadastroResponse(String nomeCompleto, String email) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
    }
}
