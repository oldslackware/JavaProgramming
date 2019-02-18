/*
 * TriangoloIstogrammaSemplice.java
 *
 * Created on October 19, 2007, 6:41 PM
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
public class TriangoloIstogrammaSemplice {
    
    public static void main(String[]args){
        String s="";
        prossimaRiga:
            for(int righe=1;righe<=10;righe++){
               s+="\n";
                for(int colonne=1;colonne<=10;colonne++){
                     
                   
                    if(colonne>righe)//Questo if fa' in modo di tornare al for delle righe'
                     continue prossimaRiga;
                    s+="*";
                        
                }
            }
        JOptionPane.showMessageDialog(null,s,"Continue con etichetta",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        }
    }
