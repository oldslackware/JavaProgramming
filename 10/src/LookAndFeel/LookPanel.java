/*
 * LookPanel.java
 *
 * Created on November 27, 2007, 5:08 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package LookAndFeel;

/**
 *
 * @author frick
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LookPanel extends JPanel{
    
    /** Creates a new instance of LookPanel */
    public LookPanel() {
        UIManager.LookAndFeelInfo[]info=UIManager.getInstalledLookAndFeels();//Mi restituisce il look and feel installate
        for(UIManager.LookAndFeelInfo i : info)
            creaBottone(i.getName(),i.getClassName());//nome del look and feel e classe che implemente il look and feel
    }
    
    void creaBottone(String nome,final String lookNome){//nome e' il nome del pulsante,lookNome e' il nome della classe LOOKANDFEEL'
        
        //aggiungo il pulsante al pannello
        JButton bottone=new JButton(nome);
        add(bottone);
        
        //Azione del pulsante
        
        bottone.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                //Una volta premuto il pulsante modifico il look and feel del panel:)
                try{
                    UIManager.setLookAndFeel(lookNome);//imposta il look and feel corrente
                    SwingUtilities.updateComponentTreeUI(LookPanel.this);
                    
                }catch(Exception e){
                    
                e.printStackTrace();
                }
            }
        }
        );
    }
    
}
