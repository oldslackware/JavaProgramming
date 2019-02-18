/*
 * TreNumeri.java
 *
 * Created on October 7, 2007, 10:20 PM
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
public class TreNumeri {
   
    public static void main(String[]args){
        String uno=JOptionPane.showInputDialog(null,"Inserisci il primo numero");
        String due=JOptionPane.showInputDialog(null,"Inserisci il secondo nuemro");
        String tre=JOptionPane.showInputDialog(null,"Inserisci il terzo numero");
        double primo=Double.parseDouble(uno);
        double secondo=Double.parseDouble(due);
        double terzo=Double.parseDouble(tre);
        
        double somma=primo+secondo+terzo;
        double prod=primo*secondo*terzo;
        double med=somma/3;
       if(primo > secondo && primo > terzo){
    JOptionPane.showMessageDialog(null,"Il numero " + primo + " e' maggiore sia di " + secondo +" che di " + terzo +".","Informazione",JOptionPane.INFORMATION_MESSAGE);
    
      JOptionPane.showMessageDialog(null,"Risultati con "+ primo + "-" + secondo +" e " + terzo +"\nSomma=" + somma +"\nProdotto=" + prod + "\nMedia=" + med +" ","MiniCalcolatrice",JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
    }
    if(secondo > primo && secondo > terzo){
        JOptionPane.showMessageDialog(null,"Il numero " + secondo +" e' maggiore sia di " + primo +"che di " + terzo +".","Informazione",JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null,"Risultati con "+ primo + "-" + secondo +" e " + terzo +"\nSomma=" + somma +"\nProdotto=" + prod + "\nMedia=" + med +" ","MiniCalcolatrice",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
      
         if(terzo > primo && secondo < terzo){
        JOptionPane.showMessageDialog(null,"Il numero " + terzo +" e' maggiore sia di " + primo +"che di " + secondo +".","Informazione",JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null,"Risultati con "+ primo + "-" + secondo +" e " + terzo +"\nSomma=" + somma +"\nProdotto=" + prod + "\nMedia=" + med +" ","MiniCalcolatrice",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        
         } 
        
        
    JOptionPane.showMessageDialog(null,"Il numero " + primo + " e' uguale sia al " + secondo +" che al "+ terzo +".","Informazione",JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(null,"Risultati con "+ primo + "-" + secondo +" e " + terzo +"\nSomma=" + somma +"\nProdotto=" + prod + "\nMedia=" + med +" ","MiniCalcolatrice",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    
}
}
    
    

