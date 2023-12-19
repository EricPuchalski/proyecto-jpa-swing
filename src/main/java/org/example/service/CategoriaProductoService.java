/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.service;

import java.util.List;
import org.example.dao.CategoriaProductoJpaController;
import org.example.model.CategoriaProducto;

/**
 *
 * @author ericp
 */
public class CategoriaProductoService {
    private CategoriaProductoJpaController categoriaProductoJpaController;

    public CategoriaProductoService(CategoriaProductoJpaController categoriaProductoJpaController) {
        this.categoriaProductoJpaController = categoriaProductoJpaController;
    }
    
    public List<CategoriaProducto> findAll(){
        return categoriaProductoJpaController.findCategoriaProductoEntities();
    }
    
}
