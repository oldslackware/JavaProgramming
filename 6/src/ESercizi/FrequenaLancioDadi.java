/*
 * FrequenaLancioDadi.java
 *
 * Created on October 29, 2007, 11:42 AM
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
public class FrequenaLancioDadi {
    public static void main(String[]args){ 
        int faccia1,faccia2,somma;
        int frequenza[]=new int[13];
        String s="";
        for(int i=0;i<=10000;i++){
            faccia1=1+(int)(Math.random()*6);
            faccia2=1+(int)(Math.random()*6);
            somma=faccia1+faccia2;
            ++frequenza[somma];
        }   
        s+="Risultato\tFrequenza";
        for(somma=1;somma<frequenza.length;somma++)
            s+="\n"+somma+"\t"+frequenza[somma];
    JTextArea tabella=new JTextArea(13,10);
    tabella.setText(s);
    tabella.setEditable(false);
    JOptionPane.showMessageDialog(null,tabella,"Somma Dadi 10000 volte",JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
    
    
    }
    
    
}
