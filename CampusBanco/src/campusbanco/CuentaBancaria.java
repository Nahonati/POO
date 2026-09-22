// Programación Orientada a Objetos
// Proyecto Final - Banco 
// By Otero Barragán Nahomi Natalia
package campusbanco;

import java.util.ArrayList;
import java.util.Scanner;

public class CuentaBancaria {
    
    //Objeto Scanner 
    Scanner input = new Scanner(System.in); 
    
    // Atributos 
    private String numeroCuenta; 
    private String nombreTitular;
    private String correoElectronico; 
    double saldoActual; 
    ArrayList<Cuenta>miscuentas; 

    // Constructor 
    public CuentaBancaria(){
        miscuentas = new ArrayList<Cuenta>(); 
    } // Constructor 

    public ArrayList<Cuenta> getMiscuentas() {
        return miscuentas;
    }

    public void setMiscuentas(ArrayList<Cuenta> miscuentas) {
        this.miscuentas = miscuentas;
    }
    

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
    
    public void AgregarCuenta(Cuenta e){
        miscuentas.add(e);
    } // Agregar Cuentas
}
