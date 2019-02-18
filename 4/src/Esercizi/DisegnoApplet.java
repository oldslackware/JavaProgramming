/*
 * DisegnoApplet.java
 *
 * Created on October 12, 2007, 12:40 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */


/**
 *
 * @author frick
 */
import java.awt.Graphics;
import javax.swing.JApplet;
public class DisegnoApplet extends JApplet{
    public void paint(Graphics g){
        int con=1;
        while(con<=100){
            g.drawLine(con*5,600,400,0);
            ++con;
        }
    }
    
   
    
}
