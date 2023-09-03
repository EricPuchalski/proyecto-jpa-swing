package org.example.util;

import org.example.dao.ClienteJpaController;

public class CargarDatos {
    ClienteJpaController clienteJpaController;

    public CargarDatos(ClienteJpaController clienteJpaController) {
        this.clienteJpaController = clienteJpaController;
    }

    public  void cargarDatos(){
        clienteJpaController.upLoad();
    }

}
