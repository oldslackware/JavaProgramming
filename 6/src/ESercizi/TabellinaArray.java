/*
 * TabellinaArray.java
 *
 * Created on October 27, 2007, 3:49 PM
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
public class TabellinaArray {
    public static void main(String[]args){
        String s="";
        String fattore=JOptionPane.showInputDialog(null,"Quale tabellina vuoi calcolare");
        int numero=Integer.parseInt(fattore);
        final int max=10;
        int []n=new int[max];
        for(int i=0;i<n.length;i++)
            n[i]=numero+numero*i;
        s+="Fattore\tValore\n";
        for(int i=0;i<n.length;i++)
            s+=(i+1)+"\t"+n[i]+"\n";
        JTextArea tabella=new JTextArea(11,20);
        tabella.setText(s);
        tabella.setEditable(false);
        JOptionPane.showMessageDialog(null,tabella,"Calcolo tabellina ",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
