/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daniel
 */
public class SincronizandoThreads2 {
    
    public static void main(String[] args) {

        Hilosvarios hilos = new Hilosvarios();
        Hilosvarios2 hilos2 = new Hilosvarios2(hilos);
        
        
        hilos2.start();
       hilos.start();
       
       
       System.out.println("terminadas las tareas");
        
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

class Hilosvarios2 extends Thread {
    
    
    
    private Thread hilo;
    
    public Hilosvarios2(Thread hilo){
    
        this.hilo = hilo;
    
    }
    

    public void run() {
        
        try {
            hilo.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

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