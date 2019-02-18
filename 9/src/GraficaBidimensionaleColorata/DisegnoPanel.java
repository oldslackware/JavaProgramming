/*
 * DisegnoPanel.java
 *
 * Created on November 26, 2007, 1:05 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package GraficaBidimensionaleColorata;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
 *
 * @author frick
 */
public class DisegnoPanel extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g1=(Graphics2D)g;
        double centroX=200;
        double centroY=175;
        double raggio=150;
        Ellipse2D cerchio=new Ellipse2D.Double();
        cerchio.setFrameFromCenter(centroX,centroY,centroX+raggio,centroY+raggio);
        g1.setColor(Color.GREEN);
        g1.fill(cerchio);
        cerchio.setFrameFromCenter(centroX,centroY,centroX+raggio-25,centroY+raggio-25);
        g1.setColor(new Color(0,255,255));//Colore passato a mano
        g1.fill(cerchio);
        
        cerchio.setFrameFromCenter(centroX,centroY,centroX+raggio-50,centroY+raggio-50);
        g1.setColor(Color.BLUE);
        g1.fill(cerchio);
    }
    
    
    
}
