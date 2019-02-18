/*
 * InserimentoeCancellazione.java
 *
 * Created on October 6, 2007, 9:42 PM
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
public class InserimentoeCancellazione {
    public static void main(String[]args){
        Object s="Italy Open Source";
        int n=23;
        char[]ch={'W','E','L','C','O','M','E',' ','T','O',' ','J','A','V','A'};
        double d=16.92;
        boolean b=false;
        StringBuffer sb=new StringBuffer();
        
        sb.insert(0,s);
        sb.insert(0," ");
        sb.insert(0,n);
        sb.insert(0," ");
        sb.insert(0,ch);
        sb.insert(0," ");
        sb.insert(0,d);
        sb.insert(0," ");
        sb.insert(0,b);
       
        String res="\nOggetto StringBuffer dopo l'inserimento:\n"+ sb.toString();
        
        sb.deleteCharAt(3);
        sb.deleteCharAt(16);
        
        sb.delete(20,25);
        
        res+="\n\n\n Oggetto StringBuffer dopo l'eliminazione:\n"+ sb.toString();
        
        JOptionPane.showMessageDialog(null,res,"Inseriamo e Cancelliamo",JOptionPane.CLOSED_OPTION);
        System.exit(0);
      }
    
    
}
