/*
 * FormeApplet.java
 *
 * Created on October 13, 2007, 5:50 PM
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
import javax.swing.JOptionPane;

public class FormeApplet extends JApplet{
    int scelta;
    
    public void init(){
        String choise=JOptionPane.showInputDialog(null,"Digitare 1 per vedere una sequenza di linee\n2 per una serie di rettangoli\n3 per una serie di ovali");
        scelta=Integer.parseInt(choise);
        
    
    } 
    public void paint(Graphics g){
  
        for(int i=0;i<50;i++){
            
            switch(scelta){
                case 1:
                    g.drawLine(10,10,250,10+i*5);
                    break;
                case 2:
                    g.drawRect(10+i*5,10+i*5,50+i*5,50+i*5);
                    break;
                case 3:
                    g.drawOval(10+i*5,10+i*5,50+i*5,50+i*5);
                    break;
                default:
                    //JOptionPane.showMessageDialog(null,"Valore non valido");
                  break;
                  
            }
        }
    }
    

}
