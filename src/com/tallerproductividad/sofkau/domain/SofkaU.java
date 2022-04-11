package com.tallerproductividad.sofkau.domain;

import com.tallerproductividad.sofkau.entity.Persona;

import javax.swing.*;
import java.util.Scanner;

public class SofkaU {
    public Persona persona;

    public SofkaU() {
    }

    public Persona agregarInformacion(){
        persona.setNombreUsuario(agregarDatos("Nombre"));
        persona.setCelular(agregarDatos("Numero Celular"));
        persona.setEdad(agregarDatos("edad"));

        return persona;

    }

    public void mostrarMensaje(){
        persona = agregarInformacion();
        JOptionPane.showInputDialog(null,"Bienvenido señor " + persona.getNombreUsuario()
                + "es un placer para nosotros contar con una persona de" + persona.getEdad()
            + "proximamente nos comunicaremos con usted al numero + " + persona.getCelular());

    }

    public String agregarDatos(String tipoDeDato){
        String dato;
        dato = JOptionPane.showInputDialog(("Ingrese por favor su " + tipoDeDato));
        return dato;
    }
}
