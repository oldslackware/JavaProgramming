/*
 * ButtonFrame.java
 *
 * Created on November 27, 2007, 11:49 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package BottoniEventi;

/**
 *
 * @author frick
 */
import javax.swing.*;
import java.awt.*;
public class ButtonFrame extends JFrame {
public static final int LARGHEZZA=1280;
public static final int LUNGHEZZA=960;
    /** Creates a new instance of ButtonFrame */
    public ButtonFrame() {
        Toolkit kit=Toolkit.getDefaultToolkit();
        Image img=kit.getImage("icona.png");
        setIconImage(img);
        setTitle("Sfondo che cambia");
        setSize(LARGHEZZA,LUNGHEZZA);
        
        ButtonPanel panel=new ButtonPanel();
        add(panel);
        
    }
    
}
