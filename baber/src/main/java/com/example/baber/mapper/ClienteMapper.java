package com.example.baber.mapper;

import com.example.baber.controller.request.ClienteCadastroRequest;
import com.example.baber.controller.response.ClienteCadastroResponse;
import com.example.baber.entities.Cliente;

public class ClienteMapper {

    public static Cliente clienteCadastroRequestToCliente(ClienteCadastroRequest clienteCadastroRequest){
           Cliente cliente = new Cliente();
           cliente.setNomeCompleto(clienteCadastroRequest.getNomeCompleto());
           cliente.setEmail(clienteCadastroRequest.getEmail());
           cliente.setSenha(clienteCadastroRequest.getSenha());
           return cliente;
    }


    public static ClienteCadastroResponse clienteToClienteCadastroResponse(Cliente cliente){
        ClienteCadastroResponse clienteCadastroResponse = new ClienteCadastroResponse();
        clienteCadastroResponse.setEmail(cliente.getEmail());
        clienteCadastroResponse.setNomeCompleto(cliente.getNomeCompleto());
        return clienteCadastroResponse;
    }
}
