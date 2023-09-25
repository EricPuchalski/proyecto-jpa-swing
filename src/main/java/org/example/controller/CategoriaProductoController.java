/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.controller;

import java.util.List;
import org.example.model.CategoriaProducto;
import org.example.service.CategoriaProductoService;

/**
 *
 * @author ericp
 */
public class CategoriaProductoController {
    private CategoriaProductoService categoriaProductoService;

    public CategoriaProductoController(CategoriaProductoService categoriaProductoService) {
        this.categoriaProductoService = categoriaProductoService;
    }
    
    public List<CategoriaProducto> findAll(){
        return categoriaProductoService.findAll();
    }
    
    public CategoriaProducto  findByName(String nombre){
        CategoriaProducto cPEncontrado = null;
        for(CategoriaProducto cP: this.findAll())
            if (cP.getNombre().equals(nombre) ) {
                cPEncontrado = cP;
        }
        return cPEncontrado;
    }
    
}
