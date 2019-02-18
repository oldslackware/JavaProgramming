/*
 * ButtonPanel.java
 *
 * Created on November 27, 2007, 11:49 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package BottoniEventi;

/**
 *
 * @author frick
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;

public class ButtonPanel extends JPanel {
   
    /** Creates a new instance of ButtonPanel */
    public ButtonPanel() {
  
        
        
    //mi creo alcuni pulsanti
        JButton neroB=new JButton("Nero",new ImageIcon("nero.jpg"));
        JButton rosaB=new JButton("Rosa",new ImageIcon("rosa.gif"));
        JButton verdeB=new JButton("Verde",new ImageIcon("verde.gif"));
        JButton gialloB=new JButton("Giallo",new ImageIcon("giallo.jpg"));
        //aggiungo i quattro pulsannti al panel
        add(neroB);
        add(rosaB);
        add(verdeB);
        add(gialloB);
        
        //Azioni dei pulsanti
        
        ColorAction neroA=new ColorAction(Color.BLACK);
        ColorAction rosaA=new ColorAction(Color.PINK);
        ColorAction verdeA=new ColorAction(Color.GREEN);
        ColorAction gialloA=new ColorAction(Color.YELLOW);
        
        //assoccio le azioni ai pulsanti
        neroB.addActionListener(neroA);
        rosaB.addActionListener(rosaA);
        verdeB.addActionListener(verdeA);
        gialloB.addActionListener(gialloA);
    }
        //Ora mi creo la inner class per assocciare i listener di azioni che impostano il coolore di sfondo
        
        private class ColorAction implements ActionListener{
            private Color backGround;//colore di sfondo
            public ColorAction(Color c){
                backGround=c;
            }
            public void actionPerformed(ActionEvent event){
                setBackground(backGround);
            }
        }
   }
    

