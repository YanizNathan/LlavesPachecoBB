/*
    De Jesus Pacheco Yahir
    Yaniz Sanchez Diego Nathan
*/
package Interfaz;

import Acciones.Boton;
import java.awt.Toolkit;
import javax.swing.*;

public class Descifrado extends JFrame{
    
    public static JLabel TArchivo;
    public static JLabel TArchivoF;
    public static JLabel TLLPublica;
    public static JLabel TEstado;
    public static JTextArea TMensaje;
     
    public Descifrado (){
        
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
        
        
        
        TArchivo = Boton.CrearTexto("", 210, 172, 260, 40, panel);
        
        TArchivoF = Boton.CrearTexto("", 210, 262, 260, 40, panel);
        
        TLLPublica = Boton.CrearTexto("", 210, 352, 260, 40, panel);
        
        TEstado = Boton.CrearTexto("", 832, 352, 260, 40, panel);
        
        TMensaje = Boton.CrearTextArea("", 375, 442, 529, 160, panel);
        
        
        
        JLabel BRegresar = Boton.CrearBoton("1.11.1", 80, 80, 80, 50, panel);
        
        JLabel BRegresarb = Boton.CrearBoton("1.11.2", 80, 80, 80, 50, panel);
        BRegresarb.setVisible(false);
        
        JLabel BRegresarc = Boton.CrearBoton("1.11.3", 80, 80, 80, 50, panel);
        BRegresarc.setVisible(false);
        
        
        
        JLabel BSArchivo = Boton.CrearBoton("1.4.1", 510, 172, 280, 40, panel);
        
        JLabel BSArchivob = Boton.CrearBoton("1.4.2", 510, 172, 280, 40, panel);
        BSArchivob.setVisible(false);
        
        JLabel BSArchivoc = Boton.CrearBoton("1.4.3", 510, 172, 280, 40, panel);
        BSArchivoc.setVisible(false);
        
        
        
        JLabel BSArchivoF = Boton.CrearBoton("1.5.1", 510, 262, 280, 40, panel);
        
        JLabel BSArchivoFb = Boton.CrearBoton("1.5.2", 510, 262, 280, 40, panel);
        BSArchivoFb.setVisible(false);
        
        JLabel BSArchivoFc = Boton.CrearBoton("1.5.3", 510, 262, 280, 40, panel);
        BSArchivoFc.setVisible(false);
        
        
        
        JLabel BSLLPublica = Boton.CrearBoton("1.6.1", 510, 352, 280, 40, panel);
        
        JLabel BSLLPublicab = Boton.CrearBoton("1.6.2", 510, 352, 280, 40, panel);
        BSLLPublicab.setVisible(false);
        
        JLabel BSLLPublicac = Boton.CrearBoton("1.6.3", 510, 352, 280, 40, panel);
        BSLLPublicac.setVisible(false);
        
        
        
        JLabel BDescifrar = Boton.CrearBoton("1.8.1", 440, 633, 400, 60, panel);
        
        JLabel BDescifrarb = Boton.CrearBoton("1.8.2", 440, 633, 400, 60, panel);
        BDescifrarb.setVisible(false);
        
        JLabel BDescifrarc = Boton.CrearBoton("1.8.3", 440, 633, 400, 60, panel);
        BDescifrarc.setVisible(false);
        JLabel Fondo = Boton.CrearBoton("2.0.0", 0, 0, 1280, 720, panel);
        
        Boton.Boton(BRegresar, BRegresarb, BRegresarc, "BRegresar", panel);
        Boton.Boton(BSArchivo, BSArchivob, BSArchivoc, "BSArchivo", panel);
        Boton.Boton(BSArchivoF, BSArchivoFb, BSArchivoFc, "BSArchivoF", panel);
        Boton.Boton(BSLLPublica, BSLLPublicab, BSLLPublicac, "BSLLPublica", panel);
        Boton.Boton(BDescifrar, BDescifrarb, BDescifrarc, "BDescifrar", panel);
        
    }
    
} 