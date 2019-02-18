/*
 * Inversione.java
 *
 * Created on 11 maggio 2007, 12.01
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package StringheOperazioni;

/**
 *
 * @author luciano
 */
import javax.swing.*;
public class Inversione {
    public static void main(String[]args){
        String s=JOptionPane.showInputDialog("Inserisci una parola in moda che possa invertirla..");
        s=s.trim();
        String inversa="";
        for(int i=s.length()-1;i>=0;i--)
            inversa=inversa+s.charAt(i);
            JOptionPane.showMessageDialog(null,inversa);
        
        
    }
}
