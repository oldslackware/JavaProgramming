/*
 * ImmaginiPanel.java
 *
 * Created on November 27, 2007, 8:53 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ManipolazioneImmagini;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
/**
 *
 * @author frick
 */
public class ImmaginiPanel extends JPanel {
    private Image image;
    private Image sfondo;
    private Image image1,image2,image3;
    /** Creates a new instance of ImmaginiPanel */
    public ImmaginiPanel() {
        //mi prendo l'immagine
       try{
      
           image=ImageIO.read(new File("pesce.gif"));
            image1=ImageIO.read(new File("pesce1.gif"));
            image2=ImageIO.read(new File("turtle.gif"));
            image3=ImageIO.read(new File("turtle1.gif"));
                sfondo=ImageIO.read(new File("acqua.jpg"));
       }catch(IOException e){
           e.printStackTrace();
       }
    }
    
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        if(image==null || sfondo==null) return;
        int altezzaIm=image.getHeight(this);
        int larghezzaIm=image.getWidth(this);
        
        g.drawImage(sfondo,0,0,null);
        g.drawImage(image,0,0,null);
        g.drawImage(image1,300,150,null);
        g.drawImage(image2,800,500,null);
        g.drawImage(image3,300,200,null);
        
        
    }
    
}
