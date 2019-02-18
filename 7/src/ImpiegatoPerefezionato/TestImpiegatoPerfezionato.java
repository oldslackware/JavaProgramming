/*
 * TestImpiegatoPerfezionato.java
 *
 * Created on November 19, 2007, 6:21 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ImpiegatoPerefezionato;
import javax.swing.*;
/**
 *
 * @author frick
 */
public class TestImpiegatoPerfezionato {
    
       public static void main(String[]args){
    JTextArea tabella=new JTextArea(4,30);
    String s="";
    String num;
            String soldi;
    String cog="";
    double stipendio;
    int quanti;
    do{
    num=JOptionPane.showInputDialog(null,"Inserisci il numero di impiegati","Quanti Impiegati",JOptionPane.QUESTION_MESSAGE);
    quanti=Integer.parseInt(num);
    }while(quanti<=0);
    Impiegato[]azienda=new Impiegato[quanti];
    int i;
    azienda[0]=new Impiegato();
     s+="Impiegato numero"+azienda[0].getId()+"\nNome:"+azienda[0].getCognome()+"\nPercepisce un salario di "+azienda[0].getSalario()+"\n";
    for(i=1;i<quanti;i++){
        cog=JOptionPane.showInputDialog(null,"Inserisci il cognome dell'impiegato","Cognome Impiegato",JOptionPane.INFORMATION_MESSAGE);
        soldi=JOptionPane.showInputDialog(null,"Inserisci lo stipendio dell'impiegato","Stipendio Impiegato",JOptionPane.INFORMATION_MESSAGE);
        System.out.println(soldi);

        stipendio=Double.parseDouble(soldi);
          
            
        
        
        if(cog==""){
            
            azienda[i]=new Impiegato(stipendio);
            s+="Impiegato numero"+azienda[i].getId()+"\nNome:"+azienda[i].getCognome()+"\nPercepisce un salario di "+azienda[i].getSalario()+"\n";
        }
        
        else{
            
        azienda[i]=new Impiegato(cog,stipendio);
        s+="Impiegato numero"+azienda[i].getId()+"\nNome:"+azienda[i].getCognome().toUpperCase()+"\nPercepisce un salario di "+azienda[i].getSalario()+"\n";
        }
        
        
    }
    
    
    tabella.setText(s);
    tabella.setEditable(false);
    JOptionPane.showMessageDialog(null,tabella,"Lista Impiegati",JOptionPane.INFORMATION_MESSAGE);
    
    
}
    
}
