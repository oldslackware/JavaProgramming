/*
 * WelcomeApplet.java
 *
 * Created on April 28, 2007, 7:09 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package MyApplet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.lang.*;
        
/**
 *
 * @author francesca
 */
public class WelcomeApplet extends JApplet {
    
    public void init() {
        setLayout(new BorderLayout());
        JLabel label=new JLabel(getParameter("testo"), SwingConstants.CENTER);
        label.setFont(new Font("Serif",Font.BOLD,22));
        add(label,BorderLayout.CENTER);
        
        JPanel panel=new JPanel();
        JButton rigthButton=new JButton("ItalyOpenSource");
        rigthButton.addActionListener(makeURLActionListener("http://www.italyopensource.com"));
        panel.add(rigthButton);
        
        JButton leftButton=new JButton("Manda mail");
        leftButton.addActionListener(makeURLActionListener("mailto:lupino1@gmail.com"));
        panel.add(leftButton);
        
        add(panel,BorderLayout.SOUTH);
    }
    private ActionListener makeURLActionListener(final String u){
        return new ActionListener(){
            public void actionPerformed(ActionEvent event){
                try{
                    getAppletContext().showDocument(new URL(u));
                }catch(MalformedURLException e)
                {e.printStackTrace();
                    
                
            }
        }
    };
    
    // TODO overwrite start(), stop() and destroy() methods
}
}
