package JDBC;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.*;

/**
 *
 * @author daniel
 */
public class JDBCVIIPRACTICA {

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

        botonConsulta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                ejecutaConsulta();

            }

        });

        add(botonConsulta, BorderLayout.SOUTH);

        //---------------------------CONEXION BASE DE DATOS
        try {

            //1)Crear Conection
            //SHOW VARIABLES WHERE VARIABLE_NAME IN('hostname','port'); ->para verificar en la base de datos
            miConnection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");

            //CREAR OBJ STATEMENT
            Statement miStatement = miConnection.createStatement();

            //consulta a la base de dato
            //Cargar secciones
            String consulta = "SELECT DISTINCTROW section FROM productos";

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

            System.err.println("No CONECTA");

        }

    }

    //para no hacerlo acceder desde afuera
    private void ejecutaConsulta() {

        ResultSet rs = null;

        try {

          

            //guardar el elmento desplegable de jupobox
            //se hace un casting porque devuelve un tipo objeto
            //MENU 1:
            String section=(String)secciones.getSelectedItem();
            //MENU 2:
            String pais=(String)paises.getSelectedItem();

            //MIRA VER SI EN LA VARIABLE SECCION EL USUARIO SELECCIONO UNA SECCION 
            if (!section.equals("Todos") && pais.equals("Todos")) {

                //CONSULTA PREPARADA PARA LAS SECCIONES
                enviaConsultaSection = miConnection.prepareStatement(consultaSection);

                //USAMOS MÉTODO SETSTRING() DE LA INTERFAZ PREPAREDSTATEMENT PARA PASARLE EL VALOR POR PARÁMETRO 
                enviaConsultaSection.setString(1, section);

                //EJECUTAMOS LA CONSULTA
                rs = enviaConsultaSection.executeQuery();

                //PARA QUE SE RESETEE EL JTEXTAREA, ENTRE LAS DISTINTAS CONSULTAS SQL
                resultado.setText("");

                //EN ESTE CASO ES LO CONTRARIO SI EL MENU PAIS FUE SELECIONADO
            } else if (section.equals("Todos") && !pais.equals("Todos")) {

                //CONSULTA PREPARADA PARA LAS PAISES
                enviaConsultaPais = miConnection.prepareStatement(consultaPaises);

                enviaConsultaPais.setString(1, pais);

                rs = enviaConsultaPais.executeQuery();

                  //Resetea el resultado
                   resultado.setText("");
                //SI EL PRIMER DESPPLEGLABLE ES DIFERENTE A TODOS Y EL SEGUNDO TAMBIEN        
            
            } else if (!section.equals("Todos") && !pais.equals("Todos")) {

                //CONSULTA PREPARADA PARA LAS PAISES
                enviaConsultaTodos = miConnection.prepareStatement(consultaTodos);

                enviaConsultaTodos.setString(1, section);

                enviaConsultaTodos.setString(2, pais);

                rs = enviaConsultaTodos.executeQuery();
                
                  //Resetea el resultado
                   resultado.setText("");
            }

            while (rs.next()) {

                //AGREGA ARTICULOS EN LAYOUT DEL JCOMBOBOX
                resultado.append(rs.getString(1));
                
                resultado.append(", ");
                
                resultado.append(rs.getString(2));
                
                resultado.append(", ");
                
                resultado.append(rs.getString(3));
                
                resultado.append(", ");
                
                resultado.append(rs.getString(4));

                resultado.append("\n");

            }

        } catch (Exception e) {

            System.err.println("hay un error");
        }

    }

    

    //CONSTANTE ALMACENA CONSULTA PARAMETRIZADA SECTION sql
    private final String consultaSection = "SELECT nombre,section,total,paises FROM productos WHERE section=?";
    //CONSTANTE ALMACENA CONSULTA PARAMETRIZADA PAISES
    private final String consultaPaises = "SELECT nombre,section,total,paises FROM productos WHERE paises=?";
    //CONSTANTE ALMACENA CONSULTA PARAMETRIZADA TODOS
    private final String consultaTodos = "SELECT nombre,section,total,paises FROM productos WHERE section=? AND paises=?";

    // VARIABLE ALMACENA CONSULTA PREPARADA SECTION
    private PreparedStatement enviaConsultaSection;
    // VARIABLE ALMACENA CONSULTA PREPARADA PAISES
    private PreparedStatement enviaConsultaPais;
    // VARIABLE ALMACENA CONSULTA PREPARADA TODOS
    private PreparedStatement enviaConsultaTodos;

    //CAMPOS DE CLASE
    //CONEXION BASE DE DATOS
    private Connection miConnection;
    private JComboBox secciones;
    private JComboBox paises;
    private JTextArea resultado;

}
