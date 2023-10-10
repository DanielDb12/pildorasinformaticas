package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daniel
 */
public class SincronizandoThreads {

    public static void main(String[] args) {

        Hilosvarios hilos = new Hilosvarios();
        Hilosvarios hilos2 = new Hilosvarios();
        
        
        hilos.start();
        
        try {
            hilos.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();

        }
        
        hilos2.start();
        
        try {
            hilos2.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();

        }
        
        System.out.println("Terminadas la tareas");
        
    }

}

class Hilosvarios extends Thread {

    public void run() {

        for (int i = 0; i < 15; i++) {

            System.out.println("Ejecutando Hilo" + getName());
            
            try {
                Thread.sleep(700);
            } catch (InterruptedException ex) {
               ex.printStackTrace();
            }
        }
    }

}
