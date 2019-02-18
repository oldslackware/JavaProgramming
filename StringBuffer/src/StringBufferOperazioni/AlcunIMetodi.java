/*
 * AlcunIMetodi.java
 *
 * Created on October 3, 2007, 6:00 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package StringBufferOperazioni;

/**
 *
 * @author frick
 */
import javax.swing.JOptionPane;
public class AlcunIMetodi {
    public static void main(String[]args){
        StringBuffer sb=new StringBuffer(JOptionPane.showInputDialog(null," Inserisci la Stringa contenente il tuo nome "));
       JOptionPane.showMessageDialog(null,"La Stringa " + sb + " contiene " + sb.length() +" caratteri e ha una capacita' di " + sb.capacity() +""," StringBuffer",JOptionPane.CLOSED_OPTION);
       sb.ensureCapacity(50);//modifichiamo la capacita' di default (posta a 16 del buffer),ponendola pari a 50
       JOptionPane.showMessageDialog(null,"La Stringa ha adesso una capacita' di " + sb.capacity() +""," StringBuffer",JOptionPane.CLOSED_OPTION);
       sb.append(" come stai? ");//inserimento in coda
       JOptionPane.showMessageDialog(null,"La Stringa adesso e' diventata:\n" + sb +""," StringBuffer",JOptionPane.CLOSED_OPTION);
       sb.insert(0, "Ciao ");//Inserimento in testa o in una posizione qualsiasi
       JOptionPane.showMessageDialog(null,"La Stringa adesso e' diventata:\n" + sb +""," StringBuffer",JOptionPane.CLOSED_OPTION);
       sb.setLength(10);
       JOptionPane.showMessageDialog(null,"La Stringa avendo posto come vincolo 10 caratteri  adesso diventa:\n " + sb +""," StringBuffer",JOptionPane.CLOSED_OPTION);
       sb.setLength(4);
       JOptionPane.showMessageDialog(null,"La Stringa avendo posto come vincolo 4 caratteri  adesso diventa:\n " + sb +""," StringBuffer",JOptionPane.CLOSED_OPTION);
       
    
    }
    
 
    
}
