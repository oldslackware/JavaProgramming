/*
 * FibonacciRicorsivo.java
 *
 * Created on October 24, 2007, 4:02 PM
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
public class FibonacciRicorsivo {
   public static void main(String[]args){
       String s="";
       JTextArea tabella=new JTextArea(10,20);
       for(int i=0;i<=20;i++)
           s+="Fibonacci di "+i+"="+fibonacci(i)+"\n";
       tabella.setEditable(false);
       tabella.setText(s);
       JOptionPane.showMessageDialog(null,tabella,"Numero di Fibonacci",JOptionPane.INFORMATION_MESSAGE);
   }
   public static double fibonacci(double x){
       if(x==0||x==1)
           return x;
       else
           return fibonacci(x-1)+fibonacci(x-2);
   }
    
}
