/*
 * MediaControllata.java
 *
 * Created on October 8, 2007, 6:12 PM
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
import java.text.DecimalFormat;
public class MediaControllata {
    public static void main(String[]args){
          int somma;//somma voti
       int votiInseriti;
       int valoreVoti;
       double media;
       String voto;
       //all'inizio abbiamo questa situazione
       
       somma=0;
       votiInseriti=0;
        String dati=JOptionPane.showInputDialog(null,"Inserisci il voto,quando hai finito  inserisci -1 per terminare ");
        valoreVoti=Integer.parseInt(dati);
        
        while(valoreVoti!=-1){
             somma+=valoreVoti;
           votiInseriti++;
           dati=JOptionPane.showInputDialog(null,"Inserisci il voto,quando hai finito  inserisci -1 per terminare ");
           valoreVoti=Integer.parseInt(dati);
        }
        //Abbelliamo l'output con almeno una cifra sulla parte decimale e due sulla decimale '
        
        DecimalFormat df=new DecimalFormat("0.00");
        if(votiInseriti!=0){
            media=(double)somma/votiInseriti;
        
            JOptionPane.showMessageDialog(null,"La media dei voti risulta:" + df.format(media) +"","Media Voti",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"Non hai inserito nessun voto ","Impossibile calcolare la media",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    
    
    }
    
}
