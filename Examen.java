// Programación Orientada a Objetos 
// Examen - Primer Parcial
// By Otero Barragán Nahomi Natalia 

// Importar Scanner
import java.util.Scanner; 

public class Examen{
    public static void main(String[] args){

        // Variales
        String cadena, invertida = ""; 
        int numeroC; // Numero de Caracteres


        // Crear objeto tipo Scanner
        Scanner input = new Scanner(System.in);


        do{
            invertida = "";

            // Pedir la cadena de caracteres 
        System.out.println("\nIngrese una cadena de caracteres: ");
        cadena = input.nextLine();

        // Almacenar el numero de caracteres de la cadena
        numeroC = cadena.length(); 

        // Invertir la cadena e implementar condición 
        if (numeroC >= 2 && numeroC <= 20){
            for(int i = numeroC - 1; i >= 0 ; i--){
                invertida = invertida + cadena.charAt(i);
            } // for
                System.out.println("\nLa cadena invertida es " + invertida + " y contiene " + numeroC + " caracteres"); 
        }else{
                System.out.println("Solo funciona con cadenas de entre 2 y 20 caracteres :(");// if 
        } // else

        }while(numeroC >= 2 && numeroC <= 20 );

    } // main
} // class

