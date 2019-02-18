/*
 * AppendiamoUnPo.java
 *
 * Created on October 6, 2007, 8:32 PM
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
public class AppendiamoUnPo {
    public static void main(String[]args){
        Object s="Italy Open Source";
        int n=23;
        char[]ch={'W','E','L','C','O','M','E',' ','T','O',' ','J','A','V','A'};
        double d=16.92;
        boolean b=false;
        StringBuffer sb=new StringBuffer();
        sb.append(s);
        sb.append("-");
        sb.append(n); 
        sb.append("-");
        sb.append(b);
        sb.append("-");
        sb.append(d);
        sb.append("-");
        sb.append(ch);
        sb.append("-");
        sb.append(ch,0,7);        
        JOptionPane.showMessageDialog(null,"Oggetto StringBuffer="+ sb.toString() ,"Uso di ValueOf",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        
        
    }
    
    
    
}
