/*
 * LookFrame.java
 *
 * Created on November 27, 2007, 5:08 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package LookAndFeel;

/**
 *
 * @author frick
 */
import javax.swing.*;
import java.awt.*;
public class LookFrame extends JFrame {
    public static final int LARGHEZZA=800;
    public static final int LUNGHEZZA=600;
    /** Creates a new instance of LookFrame */
    public LookFrame() {
    Toolkit kit=Toolkit.getDefaultToolkit();
    Image img=kit.getImage("icona.png");
    setIconImage(img);
    setTitle("Look and Feel a confronto");
    setSize(LARGHEZZA,LUNGHEZZA);
    
    
    LookPanel panel=new LookPanel();
    add(panel);
    }
    
}
