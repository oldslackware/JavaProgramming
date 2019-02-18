/*
 * FattorialeRicorsivo.java
 *
 * Created on October 24, 2007, 3:40 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esercizi;

/**
 *
 * @author frick
 */

import javax.swing.JTextArea;
import javax.swing.JOptionPane;
public class FattorialeRicorsivo {
     public static void main(String[]args){
        String s="";
        JTextArea tabella=new  JTextArea(10,20);
        for(int i=0;i<=10;i++){
            s+=(i+"!=" +fattoriale(i)+"\n");
            tabella.setText(s);
        }     
        JOptionPane.showMessageDialog(null,tabella,"Fattoriale",JOptionPane.INFORMATION_MESSAGE);
    
    }
    public static int fattoriale(int x){
        if(x<=1)
            return 1;
        else
            return x*fattoriale(x-1);//La potenza della ricorsione
        
        
    }
    
   
    
}
