/*
 * GestioneFabbrica.java
 *
 * Created on November 21, 2007, 4:02 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Fabbrica;

/**
 *
 * @author frick
 */
import javax.swing.*;
public class GestioneFabbrica {
    
  public static void main(String[]args){
      String nom,cog,sol;
      double paga;
    String s="";
     JTextArea tabella=new JTextArea(6,50);
    JScrollPane scroll=new JScrollPane(tabella);
    String size=JOptionPane.showInputDialog(null,"Inserisci il numero degli impiegati compreso il capo azienda","Quanti Impiegati",JOptionPane.INFORMATION_MESSAGE);
    int n=Integer.parseInt(size);
    Operaio[]op=new Operaio[n];
    String nomDir=JOptionPane.showInputDialog(null,"Inserisci il nome del capo","Nome Direttore",JOptionPane.INFORMATION_MESSAGE);
    String cogDir=JOptionPane.showInputDialog(null,"Inserisci il cognome del capo","Cognome Direttore",JOptionPane.INFORMATION_MESSAGE);
    String cascCap=JOptionPane.showInputDialog(null,"Inserisci lo stipendio del capo","Stipendio Direttore",JOptionPane.INFORMATION_MESSAGE);
    double pagaCa=Double.parseDouble(cascCap);
    Direttore capo=new Direttore(nomDir,cogDir,pagaCa);
    //capo.setBonus(10000);
    op[0]=capo;
    for(int i=1;i<op.length;i++){
   nom=JOptionPane.showInputDialog(null,"Inserisci il nome dell'operaio","Nome Operaio",JOptionPane.INFORMATION_MESSAGE);
   cog=JOptionPane.showInputDialog(null,"Inserisci il cognome dell'operaio","Cognome Operaio",JOptionPane.INFORMATION_MESSAGE);
    sol=JOptionPane.showInputDialog(null,"Inserisci lo stipendio dell'operaio","Stipendio Operaio",JOptionPane.INFORMATION_MESSAGE);
    paga=Double.parseDouble(sol);
    op[i]=new Operaio(nom,cog,paga);
    }
    for(int i=0;i<op.length;i++){
      String cl="Fabbrica.Direttore";
      String su;
      double aumento;
        if(op[i].getClass().getName().compareTo(cl)==0){
            s+="\nIl direttore "+op[i].getCognome().toUpperCase()+" "+op[i].getNome().toUpperCase()+" percepiva uno stipendio di "+op[i].getSalario()+"euro\n";
            do{
            su=JOptionPane.showInputDialog(null,"Inserisci la percentuale dell'aumento del direttore","percentuale Aumento",JOptionPane.INFORMATION_MESSAGE);
            aumento=Double.parseDouble(su);
            if(aumento<=0||aumento>100){
                JOptionPane.showMessageDialog(null,"Inserisci una percentuale compresa tra 1 e 100","Dati Non Validi",JOptionPane.INFORMATION_MESSAGE);
            }
            }while(aumento<=0||aumento>100);
              op[i].aumentaStipendio(aumento);
                s+="\nGrazie all'aumento del "+aumento+"% il direttore guadagna "+op[i].getSalario()+" euro";
            
                }else{
                s+="\nL'Operaio "+op[i].getCognome().toUpperCase()+" "+op[i].getNome().toUpperCase()+" percepiva uno stipendio di "+op[i].getSalario()+"euro\n";
                do{
                su=JOptionPane.showInputDialog(null,"Inserisci la percentuale dell'aumento dell'operaio","percentuale Aumento",JOptionPane.INFORMATION_MESSAGE);
                aumento=Double.parseDouble(su);
                if(aumento<=0||aumento>100){
                  
                JOptionPane.showMessageDialog(null,"Inserisci una percentuale compresa tra 1 e 100","Dati Non Validi",JOptionPane.INFORMATION_MESSAGE);
                }
                }while(aumento<=0||aumento>100);
                  op[i].aumentaStipendio(aumento);
                s+="\nGrazie all'aumento del "+aumento+"% l'operaio guadagna "+op[i].getSalario()+" euro";
          
                }
    }
    tabella.setText(s);
    tabella.setEditable(false);
    JOptionPane.showMessageDialog(null,scroll,"Gestione Paghe Azienda",JOptionPane.INFORMATION_MESSAGE);
    
  }
}
