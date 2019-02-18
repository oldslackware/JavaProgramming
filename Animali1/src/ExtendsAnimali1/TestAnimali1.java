/*
 * TestAnimali1.java
 *
 * Created on 10 maggio 2007, 17.55
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ExtendsAnimali1;
import javax.swing.*;
/**
 *
 * @author luciano
 */
public class TestAnimali1 {
    public static void main(String[]args){
        String nome=JOptionPane.showInputDialog("Inserisci il nome del tuo cane");
        String razza=JOptionPane.showInputDialog("Inserisci la razza del tuo cane");
        Cane my=new Cane(nome,razza);
        JOptionPane.showMessageDialog(null,my,"Elenco",JOptionPane.CANCEL_OPTION);
    }
    
}
