/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author daniel
 */
public class JDBCIII {
    
    //INSERT DELETE UPLOAD
    public static void main(String[] args) {
    

     try {

            //1)Crear Conection
            //SHOW VARIABLES WHERE VARIABLE_NAME IN('hostname','port'); ->para verificar en la base de datos
            Connection miConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
       
            //2 Crear objeto Statemant
            Statement miStatement = miConnection.createStatement();
            
           
           // String instruccionSql = "INSERT INTO productos (id,nombre,subtotal,total) VALUES (3,'Fresa',10,30.50)";
            //String instruccionSql = "UPDATE  productos SET total=total*2 WHERE nombre='escoba' ";
            
            String instruccionSql = "DELETE FROM  productos  WHERE nombre='melocoton' ";
           miStatement.executeUpdate(instruccionSql);
            
            System.out.println("datos del correctamente");
            
            
        
        } catch (Exception e) {
        
            System.out.println("No conecta");
            
            e.printStackTrace();
        
        }

    }
}
