package com.unal.ciclo2grupo28clase10;

/**
 *
 * @author Usuario
 */
public class Ciclo2Grupo28Clase10 {

    public static void main(String[] args) {

        Empleado gonzalez = new Empleado();
        gonzalez.nombre = "Hernando";
        gonzalez.cargo = "Tecnico";
        gonzalez.genero = "M->H";
        
        Cliente cli1= new Cliente();
        cli1.producto="Linea Blanca";
        Cliente cli2= cli1;
        
        String n= new String();
        n="Cualquier cosa";
        Float f= 10.0f;

    }
}
