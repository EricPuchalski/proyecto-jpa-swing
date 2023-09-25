package org.example.controller;

import org.example.model.Producto;
import org.example.model.Proveedor;
import org.example.service.ProductoService;

import java.util.List;

public class ProductoController{
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }



    public void create(Producto producto){
        productoService.save(producto);
    }

    public Producto findOne(Long id){
        return productoService.findOne(id);
    }

    public List<Producto> findAll(){
        return productoService.findAll();
    }

    public void delete(Long id){
        productoService.delete(id);
    }

    public void upDate(Producto producto){
        productoService.upDate(producto);
    }


}
