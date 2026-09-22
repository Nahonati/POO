// Programación Orientada a Objetos
// Proyecto Final - Banco 
// By Otero Barragán Nahomi Natalia
package campusbanco;

import java.util.ArrayList;

public class Cuenta {
    
    // Atributos
    double montoInicial;
    double saldoActual; 
    ArrayList<Movimiento> mismovimientos;
    
    // Constructor
    public Cuenta() {
        mismovimientos = new ArrayList<Movimiento>(); 
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public ArrayList<Movimiento> getMismovimientos() {
        return mismovimientos;
    }

    public void setMismovimientos(ArrayList<Movimiento> mismovimientos) {
        this.mismovimientos = mismovimientos;
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }
    
    // Metodos
    public void AgregarMovimientos(Movimiento m){
        mismovimientos.add(m); 
    } // Agregar movimientos 
} // Clase --> Cuenta 

