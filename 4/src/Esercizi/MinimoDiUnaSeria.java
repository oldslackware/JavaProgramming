/*
 * MinimoDiUnaSeria.java
 *
 * Created on October 15, 2007, 8:27 PM
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
public class MinimoDiUnaSeria {
    public static void main(String[]args){
        String s=JOptionPane.showInputDialog(null,"Inserisci quanti numeri vuoi inserire");
        String n;
        int size=Integer.parseInt(s);
        int min=999999999;//fiducia
        int numero;
        for(int i=0;i<size;i++){
            n=JOptionPane.showInputDialog(null,"Inserisci il numero");
            numero=Integer.parseInt(n);
            if(numero<min){
                min=numero;
             
        }
            
    }
    JOptionPane.showMessageDialog(null,"Minimo:" +min+ " ","MINIMO",JOptionPane.INFORMATION_MESSAGE);
}
}