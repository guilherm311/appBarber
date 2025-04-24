package com.example.baber.service;


import com.example.baber.controller.request.ClienteCadastroRequest;
import com.example.baber.controller.response.ClienteCadastroResponse;
import com.example.baber.entities.Cliente;
import lombok.RequiredArgsConstructor;
import com.example.baber.mapper.ClienteMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.example.baber.repository.ClienteRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository rep;

    public ClienteCadastroResponse cadastrarCliente(ClienteCadastroRequest clienteCadastroRequest){
        Cliente cliente = ClienteMapper.clienteCadastroRequestToCliente(clienteCadastroRequest);

        Optional<Cliente> clienteOptional = this.rep.findByEmail(cliente.getEmail());
        if(clienteOptional.isPresent()){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "usuário já existe no banco de dados");
        }
        Cliente clienteSalvo = rep.save(cliente);
        ClienteCadastroResponse clienteCadastroResponse = ClienteMapper.clienteToClienteCadastroResponse(clienteSalvo);
        return clienteCadastroResponse;
    }


}
