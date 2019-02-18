/*
 * AncoraSuIndexOF.java
 *
 * Created on 1 ottobre 2007, 19.26
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package StringheOperazioni;

/**
 *
 * @author luciano
 */
import javax.swing.JOptionPane;
public class AncoraSuIndexOF {
    public static void main(String[]args){
        String testo="Italy-Open-Source";
        JOptionPane.showMessageDialog(null," La stringa di partenza e' " + testo +" "," Ancora Su IndexOF ",JOptionPane.CLOSED_OPTION );
        int i=testo.indexOf('y');
        //se ci fosse stata un altra y avremo potuto fare semplicemente...
        //int ii=testo.indexOf('y',i+1)
        JOptionPane.showMessageDialog(null," Il primo e ultimo indice di y e' " + i +" "," Ancora Su IndexOF ",JOptionPane.CLOSED_OPTION );
        int j=testo.indexOf('e');
        int k=testo.lastIndexOf('e');
        JOptionPane.showMessageDialog(null," La prima 'e' si trova all'indice " + j +" mentre l'ultima si trova  " + k + " "," Ancora Su IndexOF ",JOptionPane.CLOSED_OPTION );
        
    }

}
