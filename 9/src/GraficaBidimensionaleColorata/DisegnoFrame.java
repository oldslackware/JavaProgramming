/*
 * DisegnoFrame.java
 *
 * Created on November 26, 2007, 1:05 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package GraficaBidimensionaleColorata;

/**
 *
 * @author frick
 */
import javax.swing.*;
import java.awt.*;
public class DisegnoFrame extends JFrame{
    public final static int LARGHEZZA=400;
    public final static int ALTEZZA=400;
    
    /** Creates a new instance of DisegnoFrame */
    public DisegnoFrame() {
    Toolkit kit=Toolkit.getDefaultToolkit();
    Image img=kit.getImage("forma.jpeg");
    setIconImage(img);
    setTitle("Coloriamo le forme :)");
    setSize(LARGHEZZA,ALTEZZA);
    
    DisegnoPanel panel=new DisegnoPanel();
    int c=SystemColor.DESKTOP;//cambio il colore di sfondo in base al desktop
    Color co=new Color(c);
    panel.setBackground(co);
    add(panel);
    
    }
    
}
