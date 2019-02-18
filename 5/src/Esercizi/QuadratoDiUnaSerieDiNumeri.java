/*
 * QuadratoDiUnaSerieDiNumeri.java
 *
 * Created on October 20, 2007, 6:51 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */



/**
 *
 * @author frick
 */
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.JApplet;
import java.awt.Container;
public class QuadratoDiUnaSerieDiNumeri extends JApplet {
        String max=JOptionPane.showInputDialog(null,"Inserisci fino a che numero intendi visualizzare il quadrato");
        double n=Double.parseDouble(max);
        double risultato;
        public void init(){
            String output= "";
        JTextArea tabella=new JTextArea(300,600);
        JScrollPane scroll=new JScrollPane(tabella);
        Container c=getContentPane();
        c.add(scroll);
        for(int i=1;i<=n;i++){
            risultato=quadrato(i);
            output+="Il quadrato di "+i+" e' "+risultato+"\n";
        }
      tabella.setText(output);
        }
        public double quadrato(double x){
            return x*x;
        }
        
        
    }
    

