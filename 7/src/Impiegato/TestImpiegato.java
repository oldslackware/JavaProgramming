/*
 * TestImpiegato.java
 *
 * Created on November 19, 2007, 1:41 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Impiegato;

/**
 *
 * @author frick
 */
import javax.swing.*;
public class TestImpiegato {
    public static void main(String[]args){
    JTextArea tabella=new JTextArea(4,30);
    String s="";
    String num,soldi;
    String nom="";
    String cog="";
    String g="";
    String m="";
    String a="";
    String su,giu;
    double stipendio,aumento;
    int quanti,day,month,year;
    do{
    num=JOptionPane.showInputDialog(null,"Inserisci il numero di impiegati","Quanti Impiegati",JOptionPane.QUESTION_MESSAGE);
    quanti=Integer.parseInt(num);
    }while(quanti<=0);
    Impiegato[]azienda=new Impiegato[quanti];
    int i;
    for(i=0;i<quanti;i++){
        nom=JOptionPane.showInputDialog(null,"Inserisci il nome dell'impiegato","Nome Impiegato",JOptionPane.INFORMATION_MESSAGE);
        cog=JOptionPane.showInputDialog(null,"Inserisci il cognome dell'impiegato","Cognome Impiegato",JOptionPane.INFORMATION_MESSAGE);
        soldi=JOptionPane.showInputDialog(null,"Inserisci lo stipendio dell'impiegato","Stipendio Impiegato",JOptionPane.INFORMATION_MESSAGE);
        stipendio=Double.parseDouble(soldi);
       
       
        g=JOptionPane.showInputDialog(null,"Inserisci il giorno di nascita dell'impiegato","Giorno Nascita",JOptionPane.INFORMATION_MESSAGE);
        day=Integer.parseInt(g);
        m=JOptionPane.showInputDialog(null,"Inserisci il mese di nascita dell'impiegato","Mese Nascita",JOptionPane.INFORMATION_MESSAGE);
        month=Integer.parseInt(m);
         a=JOptionPane.showInputDialog(null,"Inserisci l'anno di nascita dell'impiegato","Anno Nascita",JOptionPane.INFORMATION_MESSAGE);
        year=Integer.parseInt(a);
        
        azienda[i]=new Impiegato(nom,cog,stipendio,year,month,day);
        
        s+="\nCognome:"+azienda[i].getCognome().toUpperCase()+"\nNome:"+azienda[i].getNome().toUpperCase()+"\nData di Nascita:"+azienda[i].getNascita()+"\nPercepisce un salario di "+azienda[i].getSalario()+"\n";
    }
    su=JOptionPane.showInputDialog(null,"Inserisci aumento","Aumento o Scalo",JOptionPane.INFORMATION_MESSAGE);
    aumento=Double.parseDouble(su);
    int j;
    for(j=0;j<azienda.length;j++){
    if(aumento>0)
        azienda[j].aumentaSalario(aumento);
    else
        azienda[j].diminuisciSalario(aumento);
    s+="\nCognome:"+azienda[j].getCognome().toUpperCase()+"\nNome:"+azienda[j].getNome().toUpperCase()+"\nData di Nascita:"+azienda[j].getNascita()+"\nPercepisce un salario di "+azienda[j].getSalario()+"\n";
    
    }
    tabella.setText(s);
    tabella.setEditable(false);
    JOptionPane.showMessageDialog(null,tabella,"Lista Impiegati",JOptionPane.INFORMATION_MESSAGE);
    
    
}
}