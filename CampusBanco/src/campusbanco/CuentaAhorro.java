// Programación Orientada a Objetos
// Proyecto Final - Banco 
// By Otero Barragán Nahomi Natalia
package campusbanco;

import java.util.ArrayList;

public class CuentaAhorro extends CuentaBancaria {
    // Atributos
    final double tasaInteres = 0.12;
    double interes; 

    // Constructor 
    public CuentaAhorro(){
        miscuentas = new ArrayList<Cuenta>(); 
    } // constructor 
    
    // Metodos

    
    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    @Override
    public void IngresarDinero() {
        super.IngresarDinero();
    }
    
    // Metodo para aplicar el interes a la cuenta
    public void AplicarInteres(){ 
        interes = saldoActual * tasaInteres; 
        saldoActual = saldoActual + interes;
        System.out.println("Tu saldo con interes es: " + "$" + saldoActual);
        System.out.println("Interes aplicado: " + "$" + interes);
    } // Metodo aplicarIntereses

    @Override
    public void InformacionCuenta() {
        super.InformacionCuenta();
    } // Override

    @Override
    public void AgregarCuenta(Cuenta e) {
        super.AgregarCuenta(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
