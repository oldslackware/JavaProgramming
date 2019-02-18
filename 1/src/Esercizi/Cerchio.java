/*
 * Cerchio.java
 *
 * Created on October 7, 2007, 11:55 PM
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
import java.lang.Math;
public class Cerchio {
public static void main(String[]args){
    String r=JOptionPane.showInputDialog(null,"Inserisci il raggio della circonferenza");
    double raggio=Double.parseDouble(r);
    final  double p=3.1416;//PI-GRECO
    double diametro=2*raggio;
    double perimetro=2*p*raggio;
    double area=p*raggio*raggio;
    JOptionPane.showMessageDialog(null,"La circonferenza di raggio " + raggio + "\nha un diametro di: " + diametro +"\nun perimetro di :" + perimetro +"\ne un area di " + area +".","Programma Circonferenza",JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
    
}    
   
    
}
