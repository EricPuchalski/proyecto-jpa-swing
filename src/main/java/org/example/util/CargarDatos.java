package org.example.util;

import org.example.dao.CategoriaProductoJpaController;
import org.example.dao.ClienteJpaController;
import org.example.dao.ProveedorJpaController;

public class CargarDatos {
    ClienteJpaController clienteJpaController;
    ProveedorJpaController proveedorJpaController;
    CategoriaProductoJpaController categoriaProductoJpaController;

    public CargarDatos(ClienteJpaController clienteJpaController, ProveedorJpaController proveedorJpaController,CategoriaProductoJpaController categoriaProductoJpaController
    ) {
        this.categoriaProductoJpaController = categoriaProductoJpaController;
        this.clienteJpaController = clienteJpaController;
        this.proveedorJpaController = proveedorJpaController;
    }

    public  void cargarDatos(){
        clienteJpaController.upLoad();
        proveedorJpaController.upLoad();
        categoriaProductoJpaController.upload();
    }

}
