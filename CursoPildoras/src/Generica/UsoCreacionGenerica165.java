/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generica;

/**
 *
 * @author daniel
 */
public class UsoCreacionGenerica165 {
    
    
    public static void main(String[] args) {
        
        CreacionGenerica165<String> una = new CreacionGenerica165<String>();
        
        una.setPrimero("German");
        
        System.out.println(una.getPrimero());
        
     Persona pers1 = new  Persona("Ana");
     
     CreacionGenerica165<Persona> dos = new CreacionGenerica165<>();
        
     dos.setPrimero(pers1);
     System.out.println(dos.getPrimero());
     
}
    
    
}    
  class Persona {
  
      public Persona(String nombre){
      
          this.nombre=nombre;
      }
      
      public String toString() {
  
      return nombre;
  }
 
      private String nombre;
  }
    
    

