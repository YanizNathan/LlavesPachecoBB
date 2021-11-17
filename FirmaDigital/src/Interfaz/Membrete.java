/*
    De Jesus Pacheco Yahir
    Yaniz Sanchez Diego Nathan
*/
package Interfaz;

import Acciones.Boton;
import javax.swing.*;

public class Membrete {
    
    public static void Membrete(JPanel panel){
        
        JLabel BMinimizar = Boton.CrearBoton("0.7.1", 1160, 0, 40, 40, panel);
        
        JLabel BMinimizarb = Boton.CrearBoton("0.7.2", 1160, 0, 40, 40, panel);
        BMinimizarb.setVisible(false);
        
        JLabel BMinimizarc = Boton.CrearBoton("0.7.1", 1160, 0, 40, 40, panel);
        BMinimizarc.setVisible(false);
        
        
        
        JLabel BMaximizar = Boton.CrearBoton("0.8.2", 1200, 0, 40, 40, panel);
        
        
        
        JLabel BCerrar = Boton.CrearBoton("0.9.1", 1240, 0, 40, 40, panel);
        
        JLabel BCerrarb = Boton.CrearBoton("0.9.2", 1240, 0, 40, 40, panel);
        BCerrarb.setVisible(false);
        
        JLabel BCerrarc = Boton.CrearBoton("0.9.1", 1240, 0, 40, 40, panel);
        BCerrarc.setVisible(false);
        
        Boton.Boton(BMinimizar, BMinimizarb, BMinimizarc, "BMinimizar", panel);
        Boton.Boton(BCerrar, BCerrarb, BCerrarc, "BCerrar", panel);
     
    }
}
