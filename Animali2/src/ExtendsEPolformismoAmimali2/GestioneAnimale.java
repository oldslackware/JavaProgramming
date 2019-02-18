/*
 * GestioneAnimale.java
 *
 * Created on 10 maggio 2007, 19.27
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ExtendsEPolformismoAmimali2;

/**
 *
 * @author luciano
 */
import java.util.Random;
import javax.swing.JOptionPane;
public class GestioneAnimale {
    
    public static void main(String[]args){
        Animale[]animali=new Animale[3];
       String myDog=JOptionPane.showInputDialog("Inserisci il nome  del cane");
        String razzaC=JOptionPane.showInputDialog("Inserisci la razza del cane");
 Cane c=new Cane(myDog,razzaC);
 animali[0]=c;
 String myCat=JOptionPane.showInputDialog("Inserisci il nome del gatto");
 String razzaG=JOptionPane.showInputDialog("Inserisci la razza del gatto");
 Gatto g=new Gatto(myCat,razzaG);
 animali[1]=g;
String myDuck=JOptionPane.showInputDialog("Inserisci il numero di oche");
 String razzaO=JOptionPane.showInputDialog("Inserisci la razza dell'oca");  
  Oca o=new Oca(myDuck,razzaO);
   animali[2]=o;
    
   Animale animalescelto;
   Random scelta=new Random();
   for(int i=0;i<5;i++){
       animalescelto=animali[scelta.nextInt(animali.length)];
       JOptionPane.showMessageDialog(null,animalescelto+" sta emettendo il suono "+animalescelto.sound(),"Animali",JOptionPane.CLOSED_OPTION);
   }
    }
}