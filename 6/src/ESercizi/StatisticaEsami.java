/*
 * StatisticaEsami.java
 *
 * Created on October 27, 2007, 5:57 PM
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
public class StatisticaEsami {
   public static void main(String[]args){
       String voto;
       int votoI;
       String s="";
       String quanto=JOptionPane.showInputDialog(null,"Inserisci il numero di esami");
       int numero=Integer.parseInt(quanto);
       int voti[]=new int[numero];
       int frequenza[]=new int[31];
       for(int i=0;i<voti.length;i++){
           voto=JOptionPane.showInputDialog(null,"Inserisci il voto");
           votoI=Integer.parseInt(voto);
           voti[i]=votoI;
       }
       for(int j=0;j<voti.length;j++)
           ++frequenza[voti[j]];
           s+="Voto\tFrequenza\n";
           for(int k=18;k<frequenza.length;k++)
           s+=k+"\t"+frequenza[k]+"\n";
            JTextArea tabella=new JTextArea(11,20);
        tabella.setText(s);
        tabella.setEditable(false);
        JOptionPane.showMessageDialog(null,tabella,"Calcolo Frequenza ",JOptionPane.INFORMATION_MESSAGE);
   
   }
    
}
