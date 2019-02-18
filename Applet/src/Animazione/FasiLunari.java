/*
 * FasiLunari.java
 *
 * Created on 15 maggio 2007, 19.09
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/*<html>
  <head>
    <title></title>
  </head>
  <body>
  <applet code="FasiLunari.class" width="248" height="193">
          <param name="image0" value="1.jpg">
          <param name="image1" value="2.jpg">
          <param name="image2" value="3.jpg">
          <param name="image3" value="4.jpg">
          <param name="image4" value="5.jpg">
           <param name="image5" value="6.jpg">
           <param name="image6" value="7.jpg">
          <param name="image7" value="8.jpg">
           <param name="image8" value="9.jpg">
	  <param name="pausa" value="1000">
	  [AudioPlayer applet]
      </applet>
  </body>
</html>
*/
/**
 *
 * @author luciano
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.AudioClip;
public class FasiLunari extends JApplet implements Runnable {
   
    AudioClip musica;
    Image[]immagini=new Image[9];
    int numeroImmagini=0;
    int corrente;
    Thread runner;
    int pausa=1000;
    public void init(){
        musica=getAudioClip(getCodeBase(),"musica.au");
        
        musica.play();
       
        for(int i=0;i<9;i++){
    String myImage=null;
            myImage=getParameter("image"+i);
            if(myImage!=null){
                numeroImmagini++;
                immagini[i]=getImage(getCodeBase(),myImage);
            }else
                break;
        }
        String pausaMyImage=null;
        pausaMyImage=getParameter("pausa");
        if(pausaMyImage!=null){
            pausa=Integer.parseInt(pausaMyImage);
        }
    
    
    
}
    public void paint(Graphics screen){
    Graphics2D screen2D=(Graphics2D)screen;
    if(immagini[corrente]!=null){
        screen2D.drawImage(immagini[corrente],0,0,this);
    }
}
    
    public void start(){
        if(runner==null){
            runner=new Thread(this);
            runner.start();
        }
    }
    
    public void run(){
        Thread questoThread=Thread.currentThread();
        while(runner==questoThread){
            repaint();
            corrente++;
            if(corrente>=numeroImmagini)
                corrente=0;
        try{
            Thread.sleep(pausa);
        }catch(InterruptedException e){}
        
        
        }
    
    
    
    
    
    
    
}
    public void stop(){
        if(runner!=null){
            runner=null;
            musica.stop();
        }
        
        
        
        
    }
  
}
