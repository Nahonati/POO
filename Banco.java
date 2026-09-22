// Programación Orientado a Objetos 
// Segundo Parcial (Sistema Bancario)
// By Otero Barragán Nahomi Natalia 

package banco;

public class Banco {

    public static void main(String[] args) {
        
        CuentaBancaria e = new CuentaBancaria("284729", "Uriel Aguayo", "uriel12P@gamal.com", 700); 
        e.InformacionCuenta();
        e.IngresarDinero();
        e.RetirarDinero();
        
        CuentaAhorros a = new CuentaAhorros("895372", "Daniela Orozco", "daniela66@hotmail.com", 500); 
        a.InformacionCuenta();
        a.IngresarDinero();
        a.AplicarInteres();
        
        CuentaCorriente b = new CuentaCorriente("935783", "Fabian Hernandez", "fabianh29@gmail.com", 1200);
        b.InformacionCuenta();
        b.RetirarDinero();
        b.Credito();
        
    } // main
    
} // Clase --> Banco 
