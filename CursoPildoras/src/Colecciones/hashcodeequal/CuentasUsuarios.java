/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones.hashcodeequal;

import Colecciones.hashcodeequal.Clientes;
import java.util.*;

/**
 *
 * @author daniel
 */
public class CuentasUsuarios {

    public static void main(String[] args) {

        //Creamos objeto cliente
        Clientes cl1 = new Clientes("Juan", "0001", 200000);
        Clientes cl2 = new Clientes("Maria", "00002", 150000);
        Clientes cl3 = new Clientes("Pedro", "00003", 120000);
        Clientes cl4 = new Clientes("Daniel", "00004", 5000000);
        Clientes cl5 = new Clientes("Daniel", "00004", 5000000);
        /*no tiene sentido repetir cliente debe aparecer unicamente una vez
          2) Agregar o borrar
          3) Solo lectura
         */
        //Creamos la coleccion
        //Set-> HashSet -> no permite dublicados
        Set<Clientes> clientesBancos = new HashSet<Clientes>();

        //Agregamos la coleccion
        clientesBancos.add(cl1);
        clientesBancos.add(cl2);
        clientesBancos.add(cl3);
        clientesBancos.add(cl4);
        clientesBancos.add(cl5);

        //Recorrer la coleccion para que imprima la informacion
        for (Clientes clientesBanco : clientesBancos) {

            System.out.println(clientesBanco.getNombre() + " " + clientesBanco.getN_cuenta() + " " + clientesBanco.getSaldo());

        }
    }
}
