/*
 * UsoDelBreak.java
 *
 * Created on October 15, 2007, 5:53 PM
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
public class UsoDelBreak {
 public static void main(String[]args){
     String s="";
     int cont;
     for(cont=1;cont<=10;cont++){
         if(cont==5)
             break;
         s+=cont+"\n";
     }
     s+="L'uso del break fa' terminare il ciclo qui: "+ cont;
     JOptionPane.showMessageDialog(null,s);
     System.exit(0);
 }
    
}
