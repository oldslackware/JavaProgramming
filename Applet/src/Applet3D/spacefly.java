
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.applet.*;

public class spacefly extends Applet implements Runnable {
  
  Thread t;  //main thread
  
  Graphics grBuffer;  //main graphics object
  
  int height,width;  //height and width of applet
  
  int spd,stars;
  
  int strX [];
  int strY [];
  int plus [];
  Image imgBuffer;
 

  
static int randomNumber (int low, int high) {
   		// returns a random number between low and high, inclusive
   		return (int)(java.lang.Math.random() * (high - low + 1) + low);
	} // randomNumber
	
 
public void init () {
// get parameters
String numStars,speed;
numStars = getParameter("numStars");
if (numStars == null) stars=10;
else stars = Integer.parseInt(numStars);   
if (stars>1000) stars=1000;

speed = getParameter ("speed");
if (speed == null) spd=5;
else spd = Integer.parseInt (speed);
if (spd>10) spd=10;
if (spd<0) spd=0;
if (stars<1) stars=1;



height = size ().height;      //get height and width
width = size().width;

imgBuffer = createImage (width, height); //make buffer image
grBuffer = imgBuffer.getGraphics ();    //associate buffer with buffer image

strX=new int [stars+10];
strY=new int [stars+10];
plus = new int [stars+10];

for (int p=0;p<=stars;p++) {
strX[p] = randomNumber (0,width);
strY[p] = randomNumber (0,height);
int strXPlus,strYPlus;
if (strX[p]<=(int) (width/2)) strXPlus = ((int) (width/2) - strX[p]) / ((int) (width/2)/10);
else
                              strXPlus = (strX[p] - (int) (width/2)) / ((int) (width/2)/10);
if (strY[p]<=(int) (height/2)) strYPlus = ((int) (height/2) - strY[p]) / ((int) (width/2)/10);
else
                              strYPlus = (strY[p] - (int) (height/2)) / ((int) (width/2)/10);
							  
plus[p] = ((int) (strYPlus+strXPlus/2));
plus[p] = ((int) (plus[p] / 3)+1);
}



}


 


public void paint (Graphics g) {
grBuffer.setColor (Color.black);
grBuffer.fillRect (0,0,width,height);
grBuffer.setColor (Color.white);
for (int p=0;p<=stars;p++) {
//System.out.println (" " + strXPlus[p]+ "    " + strYPlus[p]);
grBuffer.fillRect (strX[p],strY[p],plus[p],plus[p]);
}
g.drawImage (imgBuffer, 0, 0, this);
}


 public void run() {
       while (t != null) {
         try { t.sleep(spd*10); }   
         catch (InterruptedException ie)  { return; }
for (int p=0;p<=stars;p++) {
if (strX[p] < (int) (width/2)) strX[p]-=plus[p];
if (strX[p] > (int) (width/2)) strX[p]+=plus[p];
if (strY[p] > (int) (height/2)) strY[p]+=plus[p];
if (strY[p] < (int) (height/2)) strY[p]-=plus[p];

int strXPlus,strYPlus;
if (strX[p]<=(int) (width/2)) strXPlus = ((int) (width/2) - strX[p]) / ((int) (width/2)/10);
else
                              strXPlus = (strX[p] - (int) (width/2)) / ((int) (width/2)/10);
if (strY[p]<=(int) (height/2)) strYPlus = ((int) (height/2) - strY[p]) / ((int) (width/2)/10);
else
                              strYPlus = (strY[p] - (int) (height/2)) / ((int) (width/2)/10);
							  
plus[p] = ((int) (strYPlus+strXPlus/2));
plus[p] = ((int) (plus[p] / 3)+1);



if (strX[p]<0 || strX[p]>width || strY[p]<0 || strY[p]>height) {

for (int t=p;t<=stars;t++) {
strX[t]=strX[t+1];
strY[t]=strY[t+1];
}// for t

strX[stars] = randomNumber(0,width);
strY[stars] = randomNumber(0,height);
}// if

}// for p

repaint ();
} //while
} //run


public void start() {


        if (t==null) {      
           t = new Thread(this); 
        }
   
           t.start();
}

public void stop() {
           t = null;
		
}
public void update (Graphics g) {
	
        paint (g);
    }

} //class spacefly