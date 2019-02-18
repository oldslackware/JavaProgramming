/*
 * PotenzaRicorsivo.java
 *
 * Created on November 18, 2007, 10:06 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ESercizi;

/**
 *
 * @author frick
 */
import javax.swing.*;
public class PotenzaRicorsivo {
    public static  void main(String[]args){
   String number=JOptionPane.showInputDialog(null,"Inserisci la base dell'esponente","Base",JOptionPane.INFORMATION_MESSAGE);
   double base=Double.parseDouble(number);
   String exp=JOptionPane.showInputDialog(null,"Inserisci l'esponente","Esponente",JOptionPane.INFORMATION_MESSAGE);
   double e=Double.parseDouble(exp);
   JTextArea tabella=new JTextArea(3,6);
   String out="";
   out+="\n"+base+" elevato " + e+"="+potenza(base,e);
   tabella.setText(out);
   tabella.setEditable(false);
   JOptionPane.showMessageDialog(null,tabella);
  }
    
   static double potenza(double b,double es){
       if(es>1)
           return b*potenza(b,es-1);
       else if(es<0)
           return 1.0/potenza(b,-es);
       else
           return b==0 ? 1.0 : b;
   }


    
}

