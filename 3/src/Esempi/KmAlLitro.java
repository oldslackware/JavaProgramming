/*
 * KmAlLitro.java
 *
 * Created on October 9, 2007, 7:43 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esempi;

/**
 *
 * @author frick
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class KmAlLitro {
    public static void main(String[]args) {
        double numeroLitri=0;
        double numeroKm=0;
        double mediaTotale=0;
        String lt=JOptionPane.showInputDialog(null,"Inserisci i litri di benzina iniettati,per uscire digitare \nesc");
        String end="esc";
        if(lt.equalsIgnoreCase(end)){
            System.exit(0);
        }
        
    double litri=Double.parseDouble(lt);
    numeroLitri+=litri;
    String percorso=JOptionPane.showInputDialog(null,"Inserisci il numero di km effettuati con " + litri +" di benzina");
   double km=Double.parseDouble(percorso);
   numeroKm+=km;
   if(litri!=0 && km!=0){
   DecimalFormat fd=new DecimalFormat("0.00");
   double med=(double)km/litri;
    JOptionPane.showMessageDialog(null,"Hai percorso " + fd.format(med) +" km al litro");
   
    while(!lt.equalsIgnoreCase(end)){
       lt=JOptionPane.showInputDialog(null,"Inserisci i litri di benzina iniettati,per uscire digitare \nesc");
       if(lt.equals(end)){
            System.exit(0);
        }
       litri=Double.parseDouble(lt);
        numeroLitri+=litri;
       percorso=JOptionPane.showInputDialog(null,"Inserisci il numero di km effettuati con " + litri +" di benzina");
       km=Double.parseDouble(percorso);
       numeroKm+=km;
       
       
        DecimalFormat df=new DecimalFormat("0.00");
        if(litri!=0&&km!=0){
            med=(double)km/litri;
            mediaTotale=(double)numeroKm/numeroLitri;
        
       
       //med=km/litri;
       //mediaTotale=numeroKm/numeroLitri;
       JOptionPane.showMessageDialog(null,"Hai percorso " + df.format(med) +" km al litro.\nHai ottenuto una media totale di " + df.format(mediaTotale) +" km al litro.","Calcolo Consumi",JOptionPane.INFORMATION_MESSAGE);
            
        
   }else{
            JOptionPane.showMessageDialog(null,"Hai inserito una quantita' errata","Errore in input",JOptionPane.ERROR_MESSAGE);
    System.exit(0);
   }
   
    }
    
    } 
   JOptionPane.showMessageDialog(null,"Hai inserito una quantita' errata","Errore in input",JOptionPane.ERROR_MESSAGE);
    System.exit(0);
    }
    
}
