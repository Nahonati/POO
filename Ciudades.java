// By Otero Barragán Nahomi Natalia 
package mx.udg.cucea.ejercicio11;
import java.util.Scanner; 

public class Ciudades {
    
    // Definir los atributos 
    String ciudad = ""; 
    int temperatura; 
    Scanner input = new Scanner(System.in);
    
    // CONSTRCTOR
    Ciudades (){
        System.out.print("Ingresa el nombre de una ciudad: ");
        this.ciudad = input.nextLine();
        System.out.print("Ingresa su temperatura actual: ");
        this.temperatura = input.nextInt(); 
    } // Constrcutor
    
    // Metodos 
    void evaluarTemperatura (){
        if (temperatura > 25) {
            System.out.println("La temperatura de " + ciudad + " es calida");
        }else if(temperatura <= 15) {
            System.out.println("La temperatura de " + ciudad + " es fria");
        } // else if 
        
    } // evaluar temperatura
    
    
} // class
