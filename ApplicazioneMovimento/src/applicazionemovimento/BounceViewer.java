/*
 * BounceViewer.java
 *
 * Created on 16 maggio 2007, 17.32
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */


/**
 *
 * @author luciano
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class BounceViewer extends javax.swing.JApplet implements ChangeListener {
    BouncePanel bouncer = new BouncePanel();
    JLabel delayLabel = new JLabel("Delay: ");;
    JSlider delay;
    
    public void init() {
        // set up slider
        delay = new JSlider(0, 200, 100);
        delay.setMajorTickSpacing(50);
        delay.setMinorTickSpacing(10);
        delay.setPaintTicks(true);
        delay.setPaintLabels(true);
        delay.addChangeListener(this);
        // choose a layout manager
        Container pane = getContentPane();
        BorderLayout border = new BorderLayout();
        pane.setLayout(border);
        // set up and add top panel 
        JPanel top = new JPanel();
        top.add(delayLabel);
        top.add(delay);
        pane.add(top, BorderLayout.NORTH);
        // add bottom panel
        pane.add(bouncer, BorderLayout.CENTER);
    }

    public void stateChanged(ChangeEvent evt) {
        JSlider source = (JSlider)evt.getSource();
        if (source.getValueIsAdjusting() != true) {
            bouncer.setDelay(delay.getValue());
        }
        bouncer.repaint();
    }
}
