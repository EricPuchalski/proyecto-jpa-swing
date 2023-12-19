/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.controller;

import java.util.List;
import org.example.model.TipoTransportista;
import org.example.service.TipoTransportistaService;

/**
 *
 * @author ericp
 */
public class TipoTransportistaController {
    private TipoTransportistaService tipoTransportistaService;

    public TipoTransportistaController(TipoTransportistaService tipoTransportistaService) {
        this.tipoTransportistaService = tipoTransportistaService;
    }
    
    public List<TipoTransportista> findAll(){
        return tipoTransportistaService.findAll();
    }
    
        public TipoTransportista  findByName(String nombre){
        TipoTransportista tipoEncontrado = null;
        for(TipoTransportista tT: this.findAll())
            if (tT.getDescripcion().equals(nombre) ) {
                tipoEncontrado = tT;
        }
        return tipoEncontrado;
    }
}
