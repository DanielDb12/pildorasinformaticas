/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author daniel
 */
public abstract class Scotter {
    
    protected String modelo;
    protected String color;
    protected int potencia;
    protected  double peso;

    public Scotter(String modelo, String color, int potencia, double peso) {
    
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
        this.peso = peso;
    
    }
    
    public abstract void mostrarCarateristicas();
    
}
