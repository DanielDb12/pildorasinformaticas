/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author daniel
 */
public class Uso_Coche {
    
    public static void main(String[] args) {
    
        Coche auto = new Coche();
        
        auto.establecer_weight(1500);
        auto.establecer_marca("renult");
        auto.establecer_color("yellow");
        auto.establecer_type("car");
        auto.establecer_wheels(4);
        
        
        /*System.out.println(auto.dime_color());
        System.out.println(auto.dime_marca());
        System.out.println(auto.dime_weight());
         System.out.println(auto.dime_wheels());
        System.out.println(auto.dime_Type());*/
        System.out.println(auto.dime_datos_generales());
        
}
    
}
