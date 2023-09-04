package org.example.util;

import org.example.dao.ClienteJpaController;
import org.example.dao.ProveedorJpaController;

public class CargarDatos {
    ClienteJpaController clienteJpaController;
    ProveedorJpaController proveedorJpaController;

    public CargarDatos(ClienteJpaController clienteJpaController, ProveedorJpaController proveedorJpaController) {
        this.clienteJpaController = clienteJpaController;
        this.proveedorJpaController = proveedorJpaController;
    }

    public  void cargarDatos(){
        clienteJpaController.upLoad();
        proveedorJpaController.upLoad();
    }

}
