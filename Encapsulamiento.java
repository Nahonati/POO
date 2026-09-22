// Programación Orientada a Objetos
// Encapsulamiento - Actividad 14
// By Otero Barragán Nahomi Natalia 

package com.mycompany.encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {
        
        // Objeto
        Persona e = new Persona();
        e.setEdad(121);
        e.getEdad();
        e.setNombre("Uriel");
        e.getNombre();
        e.setDireccion("Manuel Cuesta Gallardo #538");
        e.getDireccion(); 
        
        // Mostrar los datos 
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Edad: " + e.getEdad());
        System.out.println("Dirección: " + e.getDireccion());
        
    } // main
} // Clase --> Encapsulamiento 
