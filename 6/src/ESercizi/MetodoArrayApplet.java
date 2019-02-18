/*
 * MetodoArrayApplet.java
 *
 * Created on November 1, 2007, 4:39 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ESercizi;

/**
 *
 * @author frick
 */
import java.awt.Container;
import javax.swing.*;
public class MetodoArrayApplet extends JApplet{
    JTextArea tabella;
    String s="";
    int numero;
    final int size=6;
    int []elenco=new int[size];
    int x=2;
    
    public void init(){
        tabella=new JTextArea();
      
        for(int i=0;i<elenco.length;i++){
        String elemento=JOptionPane.showInputDialog(null,"Inserisci un numero");
        numero=Integer.parseInt(elemento);
        elenco[i]=numero;
        }
         s+="Gli elementi originali del nostro array sono:\n";
        stampaElementi(elenco);
        s+="\nArray in ordine inverso\n";
        stampaInversa(elenco);
        s+="\nDoppio di ciascun elemento\n";
        doppio(elenco,x);
       tabella.setText(s);
       tabella.setEditable(false);
       Container c=getContentPane();
       c.add(tabella);
      
        
    }
        public void stampaElementi(int []a){
            for(int i=0;i<a.length;i++)
                s+=" "+ a[i];
        }
        public void stampaInversa(int []a){
            for(int i=a.length-1;i>=0;i--) 
            s+=" "+ a[i];
        }
        public void doppio(int[]a,int y){
            for(int i=0;i<a.length;i++)       {
            a[i]=y*a[i];
            s+=" "+a[i];
        }
        }

}
