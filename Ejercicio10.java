// Programación Orienta a Objetos
// Estructuras Repetitivas - Ejercicio 10 
// By Otero Barragán Nahomi Natalia 

// Importar scanner 
import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args){
        
        // Variables
        int count = 1;
        int respuesta = 0; 

        // Crear el objeto tipo Scanner 
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Ingrese el numero de la tabla que desee obtener: ");
            int tabla = input.nextInt(); 

            System.out.println("\nTabla del " + tabla);

            // Instrucciones
            while(count <= 10){
                System.out.println(tabla + "x" + count + "=" + (tabla * count));
                count = count + 1; // count++, count +=2 (aumentar de 2 en 2)
            }

            System.out.println("\nDeseas repetir el programa? SI = 1/ NO = 2");
            respuesta = input.nextInt();
            count = 1; 

        } while (respuesta == 1); 

    }
}