/*
 * TestImpiegato.java
 *
 * Created on May 1, 2007, 4:04 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Dipendenti;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author francesca
 */
public class TestImpiegato {
   public static void main(String[]args){
       
       String myDipendent=JOptionPane.showInputDialog("Inserisci il numero di dipendenti");
       int numeroDipendenti=Integer.parseInt(myDipendent);
       Impiegato[]staff=new Impiegato[numeroDipendenti];
       
       String nomeBoss=JOptionPane.showInputDialog("Inserisci il nome del Manager");
       String bossSalario=JOptionPane.showInputDialog("Inserisci lo stipendio annuo del  boss");
       double salarioBoss=Double.parseDouble(bossSalario);
       String bossAnno=JOptionPane.showInputDialog("Inserisci l'anno di assunzione del boss");
       int annoBoss=Integer.parseInt(bossAnno);
       String bossMese=JOptionPane.showInputDialog("Inserisci il mese in numero di assunzione del manager");
       int meseBoss=Integer.parseInt(bossMese);
       String bossGiorno=JOptionPane.showInputDialog("Inserisci il giorno di assunzione del manager");
       int giornoBoss=Integer.parseInt(bossGiorno);
       String Bossbonus=JOptionPane.showInputDialog("Inserisci il bonus Manager");
       int bonusBoss=Integer.parseInt(Bossbonus);
       Manager manager=new Manager(nomeBoss,salarioBoss,annoBoss,meseBoss,giornoBoss);
       manager.setBonus(bonusBoss);
       staff[0]=manager;
       manager.aumentaSalarioManager(50);
       for(int i=1;i<staff.length;i++){
       String nome=JOptionPane.showInputDialog("Inserisci il nome del "+(i+1)+" dipendente");
       String mySalario=JOptionPane.showInputDialog("Inserisci lo stipendio annuo del "+(i+1)+" dipendente");
       double salario=Double.parseDouble(mySalario);
       String myAnno=JOptionPane.showInputDialog("Inserisci l'anno di assunzione del "+(i+1)+" dipendente");
       int anno=Integer.parseInt(myAnno);
       String myMese=JOptionPane.showInputDialog("Inserisci il mese in numero di assunzione del "+(i+1)+" dipendente");
       int mese=Integer.parseInt(myMese);
       String myGiorno=JOptionPane.showInputDialog("Inserisci il giorno di assunzione del "+(i+1)+" dipendente");
       int giorno=Integer.parseInt(myGiorno);
       staff[i]=new Impiegato(nome,salario,anno,mese,giorno);
       }
       for(int j=0;j<staff.length;j++){
           staff[j].aumentaSalario(10);
       }
  
       JOptionPane.showMessageDialog(null,"Nome= "+staff[0].getNome()+"- Salario= "+staff[0].getSalario()+ " e' stato assunto il "+staff[0].getAssunzioneGiorno()+" e con l'aumento percepito guadagna ora "+manager.getSalarioManager()+" euro","Dati Impiegati",JOptionPane.CLOSED_OPTION);
       
       for(int k=1;k<staff.length;k++){
       JOptionPane.showMessageDialog(null,"Nome= "+staff[k].getNome()+"- Salario= "+staff[k].getSalario()+ " e' stato assunto il "+staff[k].getAssunzioneGiorno()+" e con l'aumento percepito guadagna ora "+staff[k].getNewSalario()+" euro","Dati Impiegati",JOptionPane.CLOSED_OPTION);
 
       }
       System.exit(0);
       
   }   
    
}
