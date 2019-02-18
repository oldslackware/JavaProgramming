/*
 * TestPersona.java
 *
 * Created on November 21, 2007, 6:30 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Astrazione;

/**
 *
 * @author frick
 */
import javax.swing.*;
public class TestPersona {
    
  public static void main(String[]args){
      String s="";
      JTextArea tabella=new JTextArea(30,80);
      JScrollPane scroll=new JScrollPane(tabella);
      Persona[]folla=new Persona[4];
      
      folla[0]=new Impiegato("Marco","Rossi",20000);
      folla[1]=new Studente("Biagio","Frascino","Economia");
      folla[2]=new Casalinga("Marika","Rossi",3);
      folla[3]=new Barbone("Raffaele","Aita","cartone");
  
  for(int i=0;i<folla.length;i++){
          s+="\n"+folla[i].getCognome().toUpperCase()+" "+folla[i].getNome().toUpperCase()+" "+folla[i].descrizione()+" "+folla[i].saluto();
  }
  tabella.setText(s);
  tabella.setEditable(false);
  JOptionPane.showMessageDialog(null,scroll,"Persone diverse tra loro",JOptionPane.INFORMATION_MESSAGE);
  
  }
    
}
