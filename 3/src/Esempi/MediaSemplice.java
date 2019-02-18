/*
 * MediaSemplice.java
 *
 * Created on October 8, 2007, 5:55 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esempi;

/**
 *
 * @author frick
 */
import javax.swing.JOptionPane;
public class MediaSemplice {
   public static void main(String[]args){
       int somma;//somma voti
       int votiInseriti;
       int valoreVoti;
       int media;
       String voto;
       //all'inizio abbiamo questa situazione
       
       somma=0;
       votiInseriti=1;//iniziamo il ciclo
       String totale=JOptionPane.showInputDialog(null,"Inserisci il numero totale di voti");
       int tot=Integer.parseInt(totale);
       while(votiInseriti<=tot)   {
           voto=JOptionPane.showInputDialog(null,"Inserisci il voto");
           valoreVoti=Integer.parseInt(voto);
           somma+=valoreVoti;
           votiInseriti++;
           
       }
       media=somma/tot;
       JOptionPane.showMessageDialog(null,"La media dei voti e':=" + media +"","Media Voti",JOptionPane.INFORMATION_MESSAGE);
       System.exit(0);
   }
    
}
