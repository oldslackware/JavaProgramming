/*
 * Istogramma.java
 *
 * Created on October 29, 2007, 10:49 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ESercizi;

/**
 *
 * @author frick
 */
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
public class Istogramma {
    public static void main(String[]args) {
        String s="";
        String cap=JOptionPane.showInputDialog(null,"Quanti valori possiedi?");
        int numero;
        int size=Integer.parseInt(cap);
        int[] n=new int[size];
        s+="Elemento\tValore\tIstogramma";
        int i,j,k;
        for(k=0;k<size;k++){
        String number=JOptionPane.showInputDialog(null,"Inserisci il valore");
        numero=Integer.parseInt(number);
        n[k]=numero;
        
        s+="\n"+(k+1)+"\t"+n[k]+"\t";
        for(j=1;j<=n[k];j++)
            s+="*";
        
        }
        JTextArea tabella=new JTextArea(20,70);
        tabella.setText(s);
        tabella.setEditable(false);
        JScrollPane scroll=new JScrollPane(tabella);
        JOptionPane.showMessageDialog(null,scroll,"Istogramma",JOptionPane.INFORMATION_MESSAGE);
        
    
    
    
    }
    
    
    
}
