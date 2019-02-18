/*
 * PrimoArray.java
 *
 * Created on October 26, 2007, 6:50 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ESercizi;

/**
 *
 * @author frick
 */
import javax.swing.*;
public class PrimoArray {
    public static void main(String[]args){
        String s="";
        String out="";
        int valore;
        final int max=11;
        int n[]=new int[max];
        for(int i=0;i<n.length;i++){
            out=JOptionPane.showInputDialog(null,"Inserisci 11 Numeri");
        valore=Integer.parseInt(out);
        n[i]=valore;
        }
        s+="Elemento\tValore\n";
        for(int i=0;i<n.length;i++)
            s+=(i+1)+"\t"+n[i]+"\n";
        JTextArea tabella=new JTextArea(12,20);
        tabella.setText(s);
        JOptionPane.showMessageDialog(null,tabella,"Un esempio di array",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
                
        
    }
    
}
