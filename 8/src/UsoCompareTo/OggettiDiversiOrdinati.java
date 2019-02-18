/*
 * OggettiDiversiOrdinati.java
 *
 * Created on November 25, 2007, 5:05 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package UsoCompareTo;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author frick
 */
public class OggettiDiversiOrdinati {
     public static void main(String[]args){
        JTextArea tabella=new JTextArea(30,70);
    JScrollPane scroll=new JScrollPane(tabella);
    String s="";
    
    Impiegato[]staff=new Impiegato[3];
    staff[0]=new Impiegato("Mario","Rossi",30000);
    staff[1]=new Impiegato("Carlo","Neri",20000);
    staff[2]=new Manager("Paolo","Verdi",50000,40000);
    Arrays.sort(staff);
    for(int i=0;i<staff.length;i++){
      s+=staff[i].toString()+"\n\n";
}
    
      tabella.setText(s);
    tabella.setEditable(false);
    JOptionPane.showMessageDialog(null,scroll,"OggetiOrdinatiPerStipendio",JOptionPane.INFORMATION_MESSAGE);
     }
}