/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generica;

/**
 *
 * @author daniel
 */
public class CreacionGenerica165<T> {
    
    /*
    Estos argumentos de tipo generico se usa en letr mayuscula T,U,K por convencion
    */
    
    public CreacionGenerica165(){
    
        primero=null;
    }
    
    public void setPrimero(T nuevoValor){
    
        primero = nuevoValor;
    
    
    }
    
    public T getPrimero(){
    
        return primero ;
    }
    
    private T primero;
    
}
