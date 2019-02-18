/*
 * AlcuniMetodi2.java
 *
 * Created on October 6, 2007, 7:46 PM
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
public class AlcuniMetodi2 {
    public static void main(String[]args){
        StringBuffer sb=new StringBuffer("Java is God");
        String uscita="Stringa di partenza "+ sb.toString() + "\nPrimo Carattere=" + sb.charAt(0) +"\nUltimo Carattere=" + sb.charAt(sb.length()-1) + " ";
        
        
        char []ArrayC=new char[sb.length()];
        sb.getChars(0,sb.length(),ArrayC,0);
        uscita+="\n\n\n I caratteri singoli sono:";
        for(int i=0;i<ArrayC.length;i++)
        uscita+=ArrayC[i];
    
    sb.setCharAt(0,'L');
    sb.setCharAt(sb.length()-2,'A');
    sb.setCharAt(8,'B');
    uscita+="\n\nNuovo Oggetto StringBuffer="+ sb.toString();
    sb.reverse();
    uscita+="\n\nInversione=" + sb.toString();
    JOptionPane.showMessageDialog(null,uscita,"Output",JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
    
    
    
    
    }
    
    
}
