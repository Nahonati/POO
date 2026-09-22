// Programación Orientada a Objetos 
// Ejercicio 09
// By Otero Barragán Nahomi Natalia 

public class Ejercicio09{
	public static void main(String[] args){
		
		// Variables 
		int num01 = 4;
		int num02 = 10;
		int num03 = 5; 

		// Procedimiento 
		if (num01 > num02){
            if(num01 > num03){
                System.out.println("Mayor: " + num01);
                if(num02 < num03){
                    System.out.println("Intermedio: " + num03);
                    System.out.println("Menor: " + num02);
                }else{
                    System.out.println("Intermedio: " + num02);
                    System.out.println("Menor: " + num03);
                } // else
            } // if
        } // if
		else if(num02 > num03){
			System.out.println("Mayor: " + num02);
            if(num03 < num01){
                System.out.println("Intermedio: " + num01);
                System.out.println("Menor: " + num03);
            }else{
                System.out.println("Intermedio: " + num03);
                System.out.println("Menor: " + num01);
            } // else
			} // if
			else {
				System.out.println("Mayor: " + num03);
                if (num02 < num01){
                    System.out.println("Intermedio: " + num01);
                    System.out.println("Menor: " + num02);
                }else{
                    System.out.println("Intermedio: " + num02);
                    System.out.println("Menor: " + num01);
                }
			} // else
        
	} // main 

}