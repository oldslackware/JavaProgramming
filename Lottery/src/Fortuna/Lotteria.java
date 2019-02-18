/*
 * Lotteria.java
 *
 * Created on April 30, 2007, 3:12 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Fortuna;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author francesca
 */
public class Lotteria {
    
      public static void main(String[]args){
        String ruote[]={"Bari","Cagliari","Firenze","Genova","Milano","Napoli","Palermo","Roma","Torino","Venezia","Ruota Nazionale"};
        String numeri=JOptionPane.showInputDialog("Quanti numeri devi giocare?");
        int numeriDaGiocare=Integer.parseInt(numeri);
        //String numeroMax=JOptionPane.showInputDialog("Qual'e' il numero massimo giocabile?");
        //int max=Integer.parseInt(numeroMax);
        int max=90;
        
        //riempio l'array'
        int[]numeriPossibili=new int[max];
        for(int i=0;i<numeriPossibili.length;i++){
            numeriPossibili[i]=i+1;
        }
        //estrazione
        int[]estratti=new int[numeriDaGiocare];
        for(int i=0;i<estratti.length;i++){
            //definisco un numero casuale tra 0 e il numero MAX giocabile
            int r=(int)(Math.random()*max);
            //seleziono l'elemento casuale
            estratti[i]=numeriPossibili[r];
            //sposto l'ultimo elemento nella posizione casuale
            numeriPossibili[r]=numeriPossibili[max-1];
            max--;
        }
        //visualizza l'array ordinato
        Arrays.sort(estratti);
        JOptionPane.showMessageDialog(null,"Stiamo elaborando la combinazione vincente.....","Messaggio",JOptionPane.CLOSED_OPTION);
         JOptionPane.showMessageDialog(null,"Giocare sulla ruota di "+ ruote[(int)(ruote.length*Math.random())]+" ","Messaggio",JOptionPane.CLOSED_OPTION);
        for(int r=0;r<estratti.length;r++){
            JOptionPane.showMessageDialog(null,"Il " + (r+1) + " numero estratto e'.....: " +estratti[r] +" ","Messaggio",JOptionPane.CLOSED_OPTION);
            
        }
        System.exit(0);
    }
    
}
