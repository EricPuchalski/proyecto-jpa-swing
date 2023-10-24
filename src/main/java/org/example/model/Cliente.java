package org.example.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@Column(unique = true)
    private String cuit;
    private String nombre;
    private String apellido;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    private String direccion;
    private String telefono;

    public enum Estado{
        HABILITADO,
        DESHABILITADO
    }


    public Cliente() {
    }

    public Cliente(String cuit, String nombre, String apellido, String direccion, String telefono) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = Estado.HABILITADO;
        this.direccion = direccion;
        this.telefono = telefono;
    }


    @Override
    public String toString() {
        return "Cliente " +
                "cuit='" + cuit + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", estado=" + estado +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\''
                ;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}
