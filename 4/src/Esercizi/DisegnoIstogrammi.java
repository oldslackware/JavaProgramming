/*
 * DisegnoIstogrammi.java
 *
 * Created on October 17, 2007, 4:06 PM
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
public class DisegnoIstogrammi {
    public static void main(String[]args){
        String n;
        String s="\t\t\tDisegno Istogrammi\nNumero\t\tIstogramma\n";
        int numero;
        int prova=5;
        JTextArea tabella=new JTextArea(7,60);
        ciclo:
        while(prova>0){
            n=JOptionPane.showInputDialog(null,"Inserisci un numero compreso tra 0 e 30");
            numero=Integer.parseInt(n);
           
            if(numero<0||numero>30){
                JOptionPane.showMessageDialog(null,"Dati non corretti","Errore",JOptionPane.ERROR_MESSAGE);
            
                continue;
            
            }
             s+=numero+"\t\t";
            for(int i=1;i<=numero;i++){
                s+='*';
                
            }
            s+="\n";
            tabella.setText(s);
            prova--;
        JOptionPane.showMessageDialog(null,tabella,"Istogramma",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
