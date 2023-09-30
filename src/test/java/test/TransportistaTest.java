/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import junit.framework.TestCase;
import org.example.controller.TransportistaController;
import org.example.dao.TipoTransportistaJpaController;
import org.example.dao.TransportistaJpaController;
import org.example.model.Transportista;
import org.example.service.TransportistaService;
import org.example.util.EntityManagerFactoryUTIL;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ericp
 */
public class TransportistaTest extends TestCase{
    
    private Transportista t;
    private TransportistaController transportistaController;

    public TransportistaTest() {
       this.transportistaController = new TransportistaController(new TransportistaService(new TransportistaJpaController(new TipoTransportistaJpaController(EntityManagerFactoryUTIL.getEntityManagerFactory()), EntityManagerFactoryUTIL.getEntityManagerFactory())));
    }
    
    public Transportista transportistaMuck(){
         Transportista t = new Transportista();
         t.setNombre("eric");
         return t;
    }
    
    @Test
     public void testCrearTransportista() {
         Transportista t = transportistaMuck();
         
         transportistaController.create(t);
         
         Assert.assertEquals("eric", t.getNombre()); 
    }
     
    @Test
     public void testEditarTransportista() {
         Transportista t = transportistaMuck();
         t.setNombre("carlos");
         transportistaController.upDate(t);
         Assert.assertEquals("carlos", t.getNombre()); 
    }
}
