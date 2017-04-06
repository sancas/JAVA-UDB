/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa120974;

import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

/**
 *
 * @author sanch
 */
public class ExaminarNumero extends JApplet {
    
    private String sRespuesta;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        String sNumero;
        double dNumero;

        sNumero = JOptionPane.showInputDialog("Digitar un numero");

        dNumero = Double.parseDouble(sNumero);
        
        if (dNumero < 0)
            sRespuesta = "El numero es negativo";
        else if (dNumero%2 == 0)
            sRespuesta = "El numero es positivo par";
        else
            sRespuesta = "El numero es positivo impar";
    }

    // TODO overwrite start(), stop() and destroy() methods
    public void paint(Graphics g) {
        g.drawRect(15, 10, 270, 20);
        g.drawString(sRespuesta, 25, 25);
    }
}
