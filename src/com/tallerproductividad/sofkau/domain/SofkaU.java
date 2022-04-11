package com.tallerproductividad.sofkau.domain;

import com.tallerproductividad.sofkau.entity.Persona;

import javax.swing.*;
import java.util.Scanner;

public class SofkaU {

    public SofkaU() {
    }

    public Persona agregarInformacion(){
        String nombre = JOptionPane.showInputDialog("Ingres su nombre por favor");
        String celular = JOptionPane.showInputDialog("Ingres su numero de celular por favor");
        String edad = JOptionPane.showInputDialog("Ingres su edad por favor");
        Persona persona = new Persona();
        persona.nombreUsuario=nombre;
        persona.celular=celular;
        persona.edad =edad;
        return persona;
    }

    public void mostrarMensaje(){

        Persona persona = agregarInformacion();
        JOptionPane.showMessageDialog(null,"Bienvenido señor "+ (persona.nombreUsuario)
                + " es un placer para nosotros contar con una persona de " + (persona.edad) + " años." +
                " \n Proximamente nos comunicaremos con usted al numero " + (persona.celular) +"\n Feliz día");

    }
}
