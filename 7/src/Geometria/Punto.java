/*
 * Punto.java
 *
 * Created on November 11, 2007, 8:46 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Geometria;

/**
 *
 * @author frick
 */
public class Punto {
  private double x;
  private double y;
    public Punto() {
    }
    public Punto(double x,double y){
        this.x=x;
        this.y=y;
    }

   
    public Punto(Punto p){//Costruttore per copia
        x=p.x;
        y=p.y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void sposta(double newX,double newY){
        x=newX;
        y=newY;
    }
    public double distanza(Punto p){
        return Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));
    }
    public String toString(){
        return "("+x+","+y+")";
 
    }
    public boolean equals(Object p){
        if(!(p instanceof Punto))
            return false;
        Punto pp=(Punto)p;
        return x==pp.x && y==pp.y;
    }
    
}
