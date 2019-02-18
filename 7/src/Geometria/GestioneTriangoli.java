/*
 * GestioneTriangoli.java
 *
 * Created on November 13, 2007, 5:28 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Geometria;

/**
 *
 * @author frick
 */
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.DecimalFormat;
public class GestioneTriangoli {
   
   private static String s="";
    public static void main(String[]args){
        DecimalFormat df=new DecimalFormat("0.00");
        JTextArea tabella=new JTextArea(4,10);
        String x1=JOptionPane.showInputDialog(null,"Inserisci la cordinata x del primo punto");
        double p1x=Double.parseDouble(x1);
        String y1=JOptionPane.showInputDialog(null,"Inserisci la cordinata y del primo punto");
        double p1y=Double.parseDouble(y1);
        
         String x2=JOptionPane.showInputDialog(null,"Inserisci la cordinata x del secondo punto");
        double p2x=Double.parseDouble(x2);
        String y2=JOptionPane.showInputDialog(null,"Inserisci la cordinata y del secondo punto");
        double p2y=Double.parseDouble(y2);
        
         String x3=JOptionPane.showInputDialog(null,"Inserisci la cordinata x del terzo punto");
        double p3x=Double.parseDouble(x3);
        String y3=JOptionPane.showInputDialog(null,"Inserisci la cordinata y del terzo punto");
        double p3y=Double.parseDouble(y3);
    
    Triangolo t=new Triangolo(new Punto(p1x,p1y),new Punto(p2x,p2y),new Punto(p3x,p3y));
    s+="\nPerimetro="+df.format(t.perimetro())+"\nArea="+df.format(t.area());
    tabella.setText(s);
    tabella.setEditable(false);
    JOptionPane.showMessageDialog(null,tabella,"Gestione Triangolo",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
