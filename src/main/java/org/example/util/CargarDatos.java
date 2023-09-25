package org.example.util;

import org.example.dao.CategoriaProductoJpaController;
import org.example.dao.ClienteJpaController;
import org.example.dao.DepositoJpaController;
import org.example.dao.EmpleadoJpaController;
import org.example.dao.ProductoJpaController;
import org.example.dao.ProveedorJpaController;
import org.example.dao.SectorJpaController;
import org.example.dao.TipoTransportistaJpaController;
import org.example.dao.TransportistaJpaController;

public class CargarDatos {
    ClienteJpaController clienteJpaController;
    ProveedorJpaController proveedorJpaController;
    CategoriaProductoJpaController categoriaProductoJpaController;
    ProductoJpaController productoJpaController;
    EmpleadoJpaController empleadoJpaController;
    SectorJpaController sectorJpaController;
    DepositoJpaController depositoJpaController;
    TipoTransportistaJpaController tipoTransportistaJpaController;
    TransportistaJpaController transportistaJpaController;

    public CargarDatos(ClienteJpaController clienteJpaController,
            ProveedorJpaController proveedorJpaController,
            CategoriaProductoJpaController categoriaProductoJpaController,
            ProductoJpaController productoJpaController,
            EmpleadoJpaController empleadoJpaController,
            SectorJpaController sectorJpaController,
            DepositoJpaController depositoJpaController,
            TipoTransportistaJpaController tipoTransportistaJpaController,
            TransportistaJpaController transportistaJpaController
    ) {
        this.categoriaProductoJpaController = categoriaProductoJpaController;
        this.clienteJpaController = clienteJpaController;
        this.proveedorJpaController = proveedorJpaController;
        this.productoJpaController = productoJpaController;
        this.empleadoJpaController = empleadoJpaController;
        this.sectorJpaController = sectorJpaController;
        this.depositoJpaController = depositoJpaController;
        this.tipoTransportistaJpaController = tipoTransportistaJpaController;
        this.transportistaJpaController = transportistaJpaController;
    }

    public  void cargarDatos(){
        clienteJpaController.upLoad();
        proveedorJpaController.upLoad();
        categoriaProductoJpaController.upload();
        productoJpaController.upLoad();
        empleadoJpaController.upLoad();
        sectorJpaController.upLoad();
        depositoJpaController.upLoad();
        tipoTransportistaJpaController.upload();
        transportistaJpaController.upLoad();
    }

}
