/*
 * TriangoloIstogramma1.java
 *
 * Created on October 17, 2007, 4:56 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esercizi;

/**
 *
 * @author frick
 */
//Disegniamo Un triangolo di asterisci al contrario

import javax.swing.JOptionPane;
public class TriangoloIstogramma1 {
      public static void main(String[]args){
        String s="";
        int max=10;
        
            for(int righe=1;righe<=10;righe++){
                s+="\n";
         prossimaRiga:   
                for(int colonne=1;colonne<=10;colonne++){
                    
                    //if(colonne>righe)//Questo if fa' in modo di tornare al for delle righe'
                     //continue prossimaRiga;
                   
                     if(colonne<max){
                    s+="*";
                    
                     }
                     
                     if(colonne>righe)
                     continue prossimaRiga;
                }
                max--;
            }
        JOptionPane.showMessageDialog(null,s,"Triangolo Istogramma",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        }
    
    
}
