/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones.mapas;

import java.util.*;

/**
 *
 * @author daniel
 */
public class PruebaMapas {
    
    public static void main(String[] args) {
        
        HashMap<String, Empleados> personal = new HashMap<String, Empleados>();
        
        personal.put("145", new Empleados("Jose Maria"));
        personal.put("138", new Empleados("Maria Jose"));
        personal.put("155", new Empleados("Carlo Jose"));
        personal.put("160", new Empleados("Marron Jose"));

        //System.out.println(personal);
        personal.remove("155");

        //System.out.print(personal);
        personal.put("138", new Empleados("Pepe Mujica"));

        //System.out.print(personal);
        //que nos devuelva una coleccion tipo set y nos imprima la coleccion
        System.out.print(personal.entrySet());

        //recorrer el elemento que nos devuelva los elementos en forma de set
        for (Map.Entry<String, Empleados> entry : personal.entrySet()) {
            String key = entry.getKey();
            Empleados val = entry.getValue();
            
            
            System.out.println("CLave=" + key + "valor" + val);
        }
    }
    
}

class Empleados {
    
    private String nombre;
    private double sueldo;
    
    public Empleados(String n) {
        
        nombre = n;
        sueldo = 2000;
        
    }
    
    public String toString() {
        
        return "[nombre" + nombre + "sueldo" + sueldo + "]";
        
    }
    
}
