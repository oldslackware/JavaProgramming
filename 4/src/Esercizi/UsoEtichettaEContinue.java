/*
 * UsoEtichettaEContinue.java
 *
 * Created on October 15, 2007, 6:15 PM
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
public class UsoEtichettaEContinue {
    public static void main(String[]args){
        String s="";
        prossimaRiga:
            for(int righe=1;righe<=5;righe++){
               s+="\n";
                for(int colonne=1;colonne<=10;colonne++){
                     
                    System.out.println("righe="+righe+"colonne="+colonne);
                    if(colonne>righe)//Questo if fa' in modo di tornare al for delle righe'
                     continue prossimaRiga;
                    s+="*";
                        
                }
            }
        JOptionPane.showMessageDialog(null,s,"Continue con etichetta",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        }
    }
    

