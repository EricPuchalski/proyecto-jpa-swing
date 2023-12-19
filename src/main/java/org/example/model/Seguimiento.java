package org.example.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import javax.persistence.Embeddable;

@Embeddable

public class Seguimiento {
    private LocalDate fechaSeguimiento;
    private double latitud;
    private double longitud;
    private Sector sector;
    private String numeroDeRastreo;

    public Seguimiento(LocalDate fechaYHora, double latitud, double longitud, Pedido pedido, Sector sector) {
        this.fechaSeguimiento = fechaYHora;
        this.latitud = latitud;
        this.longitud = longitud;
        this.sector = sector;
    }
    public Seguimiento(LocalDate fechaYHora, double latitud, double longitud) {
        this.fechaSeguimiento = fechaYHora;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public LocalDate getFechaYHora() {
        return fechaSeguimiento;
    }

    public void setFechaYHora(LocalDate fechaYHora) {
        this.fechaSeguimiento = fechaYHora;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public String getNumeroDeRastreo() {
        return numeroDeRastreo;
    }

    public void setNumeroDeRastreo(String numeroDeRastreo) {
        this.numeroDeRastreo = numeroDeRastreo;
    }


    

}
