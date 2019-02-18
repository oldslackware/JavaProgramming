/*
 * QuadratoDiUnaSerieDiNumeriApplicazione.java
 *
 * Created on October 20, 2007, 7:34 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esercizi;

/**
 *
 * @author frick
 */
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;

public class QuadratoDiUnaSerieDiNumeriApplicazione {
    
    public static void main(String[]args) {
        
        String max=JOptionPane.showInputDialog(null,"Inserisci fino a che numero intendi visualizzare il quadrato");
        int n=Integer.parseInt(max);
        int risultato;
        
        JTextArea tabella=new JTextArea(30,60);
        JScrollPane scroll=new JScrollPane(tabella);
        String output= "";
        for(int i=1;i<=n;i++){
            risultato=quadrato(i);
            output+="Il quadrato di "+i+" e' "+risultato+"\n";
        }
       
      tabella.setText(output);
      tabella.setEditable(false);
      JOptionPane.showMessageDialog(null,scroll,"Quadrato Di Numeri",JOptionPane.INFORMATION_MESSAGE);
      System.exit(0);
    }
        public static int quadrato(int x){
            return x*x;
        }
   
     
    
    
}
