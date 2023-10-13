/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones.metodoequhash;

import Colecciones.metodoequhash.Libro;

/**
 *
 * @author daniel
 */
public class UsoLibro {

    public static void main(String[] args) {

        Libro libro1 = new Libro("P en Jva", "Juan", 22);
        Libro libro2 = new Libro("P en Jva", "Juan", 25);

        //libro1=libro2
        
        //el metodo equal no tiene idea de que son diferentes los libros por eso hay que rescribir el metodo y equals para que pueda dectectar que sean distinto
        
        if (libro1.equals(libro2)) {

            System.out.println("es el mismo libro");
            
              System.out.println(libro1.hashCode());
        
            
            System.out.println(libro2.hashCode());

        } else {
        
            System.out.println("no es el mismo libro");
            
            System.out.println(libro1.hashCode());
        
            
            System.out.println(libro2.hashCode());
        }
        
    }

}
