// Programación Orientado a Objetos 
// Segundo Parcial (Sistema Bancario)
// By Otero Barragán Nahomi Natalia 
package banco;

public class CuentaAhorros extends CuentaBancaria {
    
    // Atributos
    private final double tasaInteres = 0.12;
    double interes; 

    // Constructor 
    public CuentaAhorros(String numeroCuenta, String nombreTitular, String correoElectronico, double saldoActual) {
        super(numeroCuenta, nombreTitular, correoElectronico, saldoActual);
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
} // Clase --> CuentaAhorros 
