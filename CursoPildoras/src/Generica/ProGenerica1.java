/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generica;

import java.util.*;

/**
 *
 * @author daniel
 */
public class ProGenerica1 {

    /*reutalizacion del codigo evita crear una clase para diferente para cada tipo que vayas a manejar
    si en decir vas un momento en concreto necesitas manejar objeto tipo string ps te evitas tener crear una clase 
    en concreto para manejar eso tipo string
    
    con el arraylist podemos reutilizar esta clase para almacenar y manipular almacenar cualquier tipo que nos pueda ocurri empleado
    string esto se llama parametro de tipo <>
    
    si no usamos la programacion generica se puede usar mucho castin mucho codigo que no se pueda controlar 
    
    Arraylist crea lista dinamica dinamicamente cuando almacene la informacion automaticmaente irá creciendo
    
    SET-> permite incluir o remplazar un objeto con un array list en concreto
    get-> nos permite obtener el indice en concreto
    
    
    Iterador nos permite acceder a una coleccion es muy util crear un iterador secuencia de un a otros
    metodo iterador del arraylist es una interfaz
    
    */
    
    
    
    public static void main(String[] args) {

        /*
        Empleado listaempleado[] = new Empleado[4];
        
        
        listaempleado[0] = new Empleado("Juan", 50, 3000);
        listaempleado[1] = new Empleado("Elena", 35, 2000);
         listaempleado[2] = new Empleado("Alfonso", 55, 1000);
        listaempleado[3] = new Empleado("Mauricio", 25, 4000);
        
              //al utilizar por defecto el constructor arraylist conserva en memoria para 10 elementos si creas mas elemento crea otro espacio en memoria eliminando el primero espacio en memoria
        
        los arraylist no tienen indices
         */
        //almacena objetos
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

        //le indicas el espacio en memoria sin consumir recursos
        //listaEmpleados.ensureCapacity(15);
        listaEmpleados.add(new Empleado("Juan", 50, 3000));
        listaEmpleados.add(new Empleado("Elena", 35, 2000));
        listaEmpleados.add(new Empleado("Alfonso", 55, 1000));
        listaEmpleados.add(new Empleado("Mauricio", 25, 4000));
        listaEmpleados.add(new Empleado("Marco", 28, 5000));
        listaEmpleados.add(new Empleado("Juan", 50, 3000));
        listaEmpleados.add(new Empleado("Elena", 35, 2000));
        listaEmpleados.add(new Empleado("Alfonso", 55, 1000));
        listaEmpleados.add(new Empleado("Mauricio", 25, 4000));
        listaEmpleados.add(new Empleado("Marco", 28, 5000));
        listaEmpleados.add(new Empleado("Juan", 50, 3000));
        listaEmpleados.add(new Empleado("Elena", 35, 2000));
        listaEmpleados.add(new Empleado("Alfonso", 55, 1000));
        listaEmpleados.add(new Empleado("Mauricio", 25, 4000));
        listaEmpleados.add(new Empleado("Marco", 28, 5000));

        //CORTA EL EXCESO DE MEMORIA SOBRANTE Y LO AJUSTA AL ARRAYLIST CREADO
        //listaEmpleados.trimToSize();
        //Set
        listaEmpleados.set(2, new Empleado("Samuel", 35, 1500));

        //get
        System.out.println("empleado" + listaEmpleados.get(4).dameDatos());

        System.out.println(listaEmpleados.size());

        //for (Empleado empleado : listaEmpleados) {
        //  System.out.println(empleado.dameDatos());
        //}
        /*
          for (int i = 0; i < listaEmpleados.size(); i++) {
    
              Empleado e=listaEmpleados.get(i);

              System.out.println("imprime los datos" + e.dameDatos());
          }
         */
 /*
          Empleado arrayEmpleado[] = new Empleado[listaEmpleados.size()];
          listaEmpleados.toArray(arrayEmpleado);

          
          for (int i = 0; i<arrayEmpleado.length; i++) {
    
              System.out.println(arrayEmpleado[i].dameDatos());
}
         */
        //ITERADOR
        
        Iterator<Empleado> myiterator = listaEmpleados.iterator();
        
        
        while (myiterator.hasNext()) { 
    
            System.out.println(myiterator.next().dameDatos());
}
    }

}

class Empleado {

    public Empleado(String nombre, int edad, double salario) {

        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;

    }

    public String dameDatos() {

        return "El empleado se llama" + nombre + ". tiene " + edad + "titne un sueldo" + salario;

    }

    private String nombre;
    private int edad;
    private double salario;

}
