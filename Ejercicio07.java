// Programación Orientada a objetos 
// Ejercicio 07 - Ticket (Operadores)
// By Otero Barragán Nahomi Natalia

public class Ejercicio07{

	public static void main(String[] args){
        
		// Variables 
		float ticket = 345f;
		float propina = 0.15f;
		float iva = 0.16f;

		// Procedimiento
		// Subtotal
		System.out.println("Subtotal: " + ticket); 
		
		// Propina
		System.out.println("Propina (15%): " + (ticket * propina)); 

		// IVA
		System.out.println("IVA (16%): " + (ticket * iva)); 

		// Monto Total
		System.out.println("Monto Total: " + ((ticket * propina) + (ticket * iva) + ticket));
	}

}