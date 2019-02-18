/*
 * BubbleSortApplet.java
 *
 * Created on November 1, 2007, 6:02 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ESercizi;

/**
 *
 * @author frick
 */
import javax.swing.*;
import java.awt.Container;
public class BubbleSortApplet extends JApplet {
    JTextArea tabella;
    String s="";
    int numero;
    final int size=10;
    int elenco[]=new int[size];
    public void init(){
        tabella=new JTextArea();
    for(int i=0;i<elenco.length;i++){
        String elemento=JOptionPane.showInputDialog(null,"Inserisci un numero");
        int numero=Integer.parseInt(elemento);
        elenco[i]=numero;
    
  }
    s+="Il nostro array di partenza\n";
    stampa(elenco);
    s+="\nIl nostro array ordinato mediante bubble sort\n";
    bollebolle(elenco);
    tabella.setText(s);
    tabella.setEditable(false);
    Container c=getContentPane();
    c.add(tabella);
    
}
    public void stampa(int a[]){
        for(int i=0;i<a.length;i++)
            s+=" "+ a[i];
    }
    public void bollebolle(int a[]){
        for(int i=1;i<a.length;i++)
            for(int j=0;j<a.length-1;j++)
                if(a[j]>a[j+1])
                    scambia(a,j,j+1);
                    stampa(a);
    }
    
    public void  scambia(int[]a,int primo,int secondo){
        int tmp;
        tmp=a[primo];
        a[primo]=a[secondo];
        a[secondo]=tmp;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}