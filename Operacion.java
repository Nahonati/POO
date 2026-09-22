// Programación Orientada a Objetos 
// Ejercicio 13 - HERENCIA
// By Otero Barragán 
package mx.udg.cucea.ejercicio13;
import java.util.Scanner;

public class Operacion {
    
    // CONSTRUCTOR
    
    // Crear objeto tipo Scanner 
    Scanner input = new Scanner(System.in);
    
    // Atributos 
    int valor1;
    int valor2; 
    int resultado; 
    
    // Metodos
    void ingresarValor1 (){
        System.out.print("Ingresa el primer valor: ");
        valor1 = input.nextInt(); 
    } // valor 1
    
    void ingresarValor2 (){
        System.out.print("Ingresa el segundo valor: ");
        valor2 = input.nextInt(); 
    } // valor 2 
    
    void mostrarResultado (){
        System.out.println("Es resultado de la operación es: " + resultado);
    }
         
} // Clase --> Operación 

class Suma extends Operacion {
    
    // Metodo 
    void suma(){
        System.out.println("----- SUMA -----");
        ingresarValor1();
        ingresarValor2(); 
        resultado = valor1 + valor2; 
        mostrarResultado(); 
    } // suma 
    
} // Clase --> SUMA 

class Resta extends Operacion {
    
    // Metodos
    void resta (){
        System.out.println("----- RESTA -----");
        ingresarValor1(); 
        ingresarValor2();
        resultado = valor1 - valor2; 
        mostrarResultado (); 
    } // resta 
}