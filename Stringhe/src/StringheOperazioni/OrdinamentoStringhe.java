/*
 * OrdinamentoStringhe.java
 *
 * Created on October 3, 2007, 4:04 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package StringheOperazioni;

/**
 *
 * @author frick
 */
import javax.swing.JOptionPane;
public class OrdinamentoStringhe {
    public static void main(String[]args){
        String prima=JOptionPane.showInputDialog(null," Inserisci una prima parola");
        String seconda=JOptionPane.showInputDialog(null," Inserisci una seconda parola");
        String terza=JOptionPane.showInputDialog(null, " Inserisci una terza parola");
        
        if(prima.compareTo(terza)<0){
            JOptionPane.showMessageDialog(null," La parola " + prima + " precede alfabeticamente la parola " + terza + ""," Ordine Alfabetico ",JOptionPane.CLOSED_OPTION);
        }
        if(prima.compareTo(terza)>0){
                 JOptionPane.showMessageDialog(null," La parola " + terza + " precede alfabeticamente la parola " + prima+ ""," Ordine Alfabetico ",JOptionPane.CLOSED_OPTION);
            }
                 if(prima.compareTo(terza)==0){
                      JOptionPane.showMessageDialog(null," La parola " + prima + " e' uguale alla parola " + terza + ""," Ordine Alfabetico ",JOptionPane.CLOSED_OPTION);
             }
        if(seconda.compareTo(prima)<0) {
                 JOptionPane.showMessageDialog(null," La parola " + seconda + " precede alfabeticamente la parola " + prima + ""," Ordine Alfabetico ",JOptionPane.CLOSED_OPTION);
        }
        if(seconda.compareTo(prima)>0){
                 JOptionPane.showMessageDialog(null," La parola " + prima + " precede alfabeticamente la parola " + seconda + ""," Ordine Alfabetico ",JOptionPane.CLOSED_OPTION);
        } 
            if(seconda.compareTo(prima)==0){
                          JOptionPane.showMessageDialog(null," La parola " + prima + " e' uguale alla parola " + seconda + ""," Ordine Alfabetico ",JOptionPane.CLOSED_OPTION);
                }
                
                
        }
           }
    

