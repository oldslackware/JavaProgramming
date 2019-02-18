/*
 * Triangolo.java
 *
 * Created on November 10, 2007, 6:13 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esempi;

/**
 *
 * @author frick
 */
public class Triangolo {
    private double lato1;
    private double lato2;
    private double lato3;
    /** Creates a new instance of Triangolo */
    public Triangolo(double lato1,double lato2,double lato3) {
        this.lato1=lato1;
        this.lato2=lato2;
        this.lato3=lato3;
    }
    public double perimetro(double lato1,double lato2,double lato3){
        return lato1+lato2+lato3;
    }
    public double area(double base,double altezza){
        return (base*altezza)/2;
    }
    
}
