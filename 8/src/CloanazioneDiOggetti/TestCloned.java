/*
 * TestCloned.java
 *
 * Created on November 25, 2007, 6:46 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package CloanazioneDiOggetti;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author frick
 */
public class TestCloned {
public static void main(String[]args){
    String s="";
    JTextArea tabella=new JTextArea(10,80);
    try{
        Impiegato originale=new Impiegato("Mario","Bianchi",50000);
        Impiegato copia=originale.clone();
        originale.saluto("L'impiegato originale lavora");
   
        copia.saluto("L'impiegato clonato porta il caffe al manager");
        Manager m1=new Manager("Lucio","Lucis",30000,5000);
        Manager m2=m1.clone();
      m1.saluto("Il Manager originale sgrida l'impiegato");
      m2.saluto("Il Manager clone si beve il caffe");
s+="\n"+originale+"\n\n";
s+=copia+"\n\n";
s+=m1+"\n\n"+m2;
tabella.setText(s);
tabella.setEditable(false);
JOptionPane.showMessageDialog(null,tabella,"Clonazione",JOptionPane.INFORMATION_MESSAGE);
    }catch(CloneNotSupportedException e){
        e.printStackTrace();
    }

}

    
}
