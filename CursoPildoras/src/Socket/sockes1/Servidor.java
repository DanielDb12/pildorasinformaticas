package Socket.sockes1;



import javax.swing.*;

import java.awt.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor extends JFrame implements Runnable{
    
      private	JTextArea areatexto;
  

      
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
                
                Thread mihilo = new Thread(this);
                
                mihilo.start();
		
		}
	
	

    @Override
    public void run() {
        
        
        //colocamos la puerta para que acceda la informacion ahora debemos crear un ImputStream
        
            try {
                ServerSocket server = new ServerSocket(9995);
                  
                 String nick, ip ,message;
                
                PaqueteEnvio paquete_recibido;
                
                while(true) {
               
                
             
                
                   //aqui se trae inputStream para recibir imformacion
                   
                Socket mysocket = server.accept();
                
               // DataInputStream flujo_entrada = new DataInputStream(mysocket.getInputStream());
               
               ObjectInputStream paquete_datos = new ObjectInputStream(mysocket.getInputStream());
               
               //lea el flujo de datos y que lo almacene en paquete recibido
               //los objetos no corresponde se debe hacer casteo
               paquete_recibido= (PaqueteEnvio) paquete_datos.readObject();
               
               nick=paquete_recibido.getNick();
               ip=paquete_recibido.getIp();
               message=paquete_recibido.getMessage();
               
                //String message_text = flujo_entrada.readUTF();
                
                //areatexto.append("\n" + message_text);
                
                
                areatexto.append("\n" + nick + ":" + message + "parts" + ip);
                mysocket.close();
               }
                
            } catch (IOException  | ClassNotFoundException ex) {
               ex.printStackTrace();
            }
    }
        
      
        
}
