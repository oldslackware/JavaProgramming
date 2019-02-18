/*
 * Intro.java
 *
 * Created on October 8, 2007, 1:20 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

//package EserciziApplet;

/**
 *
 * @author frick
 */

import javax.swing.JOptionPane;
import javax.swing.JApplet;
import java.awt.Graphics;
public class Intro extends JApplet {
    /*String mya=JOptionPane.showInputDialog(null,"Inserisci coefficiente  di x ");
    String coef=JOptionPane.showInputDialog(null,"Inserisci il termine noto..");
    int a=Integer.parseInt(mya);
    int c=Integer.parseInt(coef);
    int primoPunto=-c/a;
    int secondoP=c;
    */
    public void paint(Graphics g){
        g.drawLine(640,0,640,800);
        g.drawLine(0,400,1280,400);
       g.drawString("Disegniamo del testo...",250,250);
        //g.drawLine(-primoPunto+400,0,783,secondoP+640);
       
       
        
    }
    
    

    
}
