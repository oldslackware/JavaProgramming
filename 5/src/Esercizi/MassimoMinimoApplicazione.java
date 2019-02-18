/*
 * MassimoMinimoApplicazione.java
 *
 * Created on October 22, 2007, 10:30 AM
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
public class MassimoMinimoApplicazione {
    public static void main(String[]args){
        String prima,seconda,terza;
        double primo,secondo,terzo;
        prima=JOptionPane.showInputDialog(null,"Inserisci il primo numero");
        primo=Double.parseDouble(prima);
        seconda=JOptionPane.showInputDialog(null,"Inserisci il secondo numero");
        secondo=Double.parseDouble(seconda);
        terza=JOptionPane.showInputDialog(null,"Inserisci il terzo numero");
        terzo=Double.parseDouble(terza);
        double max=massimo(primo,secondo,terzo);
        double min=minimo(primo,secondo,terzo);
        JTextArea tabella=new JTextArea(10,10);
        tabella.setText("Primo numero="+primo+"\nSecondo numero="+secondo+"\nTerzo numero="+terzo+"\n\nIl massimo e' "+max+"\nIl minino e' "+min);
        JOptionPane.showMessageDialog(null,tabella,"Massimo e Minimo Applicazione",JOptionPane.INFORMATION_MESSAGE);
    }
    public static double massimo(double x,double y,double z) {
        return Math.max(x,Math.max(y,z));
    }
    public static double minimo(double x,double y,double z){
        return Math.min(x,Math.min(y,z));
    }
    
}
