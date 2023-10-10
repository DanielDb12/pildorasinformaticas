/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author daniel
 */
public interface FabricaVehiculo {
    
    Automovil crearAutomovil(String modelo, String color, int potencia, double espacio);
    Scotter crearScotter(String modelo, String color, int potencia, double  peso);
  
    
}
