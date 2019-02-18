/*
 * IntersezioneLinee.java
 *
 * Created on November 17, 2007, 6:11 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package GeometriaSemplice;

/**
 *
 * @author frick
 */
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
public class IntersezioneLinee {
   public static void main(String[]args){
       String s="";
       //primo punto
       String x1=JOptionPane.showInputDialog(null,"Inserisci la coordinata x del primo punto","Ascissa Primo Punto",JOptionPane.INFORMATION_MESSAGE);
       double p1x=Double.parseDouble(x1);
       
       String y1=JOptionPane.showInputDialog(null,"Inserisci la coordinata y del primo punto","Ordinata Primo Punto",JOptionPane.INFORMATION_MESSAGE);
       double p1y=Double.parseDouble(y1);
       //Secondo punto
        String x2=JOptionPane.showInputDialog(null,"Inserisci la coordinata x del secondoo punto","Ascissa Secondo Punto",JOptionPane.INFORMATION_MESSAGE);
       double p2x=Double.parseDouble(x2);
       
       String y2=JOptionPane.showInputDialog(null,"Inserisci la coordinata y del secondo punto","Ordinata Secondo Punto",JOptionPane.INFORMATION_MESSAGE);
       double p2y=Double.parseDouble(y2);
       //Creiamo una linea
       JOptionPane.showMessageDialog(null,"Creiamo la seconda linea a partire dalle coordinate","Creazione linea",JOptionPane.INFORMATION_MESSAGE);
        String x1l=JOptionPane.showInputDialog(null,"Inserisci la coordinata x del primo punto","Ascissa Primo Punto",JOptionPane.INFORMATION_MESSAGE);
       double p1xl=Double.parseDouble(x1l);
       
        String y1l=JOptionPane.showInputDialog(null,"Inserisci la coordinata y del primo punto","Ordinata Primo Punto",JOptionPane.INFORMATION_MESSAGE);
       double p1yl=Double.parseDouble(y1l);
       
        String x2l=JOptionPane.showInputDialog(null,"Inserisci la coordinata x del secondoo punto","Ascissa Secondo Punto",JOptionPane.INFORMATION_MESSAGE);
       double p2xl=Double.parseDouble(x2l);
       
       String y2l=JOptionPane.showInputDialog(null,"Inserisci la coordinata y del secondo punto","Ordinata Secondo Punto",JOptionPane.INFORMATION_MESSAGE);
       double p2yl=Double.parseDouble(y2l);
       
       Punto inizio=new Punto(p1x,p1y);
       Punto fine=new Punto(p2x,p2y);
       Linea linea1=new Linea(inizio,fine);
       Linea linea2=new Linea(p1xl,p2xl,p1yl,p2yl);
       s+="Sono stati creati i Punti: " +inizio+" e " +fine;
       s+="\nSono state create le linee:\n"+linea1+" e "+linea2;
       s+="\n\nL'intersezione tra le due linee e' : "+linea1.intersezione(linea2);
       //Ora mi sposto il punto finale e ricalcolo l'intersezione'
       JTextArea tabella=new JTextArea(8,30);
       tabella.setText(s);
       tabella.setEditable(false);
       JOptionPane.showMessageDialog(null,tabella);
   }
    
}
