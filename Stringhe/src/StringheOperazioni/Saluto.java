/*
 * Saluto.java
 *
 * Created on 29 settembre 2007, 17.12
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
public class Saluto {
    public static void main(String[]args){
        String nome=JOptionPane.showInputDialog("Come ti chiami");
        String saluto="Ciao " +nome+" bentornato :)";
        JOptionPane.showMessageDialog(null,saluto);
        System.exit(0);
    }
    
}
