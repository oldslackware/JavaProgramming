/*
 * Concatenazione.java
 *
 * Created on 1 ottobre 2007, 19.11
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package StringheOperazioni;

/**
 *
 * @author luciano
 */
import javax.swing.JOptionPane;
public class Concatenazione {
public static void main(String []args){
    String prima=JOptionPane.showInputDialog(null,"Inserire una stringa...");
    String seconda=JOptionPane.showInputDialog(null,"Inserire una seconda stringa");
    JOptionPane.showMessageDialog(null,"La concatenazione della stringa "+ prima + " e della stringa " + seconda +" e'\n"+ (prima +"-"+seconda) + " ","Concatenazione di due stringhe ",JOptionPane.CLOSED_OPTION );
}
    
}
