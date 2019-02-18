/*
 * MiniCalcolatrice.java
 *
 * Created on October 7, 2007, 9:43 PM
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
public class MiniCalcolatrice {
    public static void main(String[]args){
        String uno=JOptionPane.showInputDialog(null,"Inserisci un numero");
        double primo=Double.parseDouble(uno);
        String due=JOptionPane.showInputDialog(null,"Inserisci un secondo numero");
        double secondo=Double.parseDouble(due);
        double somma=primo+secondo;
        double diff=primo-secondo;
        double prod=primo*secondo;
        double div=primo/secondo;
        JOptionPane.showMessageDialog(null,"Risultati con "+ primo + " e " + secondo +"\nSomma=" + somma +"\nDifferenza=" + diff +"\nProdotto=" + prod + "\nDivisione=" + div +" ","MiniCalcolatrice",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
  
    
}
