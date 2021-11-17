/*
    De Jesus Pacheco Yahir
    Yaniz Sanchez Diego Nathan
*/
package Interfaz;

import Acciones.Boton;
import java.awt.Toolkit;
import javax.swing.*;

public class Inicial extends JFrame{
     
    public Inicial (){
        
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setTitle("Firma Digital");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        Elementos();
        
    }
    
    public void Elementos(){
        
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/icono.png")));
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
            
        Membrete.Membrete(panel);
        
        JLabel BCifrar = Boton.CrearBoton("1.9.1", 287, 270, 300, 350, panel);
        
        JLabel BCifrarb = Boton.CrearBoton("1.9.2", 287, 270, 300, 350, panel);
        BCifrarb.setVisible(false);
        
        JLabel BCifrarc = Boton.CrearBoton("1.9.3", 287, 270, 300, 350, panel);
        BCifrarc.setVisible(false);
        
        
        
        JLabel BDescifrar = Boton.CrearBoton("1.10.1", 693, 270, 300, 350, panel);
        
        JLabel BDescifrarb = Boton.CrearBoton("1.10.2", 693, 270, 300, 350, panel);
        BDescifrarb.setVisible(false);
        
        JLabel BDescifrarc = Boton.CrearBoton("1.10.3", 693, 270, 300, 350, panel);
        BDescifrarc.setVisible(false);
            
        JLabel Fondo = Boton.CrearBoton("0.0.0", 0, 0, 1280, 720, panel);
        
        Boton.Boton(BCifrar, BCifrarb, BCifrarc, "BICifrar", panel);
        Boton.Boton(BDescifrar, BDescifrarb, BDescifrarc, "BIDescifrar", panel);
        
    }
    
} 