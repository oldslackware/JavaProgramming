/*
 * NumeriCasualiApplicazione.java
 *
 * Created on October 22, 2007, 10:49 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esercizi;

/**
 *
 * @author frick
 */
import javax.swing.JOptionPane;
public class NumeriCasualiApplicazione {
    public static void main(String[]args){
     int numero;
    String output="";
    
    for(int i=1;i<=240;i++){
        numero=1+(int)(Math.random()*6);
        output+=numero +" ";
        if(i%12==0)//matrice 12*20
            output+="\n";
    }
    
    JOptionPane.showMessageDialog(null,output,"Alcuni Numeri casuali",JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
    }
    
}
