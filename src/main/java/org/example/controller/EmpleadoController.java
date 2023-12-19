package org.example.controller;
import java.util.List;
import org.example.model.Empleado;
import org.example.service.EmpleadoService;

public class EmpleadoController {
    EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }


    public void create(Empleado empleado) {
        empleadoService.save(empleado);
    }


    public Empleado findOne(Long id) {
        return empleadoService.findOne(id);
    }


    public List<Empleado> findAll() {
        return empleadoService.findAll();
    }



    public void upDate(Empleado empleado) {
        empleadoService.upDate(empleado);

    }


    public void delete(Long id) {
        empleadoService.delete(id);

    }
    
    public List<Empleado> buscarPorCuitParcial(String cuit){
        return empleadoService.buscarPorCuitParcial(cuit);
    }
}
