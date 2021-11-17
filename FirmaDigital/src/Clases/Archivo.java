/*
    De Jesus Pacheco Yahir
    Yaniz Sanchez Diego Nathan
*/
package Clases;
import java.io.*;

public class Archivo {
    
    FileInputStream entrada;
    FileOutputStream salida;
    FileOutputStream salidab;
    FileOutputStream salidac;
    FileOutputStream salidad;
    File archivo;
    
    public Archivo(){
    
    }  
    
    public String AbrirATexto(File archivo){
        
        String contenido="";
        try{
            entrada = new FileInputStream(archivo);
            int ascci;
            while((ascci = entrada.read()) != -1){
                char caracter = (char)ascci;
                contenido += caracter;
            }
        }catch(Exception e){}
        return contenido;
        
    }
    
    
    public String GuardarLLPublica(File archivo, byte[] contenido){
        
        String respuesta = null;
        try{
            salida = new FileOutputStream(archivo);
            salida.write(contenido);
            respuesta = "Se guardo con exito la llave pública";
        }catch(Exception e){}
        return respuesta;
        
    }
    
    
    public String GuardarLLPrivada(File archivo, String contenido){
        
        String respuesta = null;
        try{
            salidab = new FileOutputStream(archivo);
            byte[] bytestTxt = contenido.getBytes();
            salidab.write(bytestTxt);
            respuesta = "Se guardo con exito la llave privada";
        }catch(Exception e){}
        return respuesta;
        
    }
    
    
    public String GuardarFirma(File archivo, byte[] contenido){
        
        String respuesta = null;
        try{
            salidac = new FileOutputStream(archivo);
            salidac.write(contenido);
            respuesta = "Se guardo con exito la firma digital";
        }catch(Exception e){}
        return respuesta;
        
    }
    
    
    public String GuardarMensaje(File archivo, String contenido){
        
        String respuesta = null;
        try{
            salidad = new FileOutputStream(archivo);
            byte[] bytestTxt = contenido.getBytes();
            salidad.write(bytestTxt);
            respuesta = "Se guardo con exito el mensaje";
        }catch(Exception e){}
        return respuesta;
        
    }
    
    
    
}