/*
 * SferaVolumeApplet.java
 *
 * Created on October 25, 2007, 4:30 PM
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
public class SferaVolumeApplet extends JApplet implements ActionListener {
    JLabel lab;
    JTextField input;
    
    public void init(){
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        
        //Grafica del label
        lab=new JLabel("Inserisci il raggio della sfera");
        
        //Grafica della casella testo
        input=new JTextField(5);
        input.addActionListener(this);
        c.add(lab);
        c.add(input);
    }
    public void actionPerformed(ActionEvent e){
        double raggio=Double.parseDouble(e.getActionCommand());
        showStatus("Il volume e'=" +volume(raggio));
    }
    public double volume(double x){
        double volume=(4.0/3.0)*Math.PI*Math.pow(x,3);
        return volume;
    }
    
    
}
