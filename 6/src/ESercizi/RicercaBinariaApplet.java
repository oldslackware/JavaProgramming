/*
 * RicercaBinariaApplet.java
 *
 * Created on November 2, 2007, 5:33 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */



/**
 *
 * @author frick
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
public class RicercaBinariaApplet extends JApplet implements ActionListener {
    JLabel cercaL,risultatoL;
    JTextField cerca,risultato;
    JTextArea tabella;
    int numeri[];
    String s=" ";
  

public void init(){
    Container c=getContentPane();
    c.setLayout(new FlowLayout());
    
    cercaL=new JLabel("Inserisci un valore");
    c.add(cercaL);
    
    cerca=new JTextField(6);
    cerca.addActionListener(this);
    c.add(cerca);
    
    risultatoL=new JLabel("Risultato");
    c.add(risultatoL);
    
    risultato=new JTextField(18);
    risultato.setEditable(false);
    c.add(risultato);

    tabella=new JTextArea(6,60);
    tabella.setFont(new Font( "<<Courier>>", Font.PLAIN, 12));
    tabella.setEditable(false);
    c.add(tabella);
    
    
    numeri=new int[50];
    for(int i=0;i<numeri.length;i++)
        numeri[i]=i*2;

}

public int ricercaBinaria(int[]a,int x){
    int inf=0;
    int sup=a.length-1;
    int mezzo;
    while(inf<=sup){
        mezzo=(inf+sup)/2;
        disegnaParte(inf,mezzo,sup);//chiamata al metodo
        
        if(x==a[mezzo])
            return mezzo;
        else if(x<a[mezzo])
            sup=mezzo-1;
        else
            inf=mezzo+1;
    }
    return -1;
 }






public void actionPerformed(ActionEvent e){
    String cercami=e.getActionCommand();
    s+="Ecco per ogni riga dove cerco l'elemento\n";
    int elemento=ricercaBinaria(numeri,Integer.parseInt(cercami));
    tabella.setText(s);
    if(elemento!=-1)
        risultato.setText("Valore trovato in posizione " + elemento);
    else
        risultato.setText("Valore non trovato");
}
  

void disegnaParte(int inf,int mezzo,int sup){
    DecimalFormat df=new DecimalFormat( "00" );
    for(int i=0;i<numeri.length;i++){
        if(i<inf || i>sup)
            s+="  ";
        else if(i==mezzo)
            s+=df.format(numeri[i]) + "* ";
        else
            s+=df.format(numeri[i]) + " ";
    }
    s+="\n";
}


}
