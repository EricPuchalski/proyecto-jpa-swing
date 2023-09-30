/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.service;

import java.util.List;
import org.example.dao.TipoTransportistaJpaController;
import org.example.model.TipoTransportista;

/**
 *
 * @author ericp
 */
public class TipoTransportistaService {
    private TipoTransportistaJpaController tipoTransportistaJpaController;

    public TipoTransportistaService(TipoTransportistaJpaController tipoTransportistaJpaController) {
        this.tipoTransportistaJpaController = tipoTransportistaJpaController;
    }
    
    
    
    public List<TipoTransportista> findAll(){
        return tipoTransportistaJpaController.findTipoTransportistaEntities();
    }
    
}
