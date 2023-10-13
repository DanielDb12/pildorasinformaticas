/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

//Threads(hilos) 173,174,175
/**
 *
 * @author daniel
 */
public class BancoSync2 {

    public static void main(String[] args) {

        Banco b = new Banco();

        for (int i = 0; i < 100; i++) {

            EjecucionTransferencia r = new EjecucionTransferencia(b, i, 2000);

            Thread t = new Thread(r);

            t.start();
        }

    }
}

class Banco {

    public Banco() {

        cuentas = new double[100];

        for (int i = 0; i < cuentas.length; i++) {

            cuentas[i] = 2000;
        }

        //el bloque tiene que establecer con una condiccion y la condicion la llamamos saldoSuficiente
        //se hace en el constructo porque cada hilo va con esta condicion 
        //saldoSuficiente = cierreBanco.newCondition();
    }

    public synchronized void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException{

        //ReentrantLook
        //metodo lock bloque un los hilos para que sean simultaneas
        
        //evalua que el saldo no es inferio a la cuenta
        
        //cierreBanco.lock();
        //en este caso los hilos venian sin sincronizacion y recurrente por eso se coloca el lock
        //para que los hilos vayan 1 a 1
        
        //try{
        
        
        while (cuentas[cuentaOrigen] < cantidad) {
         
            
            wait(); //->mantiene los hilos en espera mientra se esta ejecutando
        }
        
        //imprime el hilo
        System.out.println(Thread.currentThread());

        cuentas[cuentaOrigen] -= cantidad;//dinero que sale de la cuenta origen

        //imprime la cantidad la cuentadeorigen cuenta destino
        System.out.printf("%10.2f de %d para %d ", cantidad, cuentaOrigen, cuentaDestino);
        
        //suma el destino la cantidad que le llega
        cuentas[cuentaDestino] += cantidad; //cuenta destino se incrementa el saldo que sale de cuenta origen

        
        System.out.printf("Saldo total: %10.2f%n", getSaldoTotal());
    
      //  saldoSuficiente.signalAll();
      
      notifyAll();//->le indica a los hilos que esten a la espera
        // cuando desbloquee el codigo seguira el otro hilo porque es muy parecio a un semaforo sale uno entra el otro hilo
        //finally siempre se va ejecutar y va a retornar donde hizo la llamada 
        }//finally{
        
           // cierreBanco.unlock();
        //}
        
        //}

    
    public double getSaldoTotal() {

        double suma_cuentas = 0;

        for (double a : cuentas) {

            suma_cuentas += a;
        }
        return suma_cuentas;
    }

    private final double[] cuentas;

    
    //instanseamos look para bloquear los hilos
    //private Lock cierreBanco = new ReentrantLock();
    
    //private Condition saldoSuficiente;
}

class EjecucionTransferencia implements Runnable {

    //almaceno banco la cuenta origen y almacenar la cantidad maxima permitida
    public EjecucionTransferencia(Banco b, int de, double max) {

        banco = b;
        deLaCuenta = de;
        cantidadMax = max;

    }

    @Override
    public void run() {
        try {
            while (true) {
                //se hace un casting porque el metodo random crea numero en decimales
                int paraLaCuenta =(int)(100 * Math.random());
                double cantidad = cantidadMax * Math.random();
                banco.transferencia(deLaCuenta, paraLaCuenta, cantidad);

                Thread.sleep((int)Math.random() * 10);
            }

        }catch (InterruptedException ex) {
        ex.printStackTrace();
        }

    }

    private Banco banco;
    private int deLaCuenta;
    private double cantidadMax;

}
