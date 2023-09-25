package org.example.model;

import javax.persistence.Embeddable;

@Embeddable


public class Posicion {
    private double latitud;
    private double longitud;


    public Posicion(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Posicion() {
    }
    

    @Override
    public String toString() {
        return "Posicion{" +
                "latidud=" + latitud +
                ", longitud=" + longitud +
                '}';
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
    
}
