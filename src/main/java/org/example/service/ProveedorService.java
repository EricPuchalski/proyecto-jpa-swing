package org.example.service;

import org.example.model.Proveedor;
import org.example.repository.ProveedorRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.example.dao.ProveedorJpaController;
import org.example.dao.exceptions.NonexistentEntityException;
import org.example.util.Conexion;

public class ProveedorService{
    ProveedorRepository proveedorRepository;
    ProveedorJpaController proveedorJpaController;

    public ProveedorService(ProveedorJpaController proveedorJpaController) {
        this.proveedorJpaController = proveedorJpaController;
    }

    public void save(Proveedor proveedor) {
            proveedorJpaController.create(proveedor);
    }

    public List<Proveedor> findAll() {
        return proveedorJpaController.findProveedorEntities();
    }



    public Proveedor findOne(Long id) {
        return proveedorJpaController.findProveedor(id);
    }



    public void upDate(Proveedor proveedor) {
        try {
            proveedorJpaController.edit(proveedor);
        } catch (Exception ex) {
            Logger.getLogger(ProveedorService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(Long id) {
        try {
            proveedorJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ProveedorService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
