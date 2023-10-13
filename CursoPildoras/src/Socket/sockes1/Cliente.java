package Socket.sockes1;



import javax.swing.*;
import java.awt.event.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(600,300,280,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		}	
	
}

class LaminaMarcoCliente extends JPanel{
	
	public LaminaMarcoCliente(){
	
            
                nick = new JTextField(5);
                
                add(nick);
		JLabel texto=new JLabel("Chat");
                
		add(texto);
                
                ip=new JTextField(8);
                add(ip);
                campochat= new JTextArea(12,20);
                add(campochat);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		
                EnviaTexto event= new EnviaTexto();
                
                miboton.addActionListener(event);
                
		add(miboton);
                
                 
		
	}
	
	
	private class EnviaTexto implements  ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
        
        
            try {
                //construccion de Socket
                
                
                
                Socket misocket = new Socket("192.168.0.110" ,9995);
                
                //tenemos que enviar los datos a traves de la red
                PaqueteEnvio datos = new PaqueteEnvio();
                datos.setNick(nick.getText());
                datos.setIp(ip.getText());
                datos.setMessage(campo1.getText());
                
                //flujo de datos stream
                ObjectOutputStream paquete_datos = new ObjectOutputStream(misocket.getOutputStream());
                
                //writebjec
                paquete_datos.writeObject(datos);
                
                //serializacion es necesaria cuando queremos un objeto por la red o cuando queremos tener acceso a un objeto en nuestro sistema de ficher
                //la serializacio consiste en decirle a la clase o objetos en convertirse byte para poder ser enviado por la red
                
                misocket.close();
                
                //construccion del flujo
                /*DataOutputStream flujo_salida = new DataOutputStream(misocket.getOutputStream());
                
                flujo_salida.writeUTF(campo1.getText());
                
                flujo_salida.close();
                */
                
            } catch (UnknownHostException e1) {
                
                //para capturar el error
               e1.printStackTrace();
            } catch (IOException ex) {
                
                System.out.println(ex.getMessage());
            
            }
            
    
        
        }

       
    }
		
		
		
	private JTextField campo1,nick,ip;
      private JTextArea campochat;	
	private JButton miboton;
        
        
	
}

class PaqueteEnvio implements  Serializable{

    // si no serializa el programa manda una exception
    
    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String nick ,ip, message;

    
    

}