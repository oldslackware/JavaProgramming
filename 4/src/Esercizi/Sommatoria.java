/*
 * Sommatoria.java
 *
 * Created on October 13, 2007, 5:00 PM
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
public class Sommatoria {
  public static void main(String[]args){
      String n=JOptionPane.showInputDialog(null,"Inserisci il numero estremo della sommatoria");
      int numero=Integer.parseInt(n);
      int somma=0;
      for(int i=0;i<=numero;i++) {
          somma+=i;
      }
      JOptionPane.showMessageDialog(null,"La somma e' " + somma +"","Sommatoria semplice",JOptionPane.INFORMATION_MESSAGE);
  }
    
}
