/*
 * UsiDiIndexOf.java
 *
 * Created on 30 settembre 2007, 19.49
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
public class UsiDiIndexOf {
    public static void main(String[]args){
        String testo=JOptionPane.showInputDialog("Inserisci una stringa");
        JOptionPane.showMessageDialog(null,"La stringa digitata e' " + testo +""," Stringa Digitata ",JOptionPane.CLOSED_OPTION);
        JOptionPane.showMessageDialog(null,"La stringa digitata contiene " + testo.length() +" caratteri."," Lunghezza Stringa ",JOptionPane.CLOSED_OPTION);
        JOptionPane.showMessageDialog(null,"Il carattere in posizione 5,ma con indice 4 e' " + testo.charAt(4) +""," Carattere in posizione 5 ",JOptionPane.CLOSED_OPTION);
        JOptionPane.showMessageDialog(null,"L'indice del carattere  " + testo.charAt(testo.length()-1) +" e' "+ testo.indexOf(testo.charAt(testo.length()-1))+""," Stringa Digitata ",JOptionPane.CLOSED_OPTION);
        JOptionPane.showMessageDialog(null,"Il codice hash per la stringa digitata e' " + testo.hashCode() +""," Codice hash ",JOptionPane.CLOSED_OPTION);
    
    }
    
}

    

