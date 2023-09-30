package org.example.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="depositos")
public class Deposito implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String continente;
    @Embedded
    private Posicion posicion;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    @ManyToMany
    @JoinTable(
        name = "depositoS_sectores",
        joinColumns = @JoinColumn(name = "sector_id"),
        inverseJoinColumns = @JoinColumn(name = "deposito_id")
    )
    private List<Sector> sectores;
    @OneToOne(optional = true)
    private Empleado empleado;

    public enum Estado{
        HABILITADO,
        DESHABILITADO
    }

    public Deposito(String codigo, String nombre, String direccion, String telefono, String email, String continente,Posicion posicion, Empleado empleado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.continente = continente;
        this.sectores = new ArrayList<>(); 
        this.posicion=posicion;
        this.estado = Estado.HABILITADO;
        this.empleado = empleado;
    }

    public Deposito() {
        this.sectores = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Sector> getSectores() {
        return sectores;
    }

    public void setSectores(List<Sector> sectores) {
        this.sectores = sectores;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    

    
    @Override
    public String toString() {
        return "Deposito{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", continente='" + continente + '\'' +
                '}';
    }
}
