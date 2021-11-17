/*
    De Jesus Pacheco Yahir
    Yaniz Sanchez Diego Nathan
*/
package Interfaz;

import Acciones.Boton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.*;

public class Cifrado extends JFrame{
    
    public static JLabel TLLPublica;
    public static JPasswordField TLLPrivada;
    public static JLabel TFirma;
    public static JTextArea TMensaje;
     
    public Cifrado (){
        
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
        
        
        
        TLLPrivada = Boton.CrearPasswordField("", 360, 172, 260, 40, panel);
        
        TLLPublica = Boton.CrearTexto("", 360, 262, 260, 40, panel);
        
        TFirma = Boton.CrearTexto("", 360, 352, 260, 40, panel);
        
        TMensaje = Boton.CrearTextArea("", 375, 442, 529, 160, panel);
        
        
        
        JLabel BRegresar = Boton.CrearBoton("1.11.1", 80, 80, 80, 50, panel);
        
        JLabel BRegresarb = Boton.CrearBoton("1.11.2", 80, 80, 80, 50, panel);
        BRegresarb.setVisible(false);
        
        JLabel BRegresarc = Boton.CrearBoton("1.11.3", 80, 80, 80, 50, panel);
        BRegresarc.setVisible(false);
        
        
        
        JLabel BGLLPublica = Boton.CrearBoton("1.1.1", 660, 262, 280, 40, panel);
        
        JLabel BGLLPublicab = Boton.CrearBoton("1.1.2", 660, 262, 280, 40, panel);
        BGLLPublicab.setVisible(false);
        
        JLabel BGLLPublicac = Boton.CrearBoton("1.1.3", 660, 262, 280, 40, panel);
        BGLLPublicac.setVisible(false);
        
        
        
        JLabel BSArchivo = Boton.CrearBoton("1.4.1", 967, 509, 280, 40, panel);
        
        JLabel BSArchivob = Boton.CrearBoton("1.4.2", 967, 509, 280, 40, panel);
        BSArchivob.setVisible(false);
        
        JLabel BSArchivoc = Boton.CrearBoton("1.4.3", 967, 509, 280, 40, panel);
        BSArchivoc.setVisible(false);
        
        
        
        JLabel BCifrar = Boton.CrearBoton("1.7.1", 440, 633, 400, 60, panel);
        
        JLabel BCifrarb = Boton.CrearBoton("1.7.2", 440, 633, 400, 60, panel);
        BCifrarb.setVisible(false);
        
        JLabel BCifrarc = Boton.CrearBoton("1.7.3", 440, 633, 400, 60, panel);
        BCifrarc.setVisible(false);
        
        JLabel Fondo = Boton.CrearBoton("1.0.0", 0, 0, 1280, 720, panel);
        
        Boton.Boton(BRegresar, BRegresarb, BRegresarc, "BRegresar", panel);
        Boton.Boton(BGLLPublica, BGLLPublicab, BGLLPublicac, "BGLLPublica", panel);
        Boton.Boton(BSArchivo, BSArchivob, BSArchivoc, "BSArchivob", panel);
        Boton.Boton(BCifrar, BCifrarb, BCifrarc, "BCifrar", panel);
        
    }
    
} 