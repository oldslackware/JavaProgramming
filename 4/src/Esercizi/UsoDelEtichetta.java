/*
 * UsoDelEtichetta.java
 *
 * Created on October 15, 2007, 6:05 PM
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
public class UsoDelEtichetta {
    public static void main(String[]args)   {
        String s="";
        fine:{
            for(int righe=1;righe<=10;righe++){
                s+="\n";
                for(int colonne=1;colonne<=10;colonne++){
                    if(righe==6)
                        break fine;
                    s+="* ";
                }
                s+="\n";
            }
            s+="\nCiclo terminato normalmente";//non verra' mai eseguito
        }
        JOptionPane.showMessageDialog(null,s,"Solo 5 righe con l'etichetta",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
}
