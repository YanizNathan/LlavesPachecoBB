/*
    De Jesus Pacheco Yahir
    Yaniz Sanchez Diego Nathan
*/
package Clases;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import javax.swing.JFileChooser;

public class Logica {

    public static JFileChooser seleccionado = new JFileChooser();
    public static JFileChooser seleccionadob = new JFileChooser();
    public static JFileChooser seleccionadoc = new JFileChooser();
    public static JFileChooser seleccionadod = new JFileChooser();
    public static JFileChooser seleccionadoe = new JFileChooser();
    public static JFileChooser seleccionadof = new JFileChooser();
    public static JFileChooser seleccionadog = new JFileChooser();
    public static File archivo;
    public static File archivob;
    public static File archivoc;
    public static File archivod;
    public static File archivoe;
    public static File archivof;
    public static File archivog;
    public static Archivo earchivo = new Archivo();
    public static Archivo earchivob = new Archivo();
    public static Archivo earchivoc = new Archivo();
    public static Archivo earchivod = new Archivo();
    public static Archivo earchivoe = new Archivo();
    public static Archivo earchivof = new Archivo();
    public static Archivo earchivog = new Archivo();
    public static String contenido, Mensaje;
    public static HashMap<String, KeyPair> claves;
    public static KeyPairGenerator generador;
    public static KeyPair parDeClaves;
    
    public Logica() throws NoSuchAlgorithmException{
    }


    public static void generarClave(String password) throws NoSuchAlgorithmException{
        
        generador = KeyPairGenerator.getInstance("RSA");
        generador.initialize(1024);
        claves = new HashMap<>(100);
        claves.put(password, generador.generateKeyPair());
    
    }
public static boolean validarFirma(String rutaArchivo, String rutaFirma, String rutaClavePublica) throws Exception{
    byte[] datos = leerArchivo(rutaArchivo);
    byte[] firma = leerArchivo(rutaFirma);
    PublicKey clavePublica = leerClavePublicaDesdeArchivo(rutaClavePublica);
    Signature signature = Signature.getInstance("SHA1withRSA");
    signature.initVerify(clavePublica);
    signature.update(datos);
        return signature.verify(firma);

    }


    public static byte[] leerArchivo(String ruta) throws Exception{
        
        return Files.readAllBytes(Paths.get(ruta));
    
    }


    public static PublicKey leerClavePublicaDesdeArchivo(String ruta) throws Exception{
        
        byte[] keyBytes = leerArchivo(ruta);
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePublic(spec);
    
    }
    
    
}
