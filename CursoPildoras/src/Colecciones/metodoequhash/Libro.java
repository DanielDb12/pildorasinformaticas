/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones.metodoequhash;

/**
 *
 * @author daniel
 */
public class Libro {

    public Libro(String titulo, String nombre, int ISBN) {

        this.titulo = titulo;
        this.nombre = nombre;
        this.ISBN = ISBN;

    }

    private String getDatos() {

        return "el titulo es " + titulo + " el nombre es " + nombre + " el ISBN es :" + ISBN;

    }

/*    public boolean equals(Object obj) {

        //
        if (obj instanceof Libro) {

            Libro otro = (Libro) obj;

            if (this.ISBN == otro.ISBN) {

                return true;

            } else {

                return false;

            }

        } else {
            return false;
        }

    }*/

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        return this.ISBN == other.ISBN;
    }
    
    
    

    private String titulo;
    private String nombre;
    private int ISBN;

}
