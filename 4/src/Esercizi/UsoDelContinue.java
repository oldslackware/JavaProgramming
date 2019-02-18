/*
 * UsoDelContinue.java
 *
 * Created on October 15, 2007, 6:00 PM
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
public class UsoDelContinue {
    public static void main(String[]args){
        String s="";
        int cont;
        for(cont=1;cont<=10;cont++){
            if(cont==5)
                continue;
            
            s+=cont+"\n";
        }
        s+="\nL'uso dell'istruzione continue ignora il numero 5 facendo proseguire il ciclo";
        JOptionPane.showMessageDialog(null,s);
        System.exit(0);
    }
   
    
}
