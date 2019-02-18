/*
 * UguaglianzaPerfetta.java
 *
 * Created on October 6, 2007, 7:09 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package StringheOperazioni;

/**
 *
 * @author frick
 */
import javax.swing.JOptionPane;
public class UguaglianzaPerfetta {
    public static void main(String []args){
        String s=JOptionPane.showInputDialog(null,"Inserisci una stringa");
        String d=JOptionPane.showInputDialog(null,"Inserisci una stringa identica alla precedente");
        if(s.equals(d)){
            JOptionPane.showMessageDialog(null,"Le due stringhe sono uguali ","Uguaglianza",JOptionPane.CLOSED_OPTION);
        }else{
             JOptionPane.showMessageDialog(null,"Le due stringhe non sono uguali ","Uguaglianza",JOptionPane.CLOSED_OPTION);
        }
        
    }
}
