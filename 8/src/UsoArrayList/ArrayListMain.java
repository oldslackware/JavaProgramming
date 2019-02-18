/*
 * ArrayListMain.java
 *
 * Created on November 24, 2007, 5:28 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package UsoArrayList;

/**
 *
 * @author frick
 */
import java.util.*;
import javax.swing.*;
public class ArrayListMain {
    public static void main(String[]args){
        JTextArea tabella=new JTextArea(30,70);
    JScrollPane scroll=new JScrollPane(tabella);
    String s="";
    
    ArrayList<Impiegato>membri=new ArrayList<Impiegato>();
    membri.add (new Impiegato("Mario","Rossi",30000));
    membri.add (new Impiegato("Carlo","Neri",20000));
    membri.add(new Boss("Paolo","Verdi",50000,40000));
    
    for(int i=0;i<membri.size();i++){
        Impiegato p=(Impiegato) membri.get(i);
        p.aumento(10);
        s+=p.toString()+"\n\n";
    }
    tabella.setText(s);
    tabella.setEditable(false);
    JOptionPane.showMessageDialog(null,scroll,"ArrayListConOggettiDiversi",JOptionPane.INFORMATION_MESSAGE);
    
    }
    
    
}
