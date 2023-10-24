package org.example.model;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "remitos")

public class Remito implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date emision;
    @ManyToOne
    private Transportista transportista;
    @ManyToOne
    private Empleado empleadoEmisor;
    @ManyToOne
    private Empleado empleadoReceptor;


    public Remito(Date emision, Transportista transportista, Empleado empleadoEmisor, Empleado empleadoReceptor) {
        this.emision = emision;
        this.transportista = transportista;
        this.empleadoEmisor = empleadoEmisor;
        this.empleadoReceptor = empleadoReceptor;
    }

    public Remito() {
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getEmision() {
        return emision;
    }

    public void setEmision(Date emision) {
        this.emision = emision;
    }

    public Transportista getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }

    public Empleado getEmpleadoEmisor() {
        return empleadoEmisor;
    }

    public void setEmpleadoEmisor(Empleado empleadoEmisor) {
        this.empleadoEmisor = empleadoEmisor;
    }

    public Empleado getEmpleadoReceptor() {
        return empleadoReceptor;
    }

    public void setEmpleadoReceptor(Empleado empleadoReceptor) {
        this.empleadoReceptor = empleadoReceptor;
    }

    
    
}

