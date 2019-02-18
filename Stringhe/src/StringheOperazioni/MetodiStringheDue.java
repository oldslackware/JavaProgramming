/*
 * MetodiStringheDue.java
 *
 * Created on 30 settembre 2007, 12.57
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
public class MetodiStringheDue {
public static void main(String[]args){
    JOptionPane.showMessageDialog(null,"Programma che inverte una stringa e ne restituisce la lunghezza","What's this?",JOptionPane.CLOSED_OPTION);   
    String digita=JOptionPane.showInputDialog("Inserisci una stringa");
    String vuota="";
    //invertiamo la stringa
    for(int i=digita.length()-1;i>=0;i--)
        vuota +=digita.charAt(i);
   String finale="La Stringa "+ digita +"\npossiede "+ digita.length() +" caratteri .\nLa stringa inversa risulta essere \n"+ vuota;
   JOptionPane.showMessageDialog(null,finale,"Manipolazione Stringhe ",JOptionPane.INFORMATION_MESSAGE);
    
}
    
}
