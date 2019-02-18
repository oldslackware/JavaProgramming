/*
 * ScrittaColorataPanel.java
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
public class ScrittaColorataPanel extends JPanel {
    public static final int X=75;
    public static final int Y=75;
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
   
        String msg="Italy Open Source";
        Font f=new Font("SANS_SERIF",Font.CENTER_BASELINE,36);
        g.setColor(Color.YELLOW);
        g.setFont(f);
        
        
        g.drawString(msg,X,Y);
    }
    
}
