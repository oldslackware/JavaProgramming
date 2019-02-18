/*
 * GestioneEconomia.java
 *
 * Created on November 20, 2007, 5:18 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Economia;

/**
 *
 * @author frick
 */
import javax.swing.*;
public class GestioneEconomia {
    public static void main(String[]args) {
        String inserisci="i";
        String preleva="p";
        String fine="e";
        String out;
        JTextArea tabella=new JTextArea(3,50);
        JScrollPane scroll=new JScrollPane(tabella);
        String s="";
        String cent=JOptionPane.showInputDialog(null,"Inserisci i centesimi a disposizione","Centesimi",JOptionPane.INFORMATION_MESSAGE);
        int cen=Integer.parseInt(cent);
        String eur=JOptionPane.showInputDialog(null,"Inserisci gli euro a disposizione","Euro posseduti",JOptionPane.INFORMATION_MESSAGE);
        int eu=Integer.parseInt(eur);
        Portafoglio mio=new Portafoglio(cen,eu);
        s+="\nDenaro Iniziale:\n" +mio.toString();
        tabella.setText(s);
        
            tabella.setEditable(false);
    JOptionPane.showMessageDialog(null,scroll,"Bilancio Attuale",JOptionPane.INFORMATION_MESSAGE);
        do{
            out=JOptionPane.showInputDialog(null,"Digita P per prelevare,I per inserire,E per uscire","Cosa vuoi fare",JOptionPane.INFORMATION_MESSAGE);
            if(out.equalsIgnoreCase(preleva)){
                String cp=JOptionPane.showInputDialog(null,"Inserisci i centesimi da prelevare","Quanti centesimi",JOptionPane.INFORMATION_MESSAGE);
                int pc=Integer.parseInt(cp);
                 String ep=JOptionPane.showInputDialog(null,"Inserisci gli euro da prelevare","Quanti euro",JOptionPane.INFORMATION_MESSAGE);
                int pe=Integer.parseInt(ep);
                mio.rimuovi(pc,pe);
                s+="\n"+mio.toString()+"\n";
                   tabella.setText(s);
            tabella.setEditable(false);
    JOptionPane.showMessageDialog(null,scroll,"Bilancio Attuale",JOptionPane.INFORMATION_MESSAGE);
            }
            
            if(out.equalsIgnoreCase(inserisci)){
                String cp=JOptionPane.showInputDialog(null,"Inserisci i centesimi da depositare","Quanti centesimi",JOptionPane.INFORMATION_MESSAGE);
                int pc=Integer.parseInt(cp);
                 String ep=JOptionPane.showInputDialog(null,"Inserisci gli euro da depositare","Quanti euro",JOptionPane.INFORMATION_MESSAGE);
                int pe=Integer.parseInt(ep);
                s+="\n"+mio.toString()+"\n";
               mio.inserisci(pc,pe);
                  tabella.setText(s);
            tabella.setEditable(false);
    JOptionPane.showMessageDialog(null,scroll,"Bilancio Attuale",JOptionPane.INFORMATION_MESSAGE);
            
        }
            if(!out.equalsIgnoreCase(fine)&&!out.equalsIgnoreCase(inserisci)&&!out.equalsIgnoreCase(preleva)){
                JOptionPane.showMessageDialog(null,"Digita P per prelevare,I per inserire,E per uscire","Errore Input",JOptionPane.ERROR_MESSAGE);
            }
    }while(!out.equalsIgnoreCase(fine));
    s+="\n"+mio.toString()+"\n";
    tabella.setText(s);
    tabella.setEditable(false);
    JOptionPane.showMessageDialog(null,scroll,"Bilancio Attuale",JOptionPane.INFORMATION_MESSAGE);
    
}
}