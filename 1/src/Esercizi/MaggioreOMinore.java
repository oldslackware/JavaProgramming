/*
 * MaggioreOMinore.java
 *
 * Created on October 7, 2007, 9:58 PM
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
public class MaggioreOMinore {
    public static void main(String[]args){
    String uno=JOptionPane.showInputDialog(null,"Inserisci un primo numero");
    double primo=Double.parseDouble(uno);
    String due=JOptionPane.showInputDialog(null,"Inserisci un secondo numero");
    double secondo=Double.parseDouble(due);
    if(primo > secondo){
    JOptionPane.showMessageDialog(null,"Il numero " + primo + " e' maggiore di " + secondo +".","Informazione",JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
    }
    if(primo < secondo){
        JOptionPane.showMessageDialog(null,"Il numero " + secondo +" e'  maggiore di " + primo +".","Informazione",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    JOptionPane.showMessageDialog(null,"Il numero " + primo + " e' uguale a " + secondo +".","Informazione",JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
    
}
}