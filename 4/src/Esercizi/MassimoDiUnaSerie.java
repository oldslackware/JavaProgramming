/*
 * MassimoDiUnaSerie.java
 *
 * Created on October 15, 2007, 8:49 PM
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
public class MassimoDiUnaSerie {
    public static void main(String[]args){
        String s=JOptionPane.showInputDialog(null,"Inserisci quanti numeri vuoi inserire");
        String n;
        int size=Integer.parseInt(s);
        int max=0;//fiducia
        int numero;
        for(int i=0;i<size;i++){
            n=JOptionPane.showInputDialog(null,"Inserisci il numero");
            numero=Integer.parseInt(n);
            if(numero>max){
                max=numero;
             
        }
            
    }
    JOptionPane.showMessageDialog(null,"Massimo:" +max+ " ","MASSIMO",JOptionPane.INFORMATION_MESSAGE);
}
}
    
    

