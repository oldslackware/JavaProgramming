/*
 * MiniCalcolatrice.java
 *
 * Created on October 8, 2007, 4:11 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */



/**
 *
 * @author frick
 */
import java.awt.Graphics;
import javax.swing.*;
public class MiniCalcolatrice extends JApplet {
   double somma;
   double differenza;
   double prodotto;
   double div;
   double med;
   
   public void init(){
       String uno=JOptionPane.showInputDialog(null,"Inserisci un primo numero");
       String due=JOptionPane.showInputDialog(null,"Inserisci un secondo numero");
       double primo=Double.parseDouble(uno);
       double secondo=Double.parseDouble(due);
       somma=primo+secondo;
       differenza=primo-secondo;
       prodotto=primo*secondo;
       div=primo/secondo;
       med=somma/2;
   }
       public void paint(Graphics g)  {
           g.drawOval(100,60,750,80);
           g.drawString("Somma:=" + somma +" Differenza:=" + differenza + " Prodotto:=" + prodotto +" Divisione:=" + div +" Media:=" +med,100,100);
       
   }
    
 
    
}
