/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Catalogo {

    public static int nAutos = 3;
    public static int nScooters = 2;

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        FabricaVehiculo fabrica;
        Automovil[] autos = new Automovil[nAutos];
        Scotter[] scotters = new Scotter[nScooters];
        System.out.println("Desea utilizar"
                + "vehiculos electricos (1) o a gasolina (2); ");
        String eleccion = reader.next();

        if (eleccion.equals("1")) {
            fabrica = new FabricaVehiculoElectricidad();
        } else {

            fabrica = new FabricaVehiculoGasolina();
        }

        for (int i = 0; i < nAutos; i++) {

            autos[i] = fabrica.crearAutomovil("estandar ", "rojo ", 7 + i, 2000);
        }
        
        for (int i = 0; i < nScooters; i++) {
    
            scotters[i] = fabrica.crearScotter("clasico ", "amarillo ", 7 + i, 500);
}
        
        for (Automovil auto: autos){
            auto.mostrarCaracteristica();
        }
        for (Scotter scotter: scotters) {
            scotter.mostrarCarateristicas();
        }
    }

}
