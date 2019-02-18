/*
 * FrameCentrato.java
 *
 * Created on November 26, 2007, 2:40 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package PosizionamentoFrameConIcona;

/**
 *
 * @author frick
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FrameCentrato extends JFrame {
    
    
    public FrameCentrato() {
    //Mi prendo le dimensioni dello schermo
        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension schermo=kit.getScreenSize();
        int altezza=schermo.height;
        int larghezza=schermo.width;
        
        //E adesso me lo centro:)
        
        setSize(larghezza/2,altezza/2);
        setLocation(larghezza/4,altezza/4);
        
        //Adesso mi ci metto l'icona di tux'
        Image img=kit.getImage("iconalinux.jpeg");
        setIconImage(img);
        setTitle("Un Frame Centarto con Icona");
    
    }
    
}
