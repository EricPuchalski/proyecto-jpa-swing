package org.example.controller;

import org.example.model.Transportista;

import java.util.List;
import org.example.service.TransportistaService;

public class TransportistaController {
    private TransportistaService transportistaService;

    public TransportistaController(TransportistaService transportistaService) {
        this.transportistaService = transportistaService;
    }

    public void create(Transportista transportista){
        transportistaService.save(transportista);
    }

    public Transportista findOne(Long id){
        return transportistaService.findOne(id);
    }

    public void delete(Long id){
        transportistaService.delete(id);
    }

    public List<Transportista> findAll(){
       return transportistaService.findAll();
    }

    public void upDate(Transportista transportista) {
        transportistaService.upDate(transportista);
    }

}
