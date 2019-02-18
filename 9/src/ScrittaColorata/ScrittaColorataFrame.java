/*
 * ScrittaColorataFrame.java
 *
 * Created on November 26, 2007, 12:17 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ScrittaColorata;

/**
 *
 * @author frick
 */
import javax.swing.*;
import java.awt.*;
public class ScrittaColorataFrame extends JFrame {
    public final static int LARGHEZZA=500;
    public final static int LUNGHEZZA=200;
    /** Creates a new instance of ScrittaColorataFrame */
    public ScrittaColorataFrame() {
        Toolkit kit=Toolkit.getDefaultToolkit();
        Image img=kit.getImage("iconalinux.jpeg");
        setIconImage(img);
        setTitle("Scritta Colorata");
        setSize(LARGHEZZA,LUNGHEZZA);
      
        ScrittaColorataPanel panel=new ScrittaColorataPanel();
        panel.setBackground(Color.RED);
        add(panel);
    }
    
}
