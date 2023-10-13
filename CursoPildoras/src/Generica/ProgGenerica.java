/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generica;

/**
 *
 * @author daniel
 */
public class ProgGenerica {
    
    /*
    Programacion Generica = 
        *Reutilizacion de Codigo
     
    
    Se denomina generica por que maneja cualquier objeto en general string numero etc
    Ventajas
    ->mayor sencicllez de codigo
    ->Reutilizacion del codigo d enumeros escenarios
    ->comprobracion de errores en tiempo de compilacion
    
     
    
    */
    
    
    public ProgGenerica(int z){
    
        datoElemento=new Object[z];
    
    }
    
     public Object get(int i){
    
        return datoElemento[i];
    
    }
     
      public void add(Object o){
    
        datoElemento[i]=o;
        
        i++;
    
    }
      
      private Object[] datoElemento;
      private int i=0;
    
    
    
}
