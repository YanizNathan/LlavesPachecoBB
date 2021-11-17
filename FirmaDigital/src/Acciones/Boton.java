/*
    De Jesus Pacheco Yahir
    Yaniz Sanchez Diego Nathan
*/
package Acciones;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Boton {
    
    public static void Boton(JLabel Boton, JLabel Botonb, JLabel Botonc, String nombre, JPanel panel){
        
        MouseListener EventoMouse = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Boton.setVisible(true);
                Botonb.setVisible(false);
                Botonc.setVisible(false);
                try {
                    AccionesBoton.AccionesBoton(nombre, panel);
                } catch (SignatureException ex) {
                    Logger.getLogger(Boton.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(Boton.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }

            @Override
            public void mousePressed(MouseEvent e) {

                Boton.setVisible(false);
                Botonb.setVisible(false);
                Botonc.setVisible(true);
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {}
            
            @Override
            public void mouseEntered(MouseEvent e) {

                Boton.setVisible(false);
                Botonb.setVisible(true);
                Botonc.setVisible(false);
                
                Boton.setCursor(new Cursor(HAND_CURSOR));
                Botonb.setCursor(new Cursor(HAND_CURSOR));
                Botonc.setCursor(new Cursor(HAND_CURSOR));
                
            }

            @Override
            public void mouseExited(MouseEvent e) {

                Boton.setVisible(true);
                Botonb.setVisible(false);
                Botonc.setVisible(false);
                
            }
        };
        
        Boton.addMouseListener(EventoMouse);
        Botonb.addMouseListener(EventoMouse);
        Botonc.addMouseListener(EventoMouse);
        
    }
    
    public static JLabel CrearBoton(String nombref, int coordenadax, int coordenaday, int ancho, int alto, JPanel panel){
        
        String archivo;
        archivo = "src/Images/"+nombref+".png";
        
        JLabel boton = new JLabel(new ImageIcon(archivo));
        boton.setBounds(coordenadax, coordenaday, ancho, alto);
        panel.add(boton);
        
        return boton;
    }
    
    public static JLabel CrearFoto(String nombref, int coordenadax, int coordenaday, int ancho, int alto, JPanel panel){
        
        String archivo;
        archivo = "src/Images/"+nombref+".jpg";
        
        JLabel foto = new JLabel(new ImageIcon(archivo));
        foto.setBounds(coordenadax, coordenaday, ancho, alto);
        panel.add(foto);
        
        return foto;
    }
    
    public static JLabel CrearTexto(String text, int coordenadax, int coordenaday, int ancho, int alto, JPanel panel){
        
        JLabel texto = new JLabel(text);
        texto.setBounds(coordenadax, coordenaday, ancho, alto);
        texto.setForeground(Color.decode("#0EBEFF"));
        texto.setHorizontalAlignment(SwingConstants.CENTER);
        texto.setFont(new Font("arial", Font.PLAIN,20));
        texto.setOpaque(false);
        panel.add(texto);
        
        return texto;
    }
    
    public static JTextArea CrearTextArea(String text, int coordenadax, int coordenaday, int ancho, int alto, JPanel panel){
        
        JTextArea texto = new JTextArea(text);
        texto.setEditable(false);
        texto.setBounds(coordenadax, coordenaday, ancho, alto);
        texto.setForeground(Color.decode("#0EBEFF"));
        texto.setFont(new Font("arial", Font.PLAIN,20));
        texto.setOpaque(false);
        panel.add(texto);
        
        return texto;
    }
    
    public static JPasswordField CrearPasswordField(String text, int coordenadax, int coordenaday, int ancho, int alto, JPanel panel){
        
        JPasswordField texto = new JPasswordField(text);
        texto.setBorder(BorderFactory.createLineBorder(Color.white));
        texto.setBounds(coordenadax, coordenaday, ancho, alto);
        texto.setForeground(Color.decode("#0EBEFF"));
        texto.setFont(new Font("arial", Font.PLAIN,20));
        texto.setOpaque(false);
        panel.add(texto);
        
        return texto;
    }
    
}