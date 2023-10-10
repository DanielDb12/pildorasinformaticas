/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones.linklist;
import java.util.*;

/**
 *
 * @author daniel
 */
public class PruebaLinkedList {
    
    public static void main(String[] args) {
        LinkedList<String> personas = new LinkedList<String>();
        personas.add("Pepe");
        personas.add("Sandra");
        personas.add("Daniel");
        personas.add("Vicky");
       
        
        
        System.out.println(personas.size());
        
        ListIterator<String> it = personas.listIterator();
        //mueve posicion mas adelante
        it.next();
        it.add("Juan");
        
        for (String persona : personas) {
            
            System.out.println(persona);
    
}
}
    
}

