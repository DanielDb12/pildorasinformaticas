/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

import javax.swing.*;

import java.awt.*;

import java.sql.*;

/**
 *
 * @author daniel
 */
public class JBDCVIPRACTICA {

    public static void main(String[] args) {

        JFrame mimarco = new Marco_Aplicacion();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mimarco.setVisible(true);

    }
}

class Marco_Aplicacion extends JFrame {

    public Marco_Aplicacion() {

        setTitle("Consulta BBDD");

        setBounds(500, 300, 400, 400);

        setLayout(new BorderLayout());

        JPanel menus = new JPanel();

        menus.setLayout(new FlowLayout());

        secciones = new JComboBox();

        secciones.setEditable(false);

        secciones.addItem("Todos");

        paises = new JComboBox();

        paises.setEditable(false);

        paises.addItem("Todos");

        resultado = new JTextArea(4, 50);

        resultado.setEditable(false);

        add(resultado);

        menus.add(secciones);

        menus.add(paises);

        add(menus, BorderLayout.NORTH);

        add(resultado, BorderLayout.CENTER);

        JButton botonConsulta = new JButton("Consulta");

        add(botonConsulta, BorderLayout.SOUTH);

        //---------------------------CONEXION BASE DE DATOS
        try {

            //1)Crear Conection
            //SHOW VARIABLES WHERE VARIABLE_NAME IN('hostname','port'); ->para verificar en la base de datos
            Connection miConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");

            Statement miStatement = miConnection.createStatement();
            
            //consulta a la base de dato
            //Cargar secciones
            String consulta= "SELECT DISTINCTROW section FROM productos";
            
            
             //3 Ejecutar sql
            
            ResultSet miResultSet = miStatement.executeQuery(consulta);
            
            
            while (miResultSet.next()) {
  
                secciones.addItem(miResultSet.getString(1));
    
}
            
            miResultSet.close();
            
            
            //CARGA JCOMBOBOX PAISES
            
             consulta = "SELECT DISTINCTROW paises FROM productos";

            //3 Ejecutar sql
             miResultSet = miStatement.executeQuery(consulta);

            while (miResultSet.next()) {

                paises.addItem(miResultSet.getString(1));

            }

            miResultSet.close();

        } catch (Exception e) {

        }

    }

    private JComboBox secciones;

    private JComboBox paises;

    private JTextArea resultado;

}
