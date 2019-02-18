/*
 * SimpleAnimationApplet.java
 *
 * Created on 17 maggio 2007, 12.36
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

public class SimpleAnimationApplet extends JApplet implements Runnable {

  Thread fThread;
  Color [] fColorSet = {Color.RED, Color.BLUE, Color.GREEN};
  Color [] fColors   = new Color[3];
  int fColorIndex = 0;
  Font f;
  Image background;
  /** Metodo start comandato da un thread **/
  public void start () {


    fThread = new Thread (this);

    // Start the thread
    fThread.start ();
  } // start

  /** Uso applet il metodo stop  per fermare thread loop. **/
  public void stop () {
    if (fThread != null) {
        fThread = null;
    }
  } // stop

  /** Sovrascrivo il metodo  Runnable run(). **/
  public void run() {
    while (fThread != null) {
        // Rotazione colori
      for (int i=0; i < 3; i++) {
           int index = fColorIndex%3;
           fColors[i] = fColorSet[index];
           fColorIndex++;
      }
      // Cambio colori
      fColorIndex += 2;
      repaint();
      // Pausa
      try {
           Thread.sleep(1000);
      }
      catch (InterruptedException e) {}
     }
  } // run

  /** Disegno il  testo. **/
  public void paint(java.awt.Graphics g) {
     background=getImage(getCodeBase(),"image.jpg");
    g.drawImage(background,0,0,this);
     g.setColor(fColors[0]);
     f=new Font("Helvetica",Font.ITALIC,24);
     g.setFont(f);
    g.drawString("Super", 20, 80);

    g.setColor(fColors[1]);
     f=new Font("Helvetica",Font.ITALIC,24);
     g.setFont(f);
    g.drawString("Sardo", 160, 80);

    g.setColor(fColors[2]);
     f=new Font("Helvetica",Font.ITALIC,24);
     g.setFont(f);
    g.drawString("Sayan", 300, 80);

  } // paint

} // class SimpleAnimationApplet


