/*
 * SerieDiInteressiPostali.java
 *
 * Created on October 16, 2007, 10:31 AM
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
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.text.DecimalFormat;
public class SerieDiInteressiPostali {
    public static void main(String[]args){
    String s=JOptionPane.showInputDialog(null,"Inserisci la cifra depositata");
    double money=Double.parseDouble(s);
    double interessi=.05;//interessi di partenza del'5%' che variarenno fino al 10%
    double totale;
    DecimalFormat df=new DecimalFormat("0.00");
    JTextArea tabella=new JTextArea(22,10);//11 righe e 20 colonne
    JScrollPane scroll=new JScrollPane(tabella);
    String text="";
    int percentuale=5;
    
     text+="\nAnni\tInteressi al "+percentuale+"%\t ";
    for(interessi=.05;interessi<.1;interessi+=.01)
     for(int anno=1;anno<=10;anno++){
        totale=money*Math.pow(1.0+interessi,anno);
         
        text+="\n"+anno +"\t" + df.format(totale) +"\t";
        
        if(anno==10&&interessi<=.09){
            percentuale++;
           text+="\nAnni\tInteressi al "+percentuale+"%\t "; 
        }
     
     }
  
    tabella.setText(text);
    JOptionPane.showMessageDialog(null,scroll,"Calcolo Interessi",JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
    } 
}
