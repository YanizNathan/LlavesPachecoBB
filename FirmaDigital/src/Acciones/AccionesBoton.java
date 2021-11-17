/*
    De Jesus Pacheco Yahir
    Yaniz Sanchez Diego Nathan
*/
package Acciones;

//import Clases.*;
import Clases.*;
import Interfaz.*;
import java.awt.Frame;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AccionesBoton {
    
    private static boolean inscripcion = false;
    private static boolean FWindows = false;

    public static void AccionesBoton(String nombre, JPanel panel) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, Exception{
        
        switch(nombre){
            
            case "BMinimizar" :
                Principal.inicial.setState(Frame.ICONIFIED);
                Principal.cifrado.setState(Frame.ICONIFIED);
                Principal.descifrado.setState(Frame.ICONIFIED);
            break;
            
            case "BCerrar" :
                System.exit(0);
            break;
            
            case "BICifrar" :
                Principal.cifrado.setVisible(true);
                Principal.inicial.setVisible(false);
            break;
            
            case "BIDescifrar" :
                Principal.descifrado.setVisible(true);
                Principal.inicial.setVisible(false);
            break;
            
            case "BRegresar" :
                Principal.inicial.setVisible(true);
                Principal.cifrado.setVisible(false);
                Principal.descifrado.setVisible(false);
            break;
            
            case "BCifrar" :
                if(Cifrado.TLLPublica.equals("") || String.valueOf(Cifrado.TLLPrivada.getPassword()).equals("")){
                                JOptionPane.showMessageDialog(null, "Por favor termina de generar las llaves");
                }else{
                    
                if(Logica.seleccionado.showDialog(null, "Guardar Llave publica") == JFileChooser.APPROVE_OPTION){
                        Logica.archivo = Logica.seleccionado.getSelectedFile();
                        if(Logica.archivo.getName().endsWith("txt")){
                            String contenido = Cifrado.TLLPublica.getText();
                            String respuesta = Logica.earchivo.GuardarLLPublica(Logica.archivo, Logica.parDeClaves.getPublic().getEncoded());
                            if(respuesta != null){
                                JOptionPane.showMessageDialog(null, respuesta);
                            }else{
                                JOptionPane.showMessageDialog(null, "Hubo un error al guardar la llave publica");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Formato incorrecto");
                        }
                }
                if(Logica.seleccionadob.showDialog(null, "Guardar Llave Privada") == JFileChooser.APPROVE_OPTION){
                        Logica.archivob = Logica.seleccionadob.getSelectedFile();
                        if(Logica.archivob.getName().endsWith("txt")){
                            String contenido = new String(Cifrado.TLLPrivada.getPassword());
                            String respuesta = Logica.earchivob.GuardarLLPrivada(Logica.archivob, contenido);
                            if(respuesta != null){
                                JOptionPane.showMessageDialog(null, respuesta);
                            }else{
                                JOptionPane.showMessageDialog(null, "Hubo un error al guardar la llave privada");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Formato incorrecto");
                        }
                }
                
                
                byte[] data = Cifrado.TMensaje.getText().getBytes();
                Signature dsa = Signature.getInstance("SHA1withRSA"); 
                KeyPair parDeClaves = Logica.claves.get(String.valueOf(Cifrado.TLLPrivada.getPassword()));
                dsa.initSign(parDeClaves.getPrivate());
                dsa.update(data);
                byte[] firma = dsa.sign();
                
                if(Logica.seleccionadoc.showDialog(null, "Guardar Firma Digital") == JFileChooser.APPROVE_OPTION){
                        Logica.archivoc = Logica.seleccionadoc.getSelectedFile();
                        if(Logica.archivoc.getName().endsWith("txt")){
                            String respuesta = Logica.earchivoc.GuardarFirma(Logica.archivoc, firma);
                            if(respuesta != null){
                                JOptionPane.showMessageDialog(null, respuesta);
                            }else{
                                JOptionPane.showMessageDialog(null, "Hubo un error al guardar la firma digital");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Formato incorrecto");
                        }
                }
                if(Logica.seleccionadod.showDialog(null, "Guardar Mensaje") == JFileChooser.APPROVE_OPTION){
                        Logica.archivod = Logica.seleccionadod.getSelectedFile();
                        if(Logica.archivod.getName().endsWith("txt")){
                            String contenido = Cifrado.TMensaje.getText();
                            String respuesta = Logica.earchivod.GuardarMensaje(Logica.archivod, contenido);
                            if(respuesta != null){
                                JOptionPane.showMessageDialog(null, respuesta);
                            }else{
                                JOptionPane.showMessageDialog(null, "Hubo un error al guardar el mensaje");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Formato incorrecto");
                        }
                }
                }
            break;
            
            case "BDescifrar" :
                boolean respuesta = Logica.validarFirma(Logica.archivod.getAbsolutePath(), Logica.archivoe.getAbsolutePath(), Logica.archivof.getAbsolutePath());
                if(respuesta){
                    Descifrado.TEstado.setText("Firma correcta");
                    Descifrado.TMensaje.setText(Logica.earchivod.AbrirATexto(Logica.archivod));
                }else{
                    Descifrado.TEstado.setText("Firma incorrecta");
                }
            break;
            
            case "BSArchivob" :
                if(Logica.seleccionadog.showDialog(null, "Seleccionar") == JFileChooser.APPROVE_OPTION){
                    Logica.archivog = Logica.seleccionadog.getSelectedFile();
                    if(Logica.archivog.canRead()){
                        if(Logica.archivog.getName().endsWith("txt")){
                            Logica.contenido = Logica.earchivog.AbrirATexto(Logica.archivog);
                            Cifrado.TMensaje.setText(Logica.contenido);
                        }else{
                            JOptionPane.showMessageDialog(null, "Tipo de archivo no permitido");
                        }
                    }
                }
                
            break;
            
            case "BSArchivo" :
                if(Logica.seleccionadod.showDialog(null, "Seleccionar") == JFileChooser.APPROVE_OPTION){
                    Logica.archivod = Logica.seleccionadod.getSelectedFile();
                    if(Logica.archivod.canRead()){
                        if(Logica.archivod.getName().endsWith("txt")){
                            Logica.contenido = Logica.earchivod.AbrirATexto(Logica.archivod);
                            Descifrado.TArchivo.setText(Logica.contenido);
                        }else{
                            JOptionPane.showMessageDialog(null, "Tipo de archivo no permitido");
                        }
                    }
                }
                
            break;
            
            case "BSArchivoF" :
                if(Logica.seleccionadoe.showDialog(null, "Seleccionar") == JFileChooser.APPROVE_OPTION){
                    Logica.archivoe = Logica.seleccionadoe.getSelectedFile();
                    if(Logica.archivoe.canRead()){
                        if(Logica.archivoe.getName().endsWith("txt")){
                            Logica.contenido = Logica.earchivoe.AbrirATexto(Logica.archivoe);
                            Descifrado.TArchivoF.setText(Logica.contenido);
                        }else{
                            JOptionPane.showMessageDialog(null, "Tipo de archivo no permitido");
                        }
                    }
                }
                
            break;
            
            case "BSLLPublica" :
                if(Logica.seleccionadof.showDialog(null, "Seleccionar") == JFileChooser.APPROVE_OPTION){
                    Logica.archivof = Logica.seleccionadof.getSelectedFile();
                    if(Logica.archivof.canRead()){
                        if(Logica.archivof.getName().endsWith("txt")){
                            Logica.contenido = Logica.earchivof.AbrirATexto(Logica.archivof);
                            Descifrado.TLLPublica.setText(Logica.contenido);
                        }else{
                            JOptionPane.showMessageDialog(null, "Tipo de archivo no permitido");
                        }
                    }
                }
            break;
                
            case "BGLLPublica" :
                
                if(String.valueOf(Cifrado.TLLPrivada.getPassword()).equals("")){
                    JOptionPane.showMessageDialog(null, "Por favor genere una llave privada", "Error", JOptionPane.WARNING_MESSAGE);
                }else{
                    Logica.generarClave(String.valueOf(Cifrado.TLLPrivada.getPassword()));
                    Logica.parDeClaves = Logica.claves.get(String.valueOf(Cifrado.TLLPrivada.getPassword()));
                    Cifrado.TLLPublica.setText(Logica.parDeClaves.getPublic().getEncoded().toString());
                }
            break;
            
            case "BGFirma" :
                
                if(Cifrado.TMensaje.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Por favor escriba un mensaje", "Error", JOptionPane.WARNING_MESSAGE);
                }else{
                    
                }
            break;
            
        }
        
    }
    
}