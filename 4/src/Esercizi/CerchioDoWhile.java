/*
 * CerchioDoWhile.java
 *
 * Created on October 13, 2007, 6:59 PM
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
public class CerchioDoWhile extends JApplet {
public void paint(Graphics g){
    int c=1;
    do{
        g.drawOval(210-c*10,210-c*10,c*30,c*30);
        ++c;
    }while(c<=20);
}  
    
}
