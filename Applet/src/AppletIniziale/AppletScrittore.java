/*
 * AppletScrittore.java
 *
 * Created on 12 maggio 2007, 0.38
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */



/**
 *
 * @author luciano
 */
/*
 *<html>
  <head>
    <title>Il mio primo applet...</title>
  </head>
  <body>
      <applet code="AppletScrittore.class"width="233"height="148">
              </applet>
  </body>
</html>
*/

import javax.swing.*;
import java.awt.Graphics;
public class AppletScrittore extends JApplet{ 
	public void paint(Graphics g){
        g.drawString("Would you like this Applet?",25,75);
    }
    
}
