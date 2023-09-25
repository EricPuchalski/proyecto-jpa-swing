package org.example.service;

import org.example.model.Deposito;
import org.example.model.Producto;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.example.dao.ProductoJpaController;
import org.example.dao.exceptions.NonexistentEntityException;

public class ProductoService {
    private ProductoJpaController productoJpaController;

    public ProductoService(ProductoJpaController productoJpaController) {
        this.productoJpaController = productoJpaController;
    }

    public void save(Producto producto) {
        productoJpaController.create(producto);
    }

    public List<Producto> findAll() {
        return productoJpaController.findProductoEntities();
    }



    public Producto findOne(Long id) {
        return productoJpaController.findProducto(id);
    }


    public void upDate(Producto producto) {
        try {
            productoJpaController.edit(producto);
        } catch (Exception ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(Long id) {
        try {
            productoJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
