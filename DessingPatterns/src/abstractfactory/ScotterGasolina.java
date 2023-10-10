/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author daniel
 */
public class ScotterGasolina extends  Scotter {

    public ScotterGasolina(String modelo, String color, int potencia, double peso) {
        super(modelo, color, potencia, peso);
    }

    @Override
    public void mostrarCarateristicas() {
       System.out.println("gasolina " + "el modelo es: " + modelo + "el color es" + color + "la pontencia es: " + potencia + "peso :" + peso);
    }
    
    
    
    
}
