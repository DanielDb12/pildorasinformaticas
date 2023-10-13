/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daniel
 */
public class JDBCV {
    /*
    Permiten pasar parametros a la sentencia sql
    previenen de ataques en inyeccion sql
    tienen un mejor rendimiento
    
    
    */
    public static void main(String[] args) {
    
        
        try {
            //Crear conexion
            Connection mi_Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
            
            //preparar la consulta
            
           PreparedStatement mystatement = mi_Connection.prepareStatement("SELECT nombre, section,  FROM productos" 
                   + "WHERE nombre=? AND section=?");
           
           // Establecer Parametros
           
           mystatement.setString(1, "frutas");
           mystatement.setString(2, "banana");
        
           //4ejecutar consulta
           
           ResultSet rs = mystatement.executeQuery();
           
           while(rs.next()){
           
               System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) );
               
           
           }
           rs.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(JDBCV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
}
    
}
