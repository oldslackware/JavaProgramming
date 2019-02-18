/*
 * UsoValueOf.java
 *
 * Created on October 6, 2007, 7:17 PM
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
public class UsoValueOf {
    
    public static void main(String[]args){
        Object s="Italy-Open-Source";
        int n=23;
        char[]ch={'W','E','L','C','O','M','E',' ','T','O',' ','J','A','V','A'};
        double d=16.92;
        boolean b=false;
        
        String conversione="Oggetto convertito="+ String.valueOf(s) +"\nintero convertito="+ String.valueOf(n) +"\nbooleano convertito="+ String.valueOf(b) +"\ndouble convertito="+ String.valueOf(d) +"\nArray di char convertito="+ String.valueOf(ch) +"\nParte di Array convertito="+ String.valueOf(ch,0,7);        
        JOptionPane.showMessageDialog(null,conversione,"Uso di ValueOf",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
