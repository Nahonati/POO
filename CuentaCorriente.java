
package banco;
import java.util.Scanner; 

public class CuentaCorriente extends CuentaBancaria {
    
    //Objeto Scanner 
    Scanner input = new Scanner(System.in);
    
    // Atributos
    private double limiteCredito = 1500; 

    // Constructor 
    public CuentaCorriente(String numeroCuenta, String nombreTitular, String correoElectronico, double saldoActual) {
        super(numeroCuenta, nombreTitular, correoElectronico, saldoActual);
    } // Constructor 
    
    // Metodos 
    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void RetirarDinero() {
        super.RetirarDinero(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void Credito(){
        System.out.println("Ingresa la cantidad de dinero que quieras usar de tu credito: ");
        double cantidad = input.nextDouble(); 
        if(cantidad > limiteCredito){
            System.out.println("La cantidad supera tu limite de credito");
        }else{
            System.out.println("Uso de credito: " + "$" + cantidad);
            limiteCredito = limiteCredito - cantidad; 
        } // else 
        
        System.out.println("Saldo con limite de credito (Corriente): " + "$" + limiteCredito);
    }
    
    
    
    
    
    
} // Clase --> Cuenta corriente 
