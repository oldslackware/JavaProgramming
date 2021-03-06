/*
 * BouncePanel.java
 *
 * Created on 16 maggio 2007, 16.03
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
import java.util.*;

public class BouncePanel extends JPanel implements Runnable {
    Image ball, court;
    float current = 0F;
    Thread runner;
    int xPosition = 10;
    int xMove = 1;
    int yPosition = -1;
    int ballHeight = 185;
    int ballWidth = 190;
    int height;
int delay = 100;
    public BouncePanel() {
        super();
        Toolkit kit = Toolkit.getDefaultToolkit();
        ball = kit.getImage("tennis.gif");
        court = kit.getImage("court.jpg");
        runner = new Thread(this);
        runner.start();
    }

    public void paintComponent(Graphics comp) {
        Graphics2D comp2D = (Graphics2D) comp;
        height = getSize().height - ballHeight;
        if (yPosition == -1)
            yPosition = height - 20;
        if ((court != null) && (ball != null)) {
            comp2D.drawImage(court, 0, 0, this);
            comp2D.drawImage(ball,
               (int) xPosition,
               (int) yPosition,
               this);
        }
    }

    public void run() {
        Thread thisThread = Thread.currentThread();
        while (runner == thisThread) {
            current += (float) 0.8;
            if (current > 3)
                current = (float) 0;
            xPosition += xMove;
            if (xPosition > (getSize().width - ballWidth))
                xMove *= -1;
            if (xPosition < 1)
                xMove *= -1;
            double bounce = Math.sin(current) * height;
            yPosition = (int) (height - bounce);
            repaint();
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) { }
        }
    }
    public void setDelay(int newDelay) {
        delay = newDelay;
    }
}

