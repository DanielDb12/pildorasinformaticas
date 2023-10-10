/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author daniel
 */
public class ScotterElectrico extends Scotter {

    public ScotterElectrico( String modelo, String color, int potencia, double peso) {
        super(modelo, color, potencia, peso);
    }

    @Override
    public void mostrarCarateristicas() {
        
        
        System.out.println("electrico " + " el modelo es: " + modelo + "el color es " + color
        + "la potencias es" + potencia + "el peso es" + peso);
        
        
        
    }
    
    
    
    
    

    
    
}
