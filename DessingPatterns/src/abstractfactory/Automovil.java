/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author daniel
 */
public abstract class Automovil {
    
    protected  String modelo;
    protected  String color;
    protected   int potencia;
    protected double espacio;
    
    
    public Automovil(String modelo, String color, int potencia, double espacio) {
        
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
        this.espacio = espacio;
    
    
    }
    
    
  public abstract  void mostrarCaracteristica();
    
}
