/*
 * ListaNomi.java
 *
 * Created on 11 maggio 2007, 12.15
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Varie;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author luciano
 */
public class ListaNomi {
    
    public static void main(String[]args){
        Vector v=new Vector();
         while(true){
            String nome=JOptionPane.showInputDialog(null,"Inserisci dei nomi");
            if(nome==null || nome.equals(""))
                break;
            else
                v.add(nome);
        }
        Iterator it=v.iterator();
        while(it.hasNext()){
            JOptionPane.showMessageDialog(null,(String)it.next());
        }
    }
    
}
