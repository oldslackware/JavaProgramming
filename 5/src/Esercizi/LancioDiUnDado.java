/*
 * LancioDiUnDado.java
 *
 * Created on October 22, 2007, 11:00 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esercizi;

/**
 *
 * @author frick
 */
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class LancioDiUnDado {
   public static void main(String[]args){
       int frequenza1=0;
       int frequenza2=0;
       int frequenza3=0;
       int frequenza4=0;
       int frequenza5=0;
       int frequenza6=0;
       int faccia;
       
       for(int i=1;i<10000000;i++){
           faccia=1+(int)(Math.random()*6);
       
       switch(faccia) {
           case 1:
               ++frequenza1;
               break;
           case 2:
               ++frequenza2;
               break;
           case 3:
               ++frequenza3;
                break;
           case 4:
               ++frequenza4;
               break;
           case 5:
               ++frequenza5;
               break;
           case 6:
               ++frequenza6;
               break;
       }
       }
       JTextArea tabella=new JTextArea(7,20);
       tabella.setText("Faccia\tFrequenza"+"\n1\t"+ frequenza1 +"\n2\t"+ frequenza2 +"\n3\t"+ frequenza3 +"\n4\t"+ frequenza4 +"\n5\t"+ frequenza5 +"\n6\t"+ frequenza6);
       JOptionPane.showMessageDialog(null,tabella,"Lancio di un dado per 10milioni di volte",JOptionPane.INFORMATION_MESSAGE);
       System.exit(0);
       
       }
   }
    

