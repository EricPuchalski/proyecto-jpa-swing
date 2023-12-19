package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.example.controller.*;
import org.example.dao.CategoriaProductoJpaController;
import org.example.dao.ClienteJpaController;
import org.example.dao.DepositoJpaController;
import org.example.dao.EmpleadoJpaController;
import org.example.dao.ProductoJpaController;
import org.example.dao.ProveedorJpaController;
import org.example.dao.SectorJpaController;
import org.example.dao.TipoTransportistaJpaController;
import org.example.dao.TransportistaJpaController;
import org.example.model.Deposito;
import org.example.repository.*;
import org.example.service.*;
import org.example.util.CargarDatos;
import org.example.util.Conexion;
import org.example.view.*;



public class Main {
    public static void main(String[] args) {
        
        Conexion.connect();
        EntityManagerFactory emf = Conexion.getEmf();
        
        CargarDatos cDatos = new CargarDatos(
            new ClienteJpaController(emf),
            new ProveedorJpaController(emf),
            new CategoriaProductoJpaController(emf),
            new ProductoJpaController(emf, new ProveedorJpaController(emf), new CategoriaProductoJpaController(emf)),
            new EmpleadoJpaController(emf),
            new SectorJpaController(emf),
            new DepositoJpaController(emf),
            new TipoTransportistaJpaController(emf),
            new TransportistaJpaController(new TipoTransportistaJpaController(emf), emf)
        );
        cDatos.cargarDatos();
        JFrameLogin frameLogin = new JFrameLogin();
                                
                                  
    }
}
