/*
 * OperatoriLogici.java
 *
 * Created on October 15, 2007, 7:13 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esercizi;

/**
 *
 * @author frick
 */
import javax.swing.*;
public class OperatoriLogici {
    public static void main(String[]args){
        JTextArea tabella=new JTextArea(20,30);
        JScrollPane scroll=new JScrollPane(tabella);
        String s="";
        s+="And Logico(&&) "+"\ntrue && true:" +(true && true) +"\ntrue && false:" +(true && false) +"\nfalse && true:" +(false && true) +"\nfalse && false:" +(false && false);
        s+="\n\nOr Logico(||) "+"\ntrue || true:" +(true || true) +"\ntrue || false:" +(true || false) +"\nfalse || true:" +(false || true) +"\nfalse || false:" +(false || false);
    
        s+="\n\nAnd Booleano(&) "+"\ntrue & true:" +(true & true) +"\ntrue & false:" +(true & false) +"\nfalse & true:" +(false & true) +"\nfalse && false:" +(false & false);     
        s+="\n\nOr Booleano(|) "+"\ntrue | true:" +(true | true) +"\ntrue | false:" +(true | false) +"\nfalse | true:" +(false | true) +"\nfalse | false:" +(false | false);
        s+="\n\nOr Esclusivo(^) "+"\ntrue ^ true:" +(true ^ true) +"\ntrue ^ false:" +(true ^ false) +"\nfalse ^ true:" +(false ^ true) +"\nfalse ^ false:" +(false ^ false);
        s+="\n\nNot Logici(!)"+"\n!false:"+(!false) +"\n!true:"+(!true);
        
        tabella.setText(s);
        JOptionPane.showMessageDialog(null,scroll,"Tabella Verita'",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    
    }
    
    
}
