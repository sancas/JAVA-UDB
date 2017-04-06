/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa120974;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author sanch
 */
public class ColorJPanel extends JPanel {
    private Color color;
    private String respuesta;
    
    public ColorJPanel(String respuesta, Color color)
    {
        this.respuesta = respuesta;
        this.color = color;
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        int x = 15, y = 25;
        for (String line : respuesta.split("\n"))
            g.drawString(line, x, y += g.getFontMetrics().getHeight());
        g.setColor(color);
        g.fillRect(15, 100, 100, 20);
    }
}
