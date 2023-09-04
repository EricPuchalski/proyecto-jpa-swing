package org.example.service;

import org.example.dao.ClienteJpaController;
import org.example.dao.exceptions.NonexistentEntityException;
import org.example.model.Cliente;
import org.example.model.Deposito;
import org.example.repository.ClienteRepository;
import org.example.util.EntityManagerFactoryUTIL;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class  ClienteService{
    private ClienteRepository clienteRepository;
    ClienteJpaController clienteJpaController = new ClienteJpaController(EntityManagerFactoryUTIL.getEntityManagerFactory());

    public ClienteService(ClienteRepository clienteRepository ){
        this.clienteRepository = clienteRepository;

    }
    public void save(Cliente cliente){
            clienteJpaController.create(cliente);
    }


    public List<Cliente>findAll(){
        return clienteJpaController.findClienteEntities();
    }


    public Cliente findOne(Long id){

        return clienteJpaController.findCliente(id);


    }
    public void edit(Cliente cliente){
        try {
            clienteJpaController.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ClienteService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public void upDate(Cliente cliente){
//        if(findOne(cliente.getCuit()) != null){
//            clienteRepository.upDate(cliente);
//        }
//    }
    public void delete(Long id){

        try {
            clienteJpaController.destroy(id);
        } catch (NonexistentEntityException e) {
            throw new RuntimeException(e);
        }

    }
}

