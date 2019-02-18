/*
 * Fibonacci.java
 *
 * Created on April 30, 2007, 1:31 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Mathematic;
import javax.swing.*;
/**
 *
 * @author francesca
 */
public class Fibonacci {
    
    public static void main(String[]args){
        JOptionPane.showMessageDialog(null,"Programma per il calcolo del fattoriale","Messaggio",JOptionPane.CLOSED_OPTION);
        String numero=JOptionPane.showInputDialog("Inserisci un numero minore di 20");
        int Mynumber=Integer.parseInt(numero);
        if(Mynumber>20){
            JOptionPane.showMessageDialog(null,"Il numero deve essere minore di 20","Errore",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
       long fattoriale=1;
        for(int i=1;i<=Mynumber;i++){
            fattoriale=1;
            int fattor;
            for(fattor=2;fattor<=i;fattor++){
                fattoriale*=fattor;
            }
            JOptionPane.showMessageDialog(null,""+i+"! e' "+fattoriale+"","Messaggio",JOptionPane.CLOSED_OPTION);
            
        }
        System.exit(0);
    }
    
    
}
