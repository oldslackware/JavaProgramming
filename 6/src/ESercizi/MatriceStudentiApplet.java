/*
 * MatriceStudentiApplet.java
 *
 * Created on November 5, 2007, 5:21 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ESercizi;

/**
 *
 * @author frick
 */
import java.awt.*;
import javax.swing.*;
public class MatriceStudentiApplet extends JApplet {
    String student=JOptionPane.showInputDialog(null,"Inserisci il numero di studenti");
    int studenti=Integer.parseInt(student);
    String nEsami=JOptionPane.showInputDialog(null,"Inserisci il numero esami per ogni studente");
    int esami=Integer.parseInt(nEsami);
    int risultato[][]=new int[studenti][esami];
    String s="";
    JTextArea tabella;
    public void init(){
    int x;
    for(int i=0;i<risultato.length;i++){
        JOptionPane.showMessageDialog(null,"Inserisci i voti dello studente " +(i+1)+"","Inserisci i voti",JOptionPane.INFORMATION_MESSAGE);
        for(int j=0;j<risultato[i].length;j++){
            do {
            x=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserisci il voto dell'esame " +(j+1)+""));
            if(x<0||x>31)
                JOptionPane.showMessageDialog(null,"Inserire un voto compreso tra 0 e 31 dove 31 rappresenta la lode","Errore",JOptionPane.ERROR_MESSAGE);
            }while(x<0||x>31);
        risultato[i][j]=x;
    }
    }
    tabella=new JTextArea();
    Container c=getContentPane();
    c.add(tabella);
    s+="\nLa matrice StudentixEsami:\n\n";
    costruisciStringa();
    s+="\n\nVoto piu' alto: "+ massimo() +"\nVoto piu' basso: "+ minimo() +"\n";
    for(int i=0;i<risultato.length;i++)
        s+="\nLa media dello studente " +(i+1) +" risulta " +media(risultato[i]);
    tabella.setFont(new Font("Comic",Font.PLAIN,12));
    tabella.setText(s);
    tabella.setEditable(false);
}
    public int massimo(){
        int max=0;
        for(int i=0;i<risultato.length;i++)
            for(int j=0;j<risultato[0].length;j++)
                if(risultato[i][j]>max)
                    max=risultato[i][j];
        return max;
    }
    public int minimo(){
        int min=32;
        for(int i=0;i<risultato.length;i++)
            for(int j=0;j<risultato[0].length;j++)
                if(risultato[i][j]<min)
                    min=risultato[i][j];
        return min;
    }
    
    public double media(int mediaEsami[]){
        int totale=0;
        for(int i=0;i<mediaEsami.length;i++)
            totale+=mediaEsami[i];
        return (double)totale/mediaEsami.length;
    }
    
    public void costruisciStringa(){
    s+="                   ";
        for(int i=0;i<risultato[0].length;i++)
            s+="[" + (i+1) +"] ";
            s+="\n";
        for(int i=0;i<risultato.length;i++){
            s+="\nStudente[" + (i+1) +"]  ";
        for(int j=0;j<risultato[0].length;j++)
            s+=risultato[i][j]+" ";
    }
    }
    }