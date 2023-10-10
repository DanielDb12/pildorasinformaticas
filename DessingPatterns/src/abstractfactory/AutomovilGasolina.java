/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author daniel
 */
public class AutomovilGasolina extends  Automovil {
    
    

    public AutomovilGasolina(String modelo, String color, int potencia, double espacio) {
        super(modelo,color,potencia,espacio);
    }

  
 public void mostrarCaracteristica() {
    
        System.out.println("Automovil gasolina modelo" + modelo + "color:" +
                color + "potencia" + potencia + "espacio: " + espacio);
        
    }
    
   
    
}
