/*
 * MaiuscoleMinuscole.java
 *
 * Created on 30 settembre 2007, 20.09
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
public class MaiuscoleMinuscole {
    public static void main(String[]args){
        String normale=JOptionPane.showInputDialog(null,"Inserire una Stringa ");
        String maiuscolo=normale.toUpperCase();
        String minuscolo=normale.toLowerCase();
        JOptionPane.showMessageDialog(null,"La stringa digitata e' " + normale + ".\nLa Stringa in minuscolo e' " + minuscolo + ".\nLa Stringa in maiuscolo e' "+ maiuscolo +"","Elaborazione Stringa",JOptionPane.CLOSED_OPTION);
    }
    
    
}
