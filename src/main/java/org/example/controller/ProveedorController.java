package org.example.controller;

import org.example.model.Proveedor;
import org.example.service.ProveedorService;

import java.util.List;

public class ProveedorController {
    private final ProveedorService proveedorService;

    public ProveedorController(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    public Proveedor findOne(Long id) {
        return proveedorService.findOne(id);
    }

    public List<Proveedor> findAll() {
        return proveedorService.findAll();
    }


    public void delete(Long id) {
        proveedorService.delete(id);
    }

    public void create(Proveedor proveedor) {
        proveedorService.save(proveedor);
    }

    public void upDate(Proveedor proveedor) {
        proveedorService.upDate(proveedor);
    }

        public Proveedor  findByName(String nombre){
        Proveedor pEncontrado = null;
        for(Proveedor p: this.findAll()){
             if (p.getNombre().equals(nombre) ) {
                pEncontrado = p;
            } 
        }

        return pEncontrado;
    }
}
