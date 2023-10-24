/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.controller;

import org.example.model.LineaPedido;
import org.example.service.LineaPedidoService;

/**
 *
 * @author ericp
 */
public class LineaPedidoController {
    private LineaPedidoService lineaPedidoService;

    public LineaPedidoController(LineaPedidoService lineaPedidoService) {
        this.lineaPedidoService = lineaPedidoService;
    }
    
    public void create(LineaPedido lineaPedido){
        lineaPedidoService.crearLineaPedido(lineaPedido);
    }
    
}
