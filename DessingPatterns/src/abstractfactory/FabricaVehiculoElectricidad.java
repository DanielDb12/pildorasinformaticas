/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author daniel
 */
public class FabricaVehiculoElectricidad implements FabricaVehiculo {

    @Override
    public Automovil crearAutomovil(String modelo, String color, int potencia, double espacio) {
        
        return new AutomovilElectrico(modelo, color, potencia, espacio);


    }

    @Override
    public Scotter crearScotter(String modelo, String color, int potencia, double peso) {

        return new ScotterElectrico(modelo, color, potencia, peso);

    }

   
    
}
