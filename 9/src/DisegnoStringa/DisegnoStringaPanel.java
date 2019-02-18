/*
 * DisegnoStringaPanel.java
 *
 * Created on November 26, 2007, 3:39 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package DisegnoStringa;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author frick
 *Un pannello che visualizza un messaggio
 */
public class DisegnoStringaPanel extends JPanel{
    public static final int X=75;
    public static final int Y=100;
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("ItalyOpenSource",X,Y);
        
        
    }
    
    
}
