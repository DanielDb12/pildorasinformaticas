/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generica;
import java.io.File;
import java.util.*;
/**
 *
 * @author daniel
 */
public class UsoArrayList {
    
    public static void main(String[] args) {
        
        /*
        si manejamos Arraylist<String> todo los array se deben cargar en objeto tipo String y al agregar un 
        objeto de otro tipo me va a dar un error en tiempo de compilacion 
        
        
        */
    
        ArrayList archivos = new ArrayList(4);
        
        archivos.add("Juan");
        archivos.add("Daniel");
        archivos.add("Pedro");
        archivos.add("NOris");
        //nos da un error en ejecucion porque no se puede hacer un casting
         archivos.add(new File("gestion_pedido.accdb"));

        
        //nos obliga hacer un casting
        String nombrePersonas = (String)archivos.get(4);
    
        //archivos.add(new File("gestion_pedidio.accdb"));
        //File nombrePersonas=(File)archivos.get(0);
        System.out.println(nombrePersonas);
        
        
        
    }
    
    
}
