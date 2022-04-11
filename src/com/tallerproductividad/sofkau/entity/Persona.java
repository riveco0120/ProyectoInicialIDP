package com.tallerproductividad.sofkau.entity;

public class Persona {
    public String nombreUsuario;
    public String edad;
    public String celular;

    public Persona() {
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        celular = celular;
    }
}
