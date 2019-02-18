/*
 * MultiNazionale.java
 *
 * Created on October 9, 2007, 8:19 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esempi;

/**
 *
 * @author frick
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class MultiNazionale {
public static void main(String[]args){
double stipendioBase=200;
double totale=0;

while(true){
String rendita=JOptionPane.showInputDialog(null,"Inserire l'importo delle vendite della settimana-Digitare esc per uscire dal programma");
String fine="esc";
if(rendita.equalsIgnoreCase(fine)){
    JOptionPane.showMessageDialog(null,"Programma terminato","Fine Programma",JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,"Sono stati erogati " + totale + " stipendi.","Totale Stipendi",JOptionPane.CLOSED_OPTION);
    System.exit(0);
}
totale++;
double quanto=Double.parseDouble(rendita);
DecimalFormat df=new DecimalFormat("0.00");
double incr=(double)stipendioBase+(quanto/9);

JOptionPane.showMessageDialog(null,"Hai guadagnato uno stipendio di " + df.format(incr) +" euro.","Stipendio",JOptionPane.INFORMATION_MESSAGE);

}

}


}
