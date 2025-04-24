package com.example.baber.controller;


import com.example.baber.controller.request.ClienteCadastroRequest;
import com.example.baber.controller.response.ClienteCadastroResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import com.example.baber.service.ClienteService;

@RestController
@RequestMapping("/api/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping("/cadastrar")
    public ResponseEntity<ClienteCadastroResponse> cadastrarCliente(@Valid @RequestBody ClienteCadastroRequest clienteCadastroRequest) throws ResponseStatusException {
        ClienteCadastroResponse clienteCadastroResponse = this.clienteService.cadastrarCliente(clienteCadastroRequest);
        return ResponseEntity.status(201).body(clienteCadastroResponse);
    }

}
