/*
 * InteressiPostali.java
 *
 * Created on October 13, 2007, 5:15 PM
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
import java.text.DecimalFormat;
public class InteressiPostali {
public static void main(String[]args){
    String s=JOptionPane.showInputDialog(null,"Inserisci la cifra depositata");
    double money=Double.parseDouble(s);
    double interessi=.015;//interessi dell'1,5%'
    double totale;
    DecimalFormat df=new DecimalFormat("0.00");
    JTextArea tabella=new JTextArea(11,30);//11 righe e 20 colonne
    tabella.append("Anni\tSaldo totale\n");//Inseriamo il testo nella casella di testo mediante il metodo append
    for(int anno=1;anno<=10;anno++){
        totale=money*Math.pow(1.0+interessi,anno);
        tabella.append(anno +"\t" + df.format(totale) +"\n");
    }
    JOptionPane.showMessageDialog(null,tabella,"Calcolo Interessi",JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
}
    
    
    
}
