/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.service;

import org.example.dao.LineaPedidoJpaController;
import org.example.model.LineaPedido;

/**
 *
 * @author ericp
 */
public class LineaPedidoService {
    private LineaPedidoJpaController lineaPedidoJpaController;

    public LineaPedidoService(LineaPedidoJpaController lineaPedidoJpaController) {
        this.lineaPedidoJpaController = lineaPedidoJpaController;
    }
    
    
    
    public void crearLineaPedido(LineaPedido lineaPedido){
        lineaPedidoJpaController.create(lineaPedido);
    }
    
}
