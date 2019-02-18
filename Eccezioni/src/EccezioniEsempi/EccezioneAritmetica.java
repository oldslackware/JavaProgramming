/*
 * EccezioneAritmetica.java
 *
 * Created on 11 maggio 2007, 19.25
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package EccezioniEsempi;

/**
 *
 * @author luciano
 */
import javax.swing.*;
public class EccezioneAritmetica {
    
    public static void main(String[]args){
       try{
        String myDividendo=JOptionPane.showInputDialog(null,"Inserisci il dividendo");
        double dividendo=Double.parseDouble(myDividendo);
        String myDivisore=JOptionPane.showInputDialog(null,"Inserisci divisore");
        double divisore=Double.parseDouble(myDivisore);
        
            JOptionPane.showConfirmDialog(null,"\n"+dividendo+" : "+divisore+"","Divisione",JOptionPane.CLOSED_OPTION);
            JOptionPane.showConfirmDialog(null,"Risultato" +(dividendo/divisore)+":)","Risultato",JOptionPane.CLOSED_OPTION);
            JOptionPane.showConfirmDialog(null,"\nE' andato tutto bene","Nessun problema",JOptionPane.CLOSED_OPTION);
        }catch(IllegalArgumentException e){
            JOptionPane.showConfirmDialog(null," Non hai inserito un numero...Sorry","Errore di digitalizzazione",JOptionPane.ERROR_MESSAGE);
        }catch(ArithmeticException e){//eccezione che non verra' mai sollevata dal jdk 1.4 in poi...'
        JOptionPane.showConfirmDialog(null," Divisione per zero...\nPotrei pure risolverla ma non credo tu sia in grado di capire de l'hopital.. :)","Divisione per zero",JOptionPane.ERROR_MESSAGE);
        }
                    JOptionPane.showConfirmDialog(null,"Chiusura programma","Fine Programma",JOptionPane.CLOSED_OPTION);
        
    }
    
}
