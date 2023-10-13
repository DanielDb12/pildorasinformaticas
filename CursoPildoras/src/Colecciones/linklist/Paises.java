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
public class Paises {

    public static void main(String[] args) {

        LinkedList<String> paises = new LinkedList<String>();

        paises.add("Venezuela");
        paises.add("Colombia");
        paises.add("Peru");
        paises.add("España");

        LinkedList<String> capital = new LinkedList<String>();

        capital.add("Caracas");
        capital.add("Bogota");
        capital.add("Lima");
        capital.add("Madrid");

        ListIterator<String> iterA = paises.listIterator();

        ListIterator<String> iterB = capital.listIterator();

        //mientras haya un elemento siguiente dentro del linkendlist de las capitales entramos al bucle porque existe un elemnto abajo de la posicion iniciall del iterador
        //cuando creamos un iterador por defecto se posiciona en el inicio de las lista
        
        /*
         [iterador]
         [Venezuela]
       (iterA.add Caracas)
        [Colombia]
        (iterA.add Bogota)
        
        */
        
        while (iterB.hasNext()) {

            //si hay un siguiente elemnto 
            if (iterA.hasNext()) {

                //salta al siguiente elemento
                iterA.next();
            }

            //iterb-> ciudad me lo agregas
            iterA.add(iterB.next());

        }

        System.out.println(paises);

        //subir el iterador arriba ya que esta en la ultima posicion de la lista
        //posicion inicial del iterador
        iterB = capital.listIterator();
        /*mientas haya un elemento salta a la siguiente posicion
        
        a continuacion del iterador hay un elemento y es verdad entra al ciclo
        
        
          [iterador]
         [Venezuela]
       (iterA.add Caracas) 
        [Colombia]
        (iterA.add Bogota) iterB.next()
        [Peru]
        [Lima] eliminacion 
        [España]
        [Madrid]
        
        
         */
        while (iterB.hasNext()) {
            //saltar una posicion
            iterB.next();
            
            //hay otra posicion
            if (iterB.hasNext()) {
                iterB.next();
                //la posicion 2 se elimina
                iterB.remove();

            }

        }

        System.out.println(capital);

        paises.removeAll(capital);

        System.out.println(paises);

    }

}
