/*
 * ProdottoDispari.java
 *
 * Created on October 15, 2007, 8:52 PM
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
public class ProdottoDispari {
    public static void main(String[]args){
       int prodotto=1;
       String s=JOptionPane.showInputDialog(null,"Inserisci un numero dispari minore di 20");
       int numero=Integer.parseInt(s);
       for(int i=1;i<=numero;i+=2){
       if(numero%2==0||numero>20){
           JOptionPane.showMessageDialog(null,"Pensavo di essere stato chiaro","Input errato",JOptionPane.ERROR_MESSAGE);
       }
       prodotto*=i;
    
       }
       JOptionPane.showMessageDialog(null,prodotto);
    
}
}
