/*
 * Triangolo.java
 *
 * Created on April 30, 2007, 4:43 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package FigureGeometriche;

/**
 *
 * @author francesca
 */
public class Triangolo {
protected double lato1;
protected double lato2;
protected double lato3;
protected double base;
protected double altezza;
    /** Creates a new instance of Triangolo */
    public Triangolo(double lato1,double lato2,double lato3,double base,double altezza) {
        this.lato1=lato1;
        this.lato2=lato2;
        this.lato3=lato3;
        this.base=base;
        this.altezza=altezza;
    }
    public double perimetro(double lato1,double lato2,double lato3){
        return lato1+lato2+lato3;
    }
    public double area(double base,double altezza){
        return (base*altezza)/2;
    }
}
