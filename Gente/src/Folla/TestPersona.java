/*
 * TestPersona.java
 *
 * Created on May 1, 2007, 8:23 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Folla;
import java.text.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author francesca
 */
public class TestPersona {
    public static void main(String[]args){
       String MyElementImpiegati=JOptionPane.showInputDialog("Inserire il numero di impiegati");
       int impiegati=Integer.parseInt(MyElementImpiegati);
         
       String MyElementStudenti=JOptionPane.showInputDialog("Inserire il numero di studenti");
       int studenti=Integer.parseInt(MyElementStudenti);
       int totale=impiegati+studenti;
       Persona[]persona=new Persona[totale];
       //Impiegato[]impiegati=new Impiegato[impiegati];
       for(int i=0;i<persona.length-studenti;i++){
       String nome=JOptionPane.showInputDialog("Inserisci il nome del "+(i+1)+" dipendente");
       String cognome=JOptionPane.showInputDialog("Inserisci il cognome del "+(i+1)+" dipendente");
       String etaImpiegati=JOptionPane.showInputDialog("Inserisci l'eta' "+(i+1)+" dipendente");
       int eta=Integer.parseInt(etaImpiegati);
        String titoloStudio=JOptionPane.showInputDialog("Inserisci titolo Studio "+(i+1)+" dipendente");
       String mySalario=JOptionPane.showInputDialog("Inserisci lo stipendio annuo del "+(i+1)+" dipendente");
       double salario=Double.parseDouble(mySalario);
       String myAnno=JOptionPane.showInputDialog("Inserisci l'anno di assunzione del "+(i+1)+" dipendente");
       int anno=Integer.parseInt(myAnno);
       String myMese=JOptionPane.showInputDialog("Inserisci il mese in numero di assunzione del "+(i+1)+" dipendente");
       int mese=Integer.parseInt(myMese);
       String myGiorno=JOptionPane.showInputDialog("Inserisci il giorno di assunzione del "+(i+1)+" dipendente");
       int giorno=Integer.parseInt(myGiorno);
       persona[i]=new Impiegato(nome,cognome,eta,titoloStudio,salario,anno,mese,giorno);
       }
       for(int i=persona.length-studenti;i<persona.length;i++){
       String nome=JOptionPane.showInputDialog("Inserisci il nome del "+(i-persona.length+studenti+1)+" studente");
       String cognome=JOptionPane.showInputDialog("Inserisci il cognome del "+(i-persona.length+studenti+1)+" studente");
       String etaStudenti=JOptionPane.showInputDialog("Inserisci l'eta' "+(i-persona.length+studenti+1)+" studente");
       int eta=Integer.parseInt(etaStudenti);
       String titoloStudio=JOptionPane.showInputDialog("Inserisci titolo Studio "+(i-persona.length+studenti+1)+" studente");
       String TipoStudio=JOptionPane.showInputDialog("Inserisci cosa studia il "+(i-persona.length+studenti+1)+" studente");
       persona[i]=new Studente(nome,cognome,eta,titoloStudio,TipoStudio);
       
       }
       for(int j=0;j<persona.length;j++){
           JOptionPane.showMessageDialog(null," "+persona[j].getNome()+" "+persona[j].getCognome()+" "+persona[j].getDescrizione()+" ","persona",JOptionPane.CLOSED_OPTION);
           
       }
       
       System.exit(0);
      /*String MyElementStudenti=JOptionPane.showInputDialog("Inserire il numero di studenti");
       int studenti=Integer.parseInt(MyElementStudenti);
       
       
       
       
       int elementi=impiegati+studenti;
       Persona[]gente=new Persona[elementi];
        */
    }
    
}
