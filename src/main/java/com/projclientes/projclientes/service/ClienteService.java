package com.projclientes.projclientes.service;

import com.projclientes.projclientes.model.Cliente;
import com.projclientes.projclientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }
}
