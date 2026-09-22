// Programación Orientado a Objetos 
// Segundo Parcial (Sistema Bancario)
// By Otero Barragán Nahomi Natalia 

package banco;
import java.util.Scanner; 

public class CuentaBancaria {
    
    //Objeto Scanner 
    Scanner input = new Scanner(System.in); 
    
    // Atributos 
    private String numeroCuenta; 
    private String nombreTitular;
    private String correoElectronico; 
    double saldoActual; 

    // Constructor 
    public CuentaBancaria(String numeroCuenta, String nombreTitular, String correoElectronico, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.correoElectronico = correoElectronico;
        this.saldoActual = saldoActual;
    } // Constructor 

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    // Metodos 
    public void IngresarDinero(){
        System.out.print("Ingresa la cantidad de dinero que quieras agregar a tu cuenta: ");
        double ingreso = input.nextDouble(); 
        
        // Agregarlo a la cuenta 
        if(saldoActual == 0){
        saldoActual = ingreso;  
    }else{
            saldoActual = saldoActual + ingreso; 
        } // else 
        System.out.println("Ingreso exitoso de: " + "$" + ingreso);
        System.out.println("Tu saldo actual es: " + "$" + saldoActual);
    } // Metodo IngresarDinero 
    
    public void RetirarDinero(){
        System.out.print("Ingresa la cantidad de dinero que quieras retirar de tu cuenta: ");
        double retiro = input.nextDouble(); 
        
        // Retirar de la cuenta 
        if(saldoActual == 0){
            System.out.println("No tienes dinero disponible en tu cuenta");
        }else if(saldoActual != 0){
            saldoActual = saldoActual - retiro; 
        } // else if 
        System.out.println("Retiro exitoso de: " + "$" + retiro);
        System.out.println("Tu saldo actual es: " + "$" + saldoActual);
    } // metodo retirarDinero
    
    public void InformacionCuenta(){
        System.out.print("\n--------------- Informacion de la cuenta ---------------");
        System.out.print("\nNumero de cuenta: " + numeroCuenta);
        System.out.print("\nNombre del titular: " + nombreTitular);
        System.out.print("\nCorreo electronico del titular: " + correoElectronico);
        System.out.println("\nSaldo actual de la cuenta: " + "$" + saldoActual);
    } // metodo Informacion de la cuenta 
    
} // Clase --> Cuenta Bancaria 
