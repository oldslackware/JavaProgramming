/*
 * DisegnoStringaFrame.java
 *
 * Created on November 26, 2007, 3:29 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package DisegnoStringa;

/**
 *
 * @author frick
 *un frame che visualizza un panel
 */
import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
public class DisegnoStringaFrame extends JFrame {
    public static final int LARGHEZZA=300;
    public static final int ALTEZZA=200;
    public DisegnoStringaFrame() {
        Toolkit kit=Toolkit.getDefaultToolkit();
        Image img=kit.getImage("iconalinux.jpeg");
        setIconImage(img);
        setTitle("Disegniamo una stringa");
        setSize(LARGHEZZA,ALTEZZA);
        //aggiungiamo il pannello al frame
        
        DisegnoStringaPanel panel=new DisegnoStringaPanel();
        add(panel);
                
                
    }
    
}
