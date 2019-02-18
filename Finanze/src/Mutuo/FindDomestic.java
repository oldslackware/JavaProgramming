/*
 * FindDomestic.java
 *
 * Created on April 30, 2007, 3:08 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Mutuo;
import javax.swing.*;
/**
 *
 * @author francesca
 */
public class FindDomestic {
      public static void main(String[]args){
       String nome=JOptionPane.showInputDialog("Inserire nome");
       String stipendio=JOptionPane.showInputDialog("Inserire il proprio Stipendio mensile");
       double stipendioMensile=Double.parseDouble(stipendio);     
       if(stipendioMensile<=800.00){
       JOptionPane.showMessageDialog(null,"Spiacenti "+nome+" non possiamo concederti la finanziaria","Messaggio",JOptionPane.CLOSED_OPTION);
      System.exit(0);
       }
      
       String prestito=JOptionPane.showInputDialog("Inserisci cifra desiderata...");
       double prestitoFatto=Double.parseDouble(prestito);
       if(prestitoFatto>=50000.00){
       JOptionPane.showMessageDialog(null,"Non effettuiamo finanziamenti cosi' elevati..","Errore",JOptionPane.ERROR_MESSAGE);
        System.exit(0);
       }
       double rata=stipendioMensile-(stipendioMensile/4);
       double restituzione=prestitoFatto+(prestitoFatto*20/100);
       JOptionPane.showMessageDialog(null," "+nome+" ti abbiamo fornito un mutuo di "+prestitoFatto+"\n e dovrai restituire "+restituzione+" ","Messaggio",JOptionPane.CLOSED_OPTION);
       int numeroRate=(int)(restituzione/rata);
       int anni=numeroRate/12;
       int mesi=numeroRate%12;
       double rataMensile=(restituzione/numeroRate);
       JOptionPane.showMessageDialog(null," "+nome+" Sono state calcolate in base al tuo stipendio "+numeroRate+" rate\nche dovrai restituire in "+anni+" anni e "+mesi+"  mesi","Messaggio",JOptionPane.CLOSED_OPTION);
       JOptionPane.showMessageDialog(null," "+nome+" la rata mensile in virtu' del finanziamento e' "+rataMensile+" ","Messaggio",JOptionPane.CLOSED_OPTION);
       System.exit(0);
   } 

}
