// Programación Orientado a Objetos 
// Ejrcicio 11 - Factorial
// By Otero Barragán Nahomi Natalia

// Importar scanner 
import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[] args){

        // Variables
        int num = 0, i, fact, respuesta = 1; 

        // Crear el objeto tipo Scanner 
        Scanner input = new Scanner(System.in);

        do{
            fact = 1; 
            i = 1; 
            System.out.print("\nDe que numero deseas saber el factorial? ");
            num = input.nextInt(); 

            while (i <= num){
                fact = fact * i; 
                i++; 
            }// while

            System.out.println("El factorial de " + num + " es: " + fact);

            // Opcion de repetir el programa 
            System.out.println("\nDeseas interntarlo con otro numero? SI = 1");
            respuesta = input.nextInt();
    
        } while (respuesta == 1); 
    } // main
} // class