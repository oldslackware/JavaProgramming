/*
 * FibonacciRicorsivoApplet.java
 *
 * Created on October 24, 2007, 4:19 PM
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
public class FibonacciRicorsivoApplet extends JApplet implements ActionListener {
    JLabel numLabel,risLabel;
    JTextField numero,risultato;
    
    public void init(){
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        
        numLabel=new JLabel("Digita un intero e premi invio");
        c.add(numLabel);
        
        numero=new JTextField(5);
        numero.addActionListener(this);
        c.add(numero);
        
        
        risultato=new JTextField(15);
        risultato.setEditable(false);
        c.add(risultato);
    }
    
    public void actionPerformed(ActionEvent e) {
        double num,fibonacciValore;
        num=Double.parseDouble(numero.getText());
        showStatus("Sto Calcolando....");
        fibonacciValore=fibonacci(num);
        showStatus("Fatto!");
        risultato.setText(Double.toString(fibonacciValore));
    }
    
public double fibonacci(double x){
    if(x==0||x==1)
        return x;
    else
        return fibonacci(x-1)+fibonacci(x-2);
}

}
