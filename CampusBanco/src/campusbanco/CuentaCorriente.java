// Programación Orientada a Objetos
// Proyecto Final - Banco 
// By Otero Barragán Nahomi Natalia
package campusbanco;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CuentaCorriente extends CuentaBancaria{
    //Objeto Scanner 
    Scanner input = new Scanner(System.in);
    
    // Atributos
    private double limiteCredito = 1500; 

    // Constructor 
    public CuentaCorriente(){
        miscuentas = new ArrayList<Cuenta>();
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
        Object frame = null;
        // Mostrar una ventana emergente para ingresar la cantidad
        String input = JOptionPane.showInputDialog(frame, "Ingrese la cantidad a usar:");

        // Verificar si el usuario ingresó algo y si es un número válido
        if (input != null && !input.trim().isEmpty()) {
            try {
                double cantidad = Double.parseDouble(input); // Convertir a double

                // Verificar si la cantidad ingresada es mayor al límite de crédito
                if (cantidad > limiteCredito) {
                    // Mostrar mensaje de error si la cantidad es mayor al límite
                    JOptionPane.showMessageDialog((Component) frame, "No se puede usar más crédito del límite disponible.");
                } else {
                    // Restar la cantidad al límite de crédito y mostrar un mensaje
                    limiteCredito -= cantidad;
                    JOptionPane.showMessageDialog((Component) frame, "Operación realizada con éxito. Crédito restante: " + limiteCredito);
                    }

            } catch (NumberFormatException ex) {
                // Si no se puede convertir el input a un número, mostrar un mensaje de error
                JOptionPane.showMessageDialog((Component) frame, "Por favor ingresa un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                } else {
                    JOptionPane.showMessageDialog((Component) frame, "No has ingresado ningún valor.", "Error", JOptionPane.ERROR_MESSAGE);
                }
        
        
            } // credito

    @Override
    public void InformacionCuenta() {
        super.InformacionCuenta(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public void AgregarCuenta(Cuenta e) {
        super.AgregarCuenta(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
