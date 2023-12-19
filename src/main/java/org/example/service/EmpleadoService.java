package org.example.service;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.example.dao.EmpleadoJpaController;
import org.example.dao.exceptions.NonexistentEntityException;
import org.example.model.Empleado;


public class EmpleadoService{
    
    private EmpleadoJpaController empleadoJpaController;
    


    public EmpleadoService(EmpleadoJpaController ejc) {
        this.empleadoJpaController = ejc;
    }


    public void save(Empleado empleado) {
        try {
            empleadoJpaController.create(empleado);
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void upDate(Empleado empleado) {
        try {
            empleadoJpaController.edit(empleado);
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public Empleado findOne(Long id) {

        return empleadoJpaController.findEmpleado(id);
    }



    public List<Empleado> findAll() {
        return empleadoJpaController.findEmpleadoEntities();
    }



    public void delete(Long id) {
        try {
            empleadoJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(EmpleadoService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Empleado> buscarPorCuitParcial(String cuit){
        return empleadoJpaController.buscarPorCuitParcial(cuit);
    }
}
