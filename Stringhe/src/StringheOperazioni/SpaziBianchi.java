/*
 * SpaziBianchi.java
 *
 * Created on 29 settembre 2007, 17.24
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package StringheOperazioni;
import javax.swing.JOptionPane;
/**
 *
 * @author luciano
 */
public class SpaziBianchi {
public static void main(String args[]){
JOptionPane.showMessageDialog(null,"Programma per eliminare gli spazi bianchi","What's this?",JOptionPane.CLOSED_OPTION);    
String testo=JOptionPane.showInputDialog("Inserisci un testo");
JOptionPane.showMessageDialog(null,testo.replaceAll(" ",""));
} 
}
