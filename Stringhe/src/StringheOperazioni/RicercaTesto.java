/*
 * RicercaTesto.java
 *
 * Created on October 3, 2007, 5:17 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package StringheOperazioni;

/**
 *
 * @author luciano
 */
import javax.swing.JOptionPane;
public class RicercaTesto {
    public static void main(String[]args){
        String testo=JOptionPane.showInputDialog(null," Inserisci del testo...");
        String cerca=JOptionPane.showInputDialog(null," Inserisci la prima parola da ricercare ");
        String cercaRitroso=JOptionPane.showInputDialog(null," Inserisci la seconda parola da ricercare ");
        int index=-1;
        int nOcc=0;//parole trovate a partire dall'inizio
        int nOccR=0;//numero di parole trovate a partire dalla fine
        index=testo.indexOf(cerca);
        while(index>=0) {
        ++nOcc;
        index +=cerca.length();//Vado alla posizione successiva dell'ultima parola trovata ovvero trovo la successiva   
        index=testo.indexOf(cerca,index);
        }
        
        //ricerchiamo ora la seconda parola a partire dalla fine del testo
        
        index=testo.lastIndexOf(cercaRitroso);
        while(index>=0){
            ++nOccR;
            index -=cercaRitroso.length();
            index=testo.lastIndexOf(cercaRitroso,index);
        }
    
    JOptionPane.showMessageDialog(null,"Sono state trovate " + nOcc +" occorrenze per la parola " + cerca + ".\nSono state trovate inoltre "+ nOccR + " occorrenze per la parola " + cercaRitroso +" ."," Occorrenze ",JOptionPane.CLOSED_OPTION);
    
}
}