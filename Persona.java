// Programación Orientada a Objetos
// Encapsulamiento - Actividad 14
// By Otero Barragán Nahomi Natalia

package com.mycompany.encapsulamiento;

public class Persona {
    
    // Atributos 
    private String nombre; 
    private int edad; 
    private String direccion; 
    
    // Metodos
    public int getEdad(){
        return edad;
    } //Metodo GetEdad 
    
    public void setEdad(int edad){
        if(edad >=1 && edad <=120){
            this.edad = edad; 
        }else{
            System.out.println("La edad NO es valida!!");
        } // else
    } // metodo setEdad

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
    
} // Clase --> Persona 
