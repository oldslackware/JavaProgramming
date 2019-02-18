/*
 * ConversioneInStringhe.java
 *
 * Created on October 3, 2007, 6:53 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package StringBufferOperazioni;

/**
 *
 * @author luciano
 */
import javax.swing.JOptionPane;
public class ConversioneInStringhe {
    public static void main(String[]args){
      StringBuffer sb=new StringBuffer("Poteva andare peggio");
      JOptionPane.showMessageDialog(null,"La Stringa di partenza e':\n" + sb +""," StringBuffer",JOptionPane.CLOSED_OPTION);
      String parola=sb.toString();
      sb.append(",ma " +parola.substring(0, 14) + "anche meglio");
      JOptionPane.showMessageDialog(null,"L'oggetto StringBuffer e' diventato ora:\n" + sb +""," StringBuffer",JOptionPane.CLOSED_OPTION);
      JOptionPane.showMessageDialog(null,"La Stringa vera e'propria e' rimasta:\n" + parola +""," StringBuffer",JOptionPane.CLOSED_OPTION);
    }
  
}
