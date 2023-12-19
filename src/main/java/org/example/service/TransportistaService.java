package org.example.service;


import org.example.model.Deposito;
import org.example.model.Transportista;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.example.dao.TransportistaJpaController;
import org.example.dao.exceptions.NonexistentEntityException;

public class TransportistaService{

    private TransportistaJpaController transportistaJpaController;


    public TransportistaService(TransportistaJpaController transportistaJpaController) {
        this.transportistaJpaController = transportistaJpaController;
    }


    public void save(Transportista transportista) {
        transportistaJpaController.create(transportista);
    }


    public void upDate(Transportista transportista) {
        try {
            transportistaJpaController.edit(transportista);
        } catch (Exception ex) {
            Logger.getLogger(TransportistaService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public Transportista findOne(Long id) {
        return transportistaJpaController.findTransportista(id);
    }



    public List<Transportista> findAll() {
        return transportistaJpaController.findTransportistaEntities();
    }


    public void delete(Long id) {
        try {
            transportistaJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(TransportistaService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}