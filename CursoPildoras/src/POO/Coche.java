/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package POO;

/**
 *
 * @author daniel
 */
public class Coche {

    /*
  Setters: cambia el valor o establecer el valor
             el metodo Setters debe poseer un void ya que no devuelve los datos pero si lo modifica
    Getters: se obtiene el valor. 
             El metodo getter siempre de poseer un return ya que debe devolver el dato
    
    Constructor:
             Caracateristicas -> son las propiedades largo ancho
             metodos -> lo que el objeto es capaz de realizar
    Siempre deben poseer el modificador de acceso public
    
    tipo
        primitivo = doble int long 
    
    
     */
    //Caracteristicas datos genericos
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataform;

    //Caracteristicas propias de cada cohe
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;

    //contructor 
    public Coche() {

        ruedas = 4;
        largo = 1000;
        ancho = 500;
        motor = 1600;
        peso_plataform = 2000;

    }

    //Getter
    //Dato generales
    public String dame_datos_generales() {

        return "la plataforma del vehiculo tiene :" + "ruedas" + ruedas
                + "largo: " + largo + "ancho" + ancho + "motor" + motor
                + "peso plataforma :" + peso_plataform;

    }

    public void establecer_color(String color) {

        this.color = color;

    }

    //GETTER
    public String dime_color() {

        return "el color es: " + color;

    }

    //Setter
    public void establece_asientos(String asientos) {

        if (asientos.equalsIgnoreCase("si")) {

            this.asientos_cuero = true;

        } else {

            this.asientos_cuero = false;

        }

    }

    //Getter
    public String dime_asientos() {

        if (asientos_cuero == true) {
            return " tiene asientos de cuero";
        } else {

            return "tiene asientos de serie";
        }
    }

    void establecer_weight(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void establecer_marca(String renult) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void establecer_type(String car) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void establecer_wheels(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean dime_datos_generales() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     

}
