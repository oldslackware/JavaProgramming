/*
 * MultipliApplet.java
 *
 * Created on October 29, 2007, 12:02 PM
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
public class MultipliApplet extends JApplet implements ActionListener{
    JLabel num1,num2,risultato;
    JTextField primo,secondo,esito;
    
    public void init(){
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        num1=new JLabel("Inserisci il primo numero");
        c.add(num1);
        primo=new JTextField(10);
        c.add(primo);
        num2=new JLabel("Inserisci il secondo numero");
        c.add(num2);
        secondo=new JTextField(10);
        secondo.addActionListener(this);
        c.add(secondo);
        risultato=new JLabel("Il secondo numero e' multiplo del primo?");
        c.add(risultato);
        esito=new JTextField(10);
        esito.setEditable(false);
        c.add(esito);
    }
    public void actionPerformed(ActionEvent e){
        boolean multiplo;
        double x,y;
        x=Double.parseDouble(primo.getText());
        y=Double.parseDouble(secondo.getText());
        multiplo=multiplo(x,y);
        if(multiplo==true)
        esito.setText("Vero");
        else
            esito.setText("Assolutamente No");
    }
    
    public boolean multiplo(double primo,double secondo){
        if(primo%secondo==0){
            return true;
        }
        return false;
    }
    
}
