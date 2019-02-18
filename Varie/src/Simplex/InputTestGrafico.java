/*
 * InputTestGrafico.java
 *
 * Created on April 29, 2007, 11:37 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Simplex;
import javax.swing.*;
/**
 *
 * @author francesca
 */
public class InputTestGrafico {
    public static void main(String[]args){
        String nome=JOptionPane.showInputDialog(" Inserisci il tuo nome...");
        String eta=JOptionPane.showInputDialog("Inserisci la tua eta' ");
        int anni=Integer.parseInt(eta);
        anni++;
        JOptionPane.showMessageDialog(null,"Ciao "+nome+" l'anno prossimo avrai "+anni+" anni :)","Messaggio",JOptionPane.CLOSED_OPTION);
        System.exit(0);
    }
 
    
    
}
