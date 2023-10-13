/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones.treeset;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author daniel
 */
public class Prueba_TreeSet2 {

    public static void main(String[] args) {

        /*
        si queremos almacenar objetos que no hemos creado nosotros y que no implementan 
        la interface comparecto
        programaremos otra forma para no necesitar el clase contruye el objeto estamos almacenando 
        en el treeset implemente la interfaz compareitor
        crearemos un nuevo comparador
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

        //Articulos comparadorArticulos = new Articulos();
        //TreeSet<Articulos> ordenArt2 = new TreeSet<Articulos>(comparadorArticulos);
        //ComparadorArticulos compara = new ComparadorArticulos();
        //crear clase interna anonima
        TreeSet<Articulos> ordenArticulo2 = new TreeSet<Articulos>(new Comparator<Articulos>() {

            public int compare(Articulos t, Articulos t1) {

                String desc1 = t.getDescription();

                String desc2 = t1.getDescription();

                return desc1.compareTo(desc2);

            }

        });
        ordenArticulo2.add(segundo);
        ordenArticulo2.add(primero);
        ordenArticulo2.add(tercero);

        for (Articulos articulos : ordenArticulo2) {

            System.out.println("imprime art2: " + articulos.getDescription());

        }
    }
}

class Articulos implements Comparable<Articulos> {

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

}


    

    

