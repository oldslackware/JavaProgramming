/*
 * NegozioSwitch.java
 *
 * Created on October 19, 2007, 6:44 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esercizi;

/**
 *
 * @author frick
 */
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class NegozioSwitch {
    
public static void main(String[]args) {
    double tot=0.0;
    String fine="fine";
    JTextArea tabella=new JTextArea(10,20);
    String text="PRODOTTI\tQUANTITA'\tIMPORTO";
    String prodotto1,prodotto2,prodotto3,prodotto4,prodotto5;
    String quanto1,quanto2,quanto3,quanto4,quanto5;
    int quantita1,quantita2,quantita3,quantita4,quantita5;
    double importo1,importo2,importo3,importo4,importo5;
    prodotto1=JOptionPane.showInputDialog(null,"Inserisci il nome in del prodotto");
    
    quanto1=JOptionPane.showInputDialog(null,"Inserisci la quantita presente in magazzino dei prodotto");
    quantita1=Integer.parseInt(quanto1);
    String imp1=JOptionPane.showInputDialog(null,"Inserire l'importo del prodotto");
    importo1=Double.parseDouble(imp1);
    text+="\n"+prodotto1+"\t"+quantita1+"\t"+importo1+"\t";
    if(prodotto1.equals(fine)||quantita1<0){
    JOptionPane.showMessageDialog(null,"Errore","Errore",JOptionPane.ERROR_MESSAGE);
    
    }
    
    prodotto2=JOptionPane.showInputDialog(null,"Inserisci il nome in del prodotto");
    quanto2=JOptionPane.showInputDialog(null,"Inserisci la quantita presente in magazzino dei prodotto");
    quantita2=Integer.parseInt(quanto2);
   String imp2=JOptionPane.showInputDialog(null,"Inserire l'importo del prodotto");
    importo2=Double.parseDouble(imp2);
    text+="\n"+prodotto2+"\t"+quantita2+"\t"+importo2+"\t";
    if(prodotto2.equals(fine)||quantita2<0){
    JOptionPane.showMessageDialog(null,"Errore","Errore",JOptionPane.ERROR_MESSAGE);
    }
    
    prodotto3=JOptionPane.showInputDialog(null,"Inserisci il nome in del prodotto");
    quanto3=JOptionPane.showInputDialog(null,"Inserisci la quantita presente in magazzino dei prodotto");
    quantita3=Integer.parseInt(quanto3);
       String imp3=JOptionPane.showInputDialog(null,"Inserire l'importo del prodotto");
    importo3=Double.parseDouble(imp3);
    text+="\n"+prodotto3+"\t"+quantita3+"\t"+importo3+"\t";
    if(prodotto3.equals(fine)||quantita3<0){
    JOptionPane.showMessageDialog(null,"Errore","Errore",JOptionPane.ERROR_MESSAGE);
    }
    
    prodotto4=JOptionPane.showInputDialog(null,"Inserisci il nome in del prodotto");
    quanto4=JOptionPane.showInputDialog(null,"Inserisci la quantita presente in magazzino dei prodotto");
    quantita4=Integer.parseInt(quanto4);
      String imp4=JOptionPane.showInputDialog(null,"Inserire l'importo del prodotto");
    importo4=Double.parseDouble(imp4);
    text+="\n"+prodotto4+"\t"+quantita4+"\t"+importo4+"\t";
    if(prodotto4.equals(fine)||quantita4<0){
    JOptionPane.showMessageDialog(null,"Errore","Errore",JOptionPane.ERROR_MESSAGE);
    }
    
    prodotto5=JOptionPane.showInputDialog(null,"Inserisci il nome in del prodotto");
    quanto5=JOptionPane.showInputDialog(null,"Inserisci la quantita presente in magazzino dei prodotto");
    quantita5=Integer.parseInt(quanto5);
       String imp5=JOptionPane.showInputDialog(null,"Inserire l'importo del prodotto");
    importo5=Double.parseDouble(imp5);
    text+="\n"+prodotto5+"\t"+quantita5+"\t"+importo5+"\t";
    if(prodotto5.equals(fine)||quantita5<0){
    JOptionPane.showMessageDialog(null,"Errore","Errore",JOptionPane.ERROR_MESSAGE);
    }
    tabella.setText(text);
    JOptionPane.showMessageDialog(null,tabella);
    String scelta;
       JTextArea tabellafinale=new JTextArea(10,30);
    String textfinale="PRODOTTI\tQUANTITA'\tIMPORTO UNITARIO\tIMPORTO COMPLESSIVO";
  do{
    scelta=JOptionPane.showInputDialog(null,"Inserisci il prodotto desiderato.Digitare fine per uscire");
    
    if(scelta.equals(prodotto1)){
        
         String primaQ=JOptionPane.showInputDialog(null,"Inserisci la quantita desiderata");
            int quantoPrima=Integer.parseInt(primaQ);
            if(quantoPrima>quantita1) {
                JOptionPane.showMessageDialog(null,"Quantita non disponibile\nQuantita' disponibile:\t"+quantita1+"","Errore",JOptionPane.INFORMATION_MESSAGE);
            }
            
            quantita1=quantita1-quantoPrima;
            tot+=importo1*quantoPrima;
            textfinale+="\n"+prodotto1+"\t"+quantoPrima+"\t"+importo1+"\t\t"+(importo1*quantoPrima);
    }
         if(scelta.equals(prodotto2)){
            String secondaQ=JOptionPane.showInputDialog(null,"Inserisci la quantita desiderata");
            int quantoSeconda=Integer.parseInt(secondaQ);
            if(quantoSeconda>quantita2) {
                JOptionPane.showMessageDialog(null,"Quantita non disponibile\nQuantita' disponibile:\t"+quantita2+"","Errore",JOptionPane.INFORMATION_MESSAGE);
            }
            
            quantita2-=quantoSeconda;
            tot+=importo2*quantoSeconda;
            textfinale+="\n"+prodotto2+"\t"+quantoSeconda+"\t"+importo2+"\t\t"+(importo2*quantoSeconda);
    
    
         } 
    
    if(scelta.equals(prodotto3)){
            String terzaQ=JOptionPane.showInputDialog(null,"Inserisci la quantita desiderata");
            int quantoTerza=Integer.parseInt(terzaQ);
            if(quantoTerza>quantita3) {
                JOptionPane.showMessageDialog(null,"Quantita non disponibile\nQuantita' disponibile:\t"+quantita3+"","Errore",JOptionPane.INFORMATION_MESSAGE);
            }
            
            quantita3-=quantoTerza;
            tot+=importo3*quantoTerza;
            textfinale+="\n"+prodotto3+"\t"+quantoTerza+"\t"+importo3+"\t\t"+(importo3*quantoTerza);
    
    
         }
    
    if(scelta.equals(prodotto4)){
            String quartaQ=JOptionPane.showInputDialog(null,"Inserisci la quantita desiderata");
            int quantoQuarta=Integer.parseInt(quartaQ);
            if(quantoQuarta>quantita4) {
                JOptionPane.showMessageDialog(null,"Quantita non disponibile\nQuantita' disponibile:\t"+quantita4+"","Errore",JOptionPane.INFORMATION_MESSAGE);
            }
            
            quantita4-=quantoQuarta;
            tot+=importo4*quantoQuarta;
            textfinale+="\n"+prodotto4+"\t"+quantoQuarta+"\t"+importo4+"\t\t"+(importo4*quantoQuarta);
    
    
         }
    
    if(scelta.equals(prodotto5)){
            String quintaQ=JOptionPane.showInputDialog(null,"Inserisci la quantita desiderata");
            int quantoQuinta=Integer.parseInt(quintaQ);
            if(quantoQuinta>quantita5) {
                JOptionPane.showMessageDialog(null,"Quantita non disponibile\nQuantita' disponibile:\t"+quantita5+"","Errore",JOptionPane.INFORMATION_MESSAGE);
            }
            
            quantita5-=quantoQuinta;
            tot+=importo5*quantoQuinta;
            textfinale+="\n"+prodotto5+"\t"+quantoQuinta+"\t"+importo5+"\t\t"+(importo5*quantoQuinta);
    
    
         }
    
    
}while(!scelta.equals(fine));
 tabellafinale.setText(textfinale);
 JOptionPane.showMessageDialog(null,tabellafinale);
 JOptionPane.showMessageDialog(null,"Il tuo importo totale e':" + tot +" euro","Saldo Finale",JOptionPane.INFORMATION_MESSAGE);
}
}
