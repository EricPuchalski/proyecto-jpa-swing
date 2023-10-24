package org.example.controller;

import org.example.model.Cliente;
import org.example.service.ClienteService;

import java.util.List;

public class ClienteController{

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public Cliente findOne(Long id){
        return clienteService.findOne(id);

    }

    public List<Cliente> findAll() {
        return clienteService.findAll();
    }


    public void delete(Long id) {
        clienteService.delete(id);
    }

    public  void create(Cliente cliente){
        clienteService.save(cliente);
    }
    
    public void edit(Cliente cliente){
        clienteService.edit(cliente);
    }
    public List<Cliente> buscarPorCuitParcial(String cuit){
        return clienteService.buscarPorCuitParcial(cuit);
    }
//    public void upDate(Cliente cliente) {
//        clienteService.upDate(cliente);
//    }
}
