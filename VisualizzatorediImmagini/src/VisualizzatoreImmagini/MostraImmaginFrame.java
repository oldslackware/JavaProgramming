/*
 * MostraImmaginFrame.java
 *
 * Created on April 28, 2007, 4:57 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package VisualizzatoreImmagini;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author francesca
 */
public class MostraImmaginFrame extends JFrame {
    private JLabel label;
    private JFileChooser chooser;
    private static final int  DEFAULT_WIDTH=500;
    private static final int DEFAULT_HEIGHT=500;
    //private JMenuBar menuBar;
    /** Creates a new instance of MostraImmaginFrame */
    public MostraImmaginFrame() {
        setTitle("Visualizzatore di Immagini");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        //utilizza un etichetta per visualizzare le immagini
        label=new JLabel();
        add(label);
        //definisce la selezione del file
        chooser=new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        //definisce la barra dei menu'
        JMenuBar menuBar=new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu menu=new JMenu("File");
        menuBar.add(menu);
        
        JMenuItem openItem=new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                //mostra la finestra di dialogo che visualizza il file
                int result=chooser.showOpenDialog(null);
                //se si seleziona un file lo si imposta come etichetta
                if(result==JFileChooser.APPROVE_OPTION){
                    String name=chooser.getSelectedFile().getPath();
                    label.setIcon(new ImageIcon(name));
                    
                }
            }
        });
        
        JMenuItem exitItem=new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });
    }
}
