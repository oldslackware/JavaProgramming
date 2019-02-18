/*
 * DisegnoFrame.java
 *
 * Created on November 26, 2007, 8:15 AM
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
public class DisegnoFrame extends JFrame{
public static final int LARGHEZZA=500;
public static final int ALTEZZA=500;
  
    public DisegnoFrame() {
        Toolkit kit=Toolkit.getDefaultToolkit();
        Image img=kit.getImage("forma.jpeg");
        setIconImage(img);
        setTitle("Disegno 2D");
        setSize(LARGHEZZA,ALTEZZA);
        
        //Aggiungiamo il panel al frame
        
        DisegnoPanel panel=new DisegnoPanel();
        add(panel);
    }
    
}
