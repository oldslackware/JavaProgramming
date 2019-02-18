/*
 * MassimoMinimoApplet.java
 *
 * Created on October 20, 2007, 11:08 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */


/**
 *
 * @author frick
 */
import java.awt.Container;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.JApplet;
public class MassimoMinimoApplet extends JApplet {
    double primo,secondo,terzo;
    double max,min;
    public void init(){
        JTextArea tabella=new JTextArea(10,20);
        String s1=JOptionPane.showInputDialog(null,"Inserisci il primo numero");
       primo=Double.parseDouble(s1);
       String s2=JOptionPane.showInputDialog(null,"Inserisci il secondo numero");
       secondo=Double.parseDouble(s2);
       String s3=JOptionPane.showInputDialog(null,"Inserisci il terzo numero");
       terzo=Double.parseDouble(s3);
       max=massimo(primo,secondo,terzo);
       min=minimo(primo,secondo,terzo);
       tabella.setText("Primo Numero "+primo+"\nSecondo Numero "+secondo+"\nTerzo Numero "+terzo+"\nIl massimo e' "+max+"\nIl minimo e' "+min);
       Container c=getContentPane();
       c.add(tabella);
       
    }
    public double massimo(double n1,double n2,double n3){
        return Math.max(n1,Math.max(n2,n3));
    }
    public double minimo(double n1,double n2,double n3){
        return Math.min(n1,Math.min(n2,n3));
    }
    
}
