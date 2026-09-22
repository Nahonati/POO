// Programación Orientada a Objetos
// Proyecto Final - Banco 
// By Otero Barragán Nahomi Natalia
package campusbanco;

public class Movimiento {
    
    // Atributos
    String tipoMovimiento; 
    String tipoMovimiento1 = "Bancaria";
    String tipoMovimiento2 = "Ahorro";
    String tipoMovimiento3 = "Corriente";
    String fecha;
    double saldo;

    // Constructor
    public Movimiento() {
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }
    

    public String getTipoMovimiento1() {
        return tipoMovimiento1;
    }

    public String getTipoMovimiento2() {
        return tipoMovimiento2;
    }

    public String getTipoMovimiento3() {
        return tipoMovimiento3;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
} // Clase --> Movimiento 
