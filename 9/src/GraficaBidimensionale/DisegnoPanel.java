/*
 * DisegnoPanel.java
 *
 * Created on November 26, 2007, 8:16 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package GraficaBidimensionale;

/**
 *
 * @author frick
 */
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class DisegnoPanel extends JPanel {
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        //disegniamo i rettangoli
        double partenzaX=100;
        double finaleY=100;
        double larghezza=200;
        double altezza=150;
        
        Rectangle2D rettangolo=new Rectangle2D.Double(partenzaX,finaleY,larghezza,altezza);
        g2.draw(rettangolo);
        Rectangle2D rettangolo1=new Rectangle2D.Double(partenzaX-10,finaleY-10,larghezza+20,altezza+20);
        g2.draw(rettangolo1);
        rettangolo1.setFrame(partenzaX-15,finaleY-15,larghezza+30,altezza+30);
        g2.draw(rettangolo1);
        //disegniamo un elisse
        
        Ellipse2D ellisse=new Ellipse2D.Double();
        ellisse.setFrame(rettangolo);
        g2.draw(ellisse);
        ellisse.setFrame(rettangolo1);
        g2.draw(ellisse);
        
        //disegniamo alcune linee
        g2.draw(new Line2D.Double(partenzaX,finaleY,partenzaX+larghezza,finaleY+altezza));//100,100,300,250 disegno la linea \
        g2.draw(new Line2D.Double(partenzaX+larghezza,finaleY,partenzaX,finaleY+altezza));//disegno la linea /
     
        //Disegniamo un cerchio concentrico
   
        double centroX=rettangolo.getCenterX();
        double centroY=rettangolo.getCenterY();
             System.out.println(centroX+"-"+centroY);
        double raggio=150;
        
        Ellipse2D cerchio=new Ellipse2D.Double();
        cerchio.setFrameFromCenter(centroX,centroY,centroX+raggio,centroY+raggio);
        g2.draw(cerchio);
        cerchio.setFrameFromCenter(centroX,centroY,centroX+raggio-5,centroY+raggio-5);
        g2.draw(cerchio);
        cerchio.setFrameFromCenter(centroX,centroY,centroX+raggio-10,centroY+raggio-10);
        g2.draw(cerchio);
        
        }
    
}
