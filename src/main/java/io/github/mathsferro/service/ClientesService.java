package io.github.mathsferro.service;

import io.github.mathsferro.model.Cliente;
import io.github.mathsferro.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClienteRepository repository;

    public ClientesService ( ClienteRepository repository ) {
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        this.repository.persist(cliente);
    }

    public void validarCliente(Cliente cliente) {
        // Aplica validação
    }


}
