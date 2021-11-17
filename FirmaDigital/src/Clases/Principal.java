/*
    De Jesus Pacheco Yahir
    Yaniz Sanchez Diego Nathan
*/

package Clases;

import Interfaz.*;

public class Principal {
    
    public static Inicial inicial = new Inicial();
    public static Cifrado cifrado = new Cifrado();
    public static Descifrado descifrado = new Descifrado();
    
    public static void main(String[] args) {
        
        inicial.setVisible(true);
        cifrado.setVisible(false);
        descifrado.setVisible(false);
        
    }
    
}