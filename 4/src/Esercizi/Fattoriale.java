/*
 * Fattoriale.java
 *
 * Created on October 15, 2007, 9:32 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esercizi;

/**
 *
 * @author frick
 */
import javax.swing.*;
public class Fattoriale {
    public static void main(String[]args){
        JTextArea tabella=new JTextArea(12,24);
        tabella.append("Numero\t\tFattoriale\n");
        int risultato=1;
        for(int i=1;i<=10;i++){
            risultato=(i*risultato);
            
            tabella.append(i+"!\t\t"+risultato+"\n");
        }
            
        
        JOptionPane.showMessageDialog(null,tabella);
        }
}
        
    
    
