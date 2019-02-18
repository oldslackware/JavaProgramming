/*
 * ImmaginiFrame.java
 *
 * Created on November 27, 2007, 8:53 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ManipolazioneImmagini;

/**
 *
 * @author frick
 */
import javax.swing.*;
import java.awt.*;
public class ImmaginiFrame extends JFrame {
    public static final int LARGHEZZA=1280;
    public static final int LUNGHEZZA=960;
    /** Creates a new instance of ImmaginiFrame */
    public ImmaginiFrame() {
    Toolkit kit=Toolkit.getDefaultToolkit();
    Image img=kit.getImage("acquario.jpg");
    setIconImage(img);
    setTitle("Immagini sovrapposte");
    setSize(LARGHEZZA,LUNGHEZZA);
    
    ImmaginiPanel panel=new ImmaginiPanel();
    add(panel);
    }
    
}
