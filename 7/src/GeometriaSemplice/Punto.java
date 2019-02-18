/*
 * Punto.java
 *
 * Created on November 17, 2007, 5:56 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package GeometriaSemplice;

/**
 *
 * @author frick
 */
public class Punto {
   public double x;
    public double y;
    /** Creates a new instance of Punto */
    public Punto(double x,double y) {
    this.x=x;
    this.y=y;
    }
    //Creazione per copia
    public Punto(Punto copia){
        x=copia.x;
        y=copia.y;
    }
    //Muoviamo il punto
    public void muovi(double nx,double ny)  {
    x+=nx;
    y+=ny;
}
    //Calcolo distanza
public double distanza(Punto copia){
    return Math.sqrt((x-copia.x)*(x-copia.x)+(y-copia.y)*(y-copia.y));
    
}
public double getY(){
    return y;
}
public double getX(){
    return x;
}
public String toString(){
    return Double.toString(x) + "," + y;
}



}