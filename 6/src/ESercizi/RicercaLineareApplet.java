/*
 * RicercaLineareApplet.java
 *
 * Created on November 1, 2007, 11:45 PM
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
import java.awt.*;
import java.awt.event.*;
public class RicercaLineareApplet extends JApplet implements ActionListener {
JLabel cercaL,risultatoL;
JTextField cerca,risultato;
int numeri[];

public void init(){
    Container c=getContentPane();
    c.setLayout(new FlowLayout());
    cercaL=new JLabel("Inserisci il numero che vuoi cercare..");
    c.add(cercaL);
    
    cerca=new JTextField(10);
    cerca.addActionListener(this);
    c.add(cerca);
    
    risultato=new JTextField(20);
    risultato.setEditable(false);
    c.add(risultato);
    
    //metto i numeri a caso fino a 1000 su un array di 1001 elementi(da 0 a 1000)
    numeri=new int[1001];
    for(int i=0;i<numeri.length;i++)
        numeri[i]=1+(int)(Math.random()*1000);
}
    
    public int ricercaLineare(int []a,int x){//passiamo l'array  e il valore cercato'
        for(int i=0;i<numeri.length;i++)
            if(a[i]==x)
                return i;
        
        return -1;
    }
    
    
    public void actionPerformed(ActionEvent e){
        String cercami=e.getActionCommand();
        int elemento=ricercaLineare(numeri,Integer.parseInt(cercami));
        if(elemento!=-1)
            risultato.setText("Numero trovato in posizione "+ elemento);
        else
            risultato.setText("Numero non trovato");
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
