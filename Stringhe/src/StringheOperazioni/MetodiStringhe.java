/*
 * MetodiStringhe.java
 *
 * Created on 30 settembre 2007, 12.27
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
public class MetodiStringhe {
   public static void main(String[]args){
       JOptionPane.showMessageDialog(null,"Programma che visualizza alcuni metodi della classe String ","What's this?",JOptionPane.CLOSED_OPTION);    
       byte bArray[]={(byte) 'I',(byte) 'T',(byte) 'A',(byte) 'L',(byte) 'Y'};
       char cArray[]={'O','P','E','N',' ','S','O','U','R','C','E'};
       String testo,prima,seconda,terza,quarta,quinta,sesta,sbuffer,finale;
       StringBuffer buffer;
       testo=new String("WELCOME TO");
       buffer=new StringBuffer("IN JAVA");
       prima=new String();//invoco il costruttore di default che non essendo specificato..... :(
       seconda=new String(testo);
       terza=new String(bArray);
       quarta=new String(cArray);
       quinta=new String(bArray,2,3);
       sesta=new String(cArray,5,6);
       sbuffer=new String(buffer);
       finale="prima= "+ prima +"\nseconda ="+ seconda +"\nterza= "+ terza +"\nquarta ="+ quarta +"\nquinta= "+ quinta +"\nsesta ="+ sesta +"\nStringabuffer="+sbuffer;
       JOptionPane.showMessageDialog(null,finale,"The Power of Strings",JOptionPane.INFORMATION_MESSAGE);
       System.exit(0);
   }
    
}
