/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

import java.sql.*;

/**
 *
 * @author daniel
 */
public class JBDCII {

    public static void main(String[] args) {

        try {

            //1)Crear Conection
            //SHOW VARIABLES WHERE VARIABLE_NAME IN('hostname','port'); ->para verificar en la base de datos
            Connection miConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
       
            //2 Crear objeto Statemant
            Statement miStatement = miConnection.createStatement();
            
            //3 Ejecutar sql
            
            ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM productos");
            
            //4 recorrer el resulset
            
           while(miResultSet.next()) {
               
               System.out.println(miResultSet.getString("nombre") + " " + miResultSet.getString("total"));
           }
        
        } catch (Exception e) {
        
            System.out.println("No conecta");
            
            e.printStackTrace();
        
        }
    }

}
