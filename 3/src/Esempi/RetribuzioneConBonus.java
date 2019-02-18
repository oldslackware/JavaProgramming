/*
 * RetribuzioneConBonus.java
 *
 * Created on October 12, 2007, 10:33 AM
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
public class RetribuzioneConBonus {
   public static void main(String[]args){
       double stipendio;
       double compenso=20;
       String fine="esc";
       while(true){
       String oreImpiegato=JOptionPane.showInputDialog(null,"Inserisci il numero di ore effettuate dall'impiegato\nDigitare esc per uscire dal programma");
       
       if(oreImpiegato.equalsIgnoreCase(fine)){
           JOptionPane.showMessageDialog(null,"Programma Terminato.","Chiusura Applicazione",JOptionPane.CLOSED_OPTION);
           System.exit(0);
       }
       
           double ore=Double.parseDouble(oreImpiegato);
           if(ore>40){
           stipendio=40*compenso+(ore-40)*compenso+(compenso/2);
           JOptionPane.showMessageDialog(null,"L'impiegato ha percepito uno stipendio di " + stipendio + " euro","Retribuzione Impiegato",JOptionPane.INFORMATION_MESSAGE);
           }else if(ore<=40&&ore>0){ 
           stipendio=compenso*ore; 
           JOptionPane.showMessageDialog(null,"L'impiegato ha percepito uno stipendio di " + stipendio + " euro","Retribuzione Impiegato",JOptionPane.INFORMATION_MESSAGE);
           }
           else{
               JOptionPane.showMessageDialog(null,"Dati non corretti..","Dati errati",JOptionPane.ERROR_MESSAGE);
           }
       }
   } 

    
}
