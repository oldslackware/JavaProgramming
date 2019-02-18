/*
 * Bounce.java
 *
 * Created on 16 maggio 2007, 16.01
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

public class Bounce extends JFrame {
    public Bounce() {
        super("Tennis");
        setSize(550, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BouncePanel boing = new BouncePanel();
        Container pane = getContentPane();
        pane.add(boing);
        setContentPane(pane);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        Bounce frame = new Bounce();
    }
}


