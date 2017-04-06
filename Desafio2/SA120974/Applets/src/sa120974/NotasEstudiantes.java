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
public class NotasEstudiantes extends JApplet {
    
    private String[][] sRespuesta = {
        { "Alumno", "P1", "P2", "P3", "Promedio" },
        { "Alumno uno", "", "", "", "" },
        { "Alumno dos", "", "", "", "" },
        { "Alumno tres", "", "", "", "" },
        { "Alumno cuatro", "", "", "", "" }
    };

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        String nota;
        for (int x = 1; x <= 4; x++)
        {
            for (int y = 1; y <= 3; y++)
            {
                nota = JOptionPane.showInputDialog("Digite la nota " + y + " del alumno " + x + ": ");
                sRespuesta[x][y] = nota;
            }
        }
        for (int x = 1; x <= 4; x++)
            sRespuesta[x][4] = String.valueOf((Double.parseDouble(sRespuesta[x][1]) 
                    + Double.parseDouble(sRespuesta[x][2]) 
                    + Double.parseDouble(sRespuesta[x][3])) 
                    / 3);
    }

    // TODO overwrite start(), stop() and destroy() methods
    public void paint(Graphics g) {
        for (int y = 10; y < 91; y+=20)
        {
            for (int x = 15; x < 1016; x += 250)
            {
                g.drawRect(x, y, 250, 20);
            }
        }
        for (int y = 25; y < 121; y += 20)
        {
            for (int x = 25; x < 1250; x += 250)
            {
                g.drawString(sRespuesta[(y-25)/20][(x-25)/250], x, y);
            }
        }
    }
}
