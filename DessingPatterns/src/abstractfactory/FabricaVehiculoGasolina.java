/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author daniel
 */
public class FabricaVehiculoGasolina implements  FabricaVehiculo {

    @Override
    public Automovil crearAutomovil(String modelo, String color, int potencia, double espacio) {
      return  new AutomovilGasolina(modelo, color, potencia, espacio);
    }

    @Override
    public Scotter crearScotter(String modelo, String color, int potencia, double peso) {
       return new ScotterGasolina(modelo, color, potencia, peso);
    }



    
    
   
    
    
    
    
    
}
