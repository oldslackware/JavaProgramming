/*
 * GestioneCalendario.java
 *
 * Created on November 20, 2007, 3:28 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Calendario;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author frick
 */
public class GestioneCalendario {
    public static void main(String[]args){
        String s="";
        JTextArea tabella=new JTextArea(4,30);
      GregorianCalendar gc = new GregorianCalendar();
        int day=gc.get(Calendar.DAY_OF_WEEK_IN_MONTH)-1;
        int numero=gc.get(Calendar.DATE);
        Giorno odierno=new Giorno(day);
        Giorno tmp=new Giorno(day-1);
        s+="\tProgramma Calendario";
        s+="\nOggi e' "+odierno.toString()+" "+numero+"\nIeri era "+tmp.toString()+" "+(numero-1);
        //
        Giorno futuro=new Giorno(day+6);
       Giorno prima=new Giorno(day+5);
       
        s+="\nTra 6 giorni sara' "+futuro.toString()+" "+(numero+6)+"\nIl giorno prima sara' "+prima.toString()+" "+(numero-5);
       tabella.setText(s);
       tabella.setEditable(false);
       JOptionPane.showMessageDialog(null,tabella,"Semplice Calendario",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
