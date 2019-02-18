/*
 * TestTimer.java
 *
 * Created on November 25, 2007, 8:31 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package UsoClassiInterne;

/**
 *
 * @author frick
 */
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
public class TestTimer {
    public static void main(String[]args){
        OrologioFastidioso ot=new OrologioFastidioso(1000);
        ot.start();
        JOptionPane.showMessageDialog(null,"Suca!");
        System.exit(0);
    }
    
    
}

class OrologioFastidioso{

    public OrologioFastidioso(int intervallo){
        this.intervallo=intervallo;
    }
    
    public void start(){
        ActionListener listener=new StampaTempo();
        Timer t=new Timer(intervallo,listener);
        
        t.start();
        
        }
        private int intervallo;
    //Una classe interna anche detta inner class
    private class StampaTempo implements ActionListener{
        public void actionPerformed(ActionEvent event){
            Date momento=new Date();
            momento.
            System.out.println("Sono le "+momento);
              
         
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}