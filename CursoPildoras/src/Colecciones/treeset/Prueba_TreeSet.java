/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones.treeset;

import java.util.*;

/**
 *
 * @author daniel
 */
public class Prueba_TreeSet {

    public static void main(String[] args) {

        /*  TreeSet<String> ordenaPersonas = new TreeSet<String>();

        
        lo ordena alfabeticamente el treeset esta ordenado por defecto si se
        se trata de un tipo string el orden es alfabetico
        
        lo hace asi porque la clase string implenta la interfaz comparable esta 
        interfaz tiene internamente el metodo compareto
        
        treeset utiliza la interfaz que almacena en su interior y los compara
        entre si y en funcion de la comparacion ordenarlos
        
        
        ordenaPersonas.add("Elena");
        ordenaPersonas.add("Pedro");
        ordenaPersonas.add("Francisco");
        ordenaPersonas.add("Sofia");

        for (String ordenaPersona : ordenaPersonas) {

            System.out.println(ordenaPersona);

        }
         */
        Articulos primero = new Articulos(1, "Yuca");
        Articulos segundo = new Articulos(2, "Papa");
        Articulos tercero = new Articulos(3, "Platano");

        TreeSet<Articulos> ordenarArticulos = new TreeSet<Articulos>();

        ordenarArticulos.add(tercero);
        ordenarArticulos.add(segundo);
        ordenarArticulos.add(primero);

        for (Articulos art : ordenarArticulos) {

            System.out.println(art.getDescription());

        }
        
        
         Articulos comparadorArticulos = new Articulos();
    TreeSet<Articulos> ordenArt2 = new TreeSet<Articulos>(comparadorArticulos);
    
    ordenArt2.add(segundo);
     ordenArt2.add(primero);
      ordenArt2.add(tercero);
      
      for (Articulos articulos : ordenArt2) {
          
          System.out.println("imprime art2: " + articulos.getDescription());
    
}

    }
    
   

}

class Articulos implements Comparable<Articulos>, Comparator<Articulos> {
    
    
    public Articulos(){
    
    
    }

    private int numero_articulo;
    private String description;

    public Articulos(int num, String desc) {

        numero_articulo = num;
        description = desc;

    }

    @Override
    public int compareTo(Articulos t) {

        return numero_articulo - t.numero_articulo;

    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compare(Articulos t, Articulos t1) {

        String descriptionA = t.getDescription();
        String descriptionB = t1.getDescription();

        return descriptionA.compareTo(descriptionB);

    }

}

// 
