/*
 * Sommatoria.java
 *
 * Created on October 27, 2007, 5:00 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ESercizi;

/**
 *
 * @author frick
 */
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Sommatoria {
   public static void main(String[]args){
       String s="Programma Sommatoria\n";
       int somma=0;
       final int max=10;
       String fat=JOptionPane.showInputDialog(null,"Inserisci il termine della sommatoria");
       int numero=Integer.parseInt(fat);
       int n[]=new int[max];
       for(int i=0;i<=n.length;i++)
         somma+=(i*numero);
       
       
   JOptionPane.showMessageDialog(null,somma,"Sommatoria",JOptionPane.INFORMATION_MESSAGE);
   }
    
}
