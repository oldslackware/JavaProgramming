/*
 * Rettangolo.java
 *
 * Created on April 30, 2007, 4:37 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package FigureGeometriche;

/**
 *
 * @author francesca
 */
public class Rettangolo {
    protected double base;
    protected double altezza;
    /** Creates a new instance of Rettangolo */
    public Rettangolo(double base,double altezza) {
        this.base=base;
        this.altezza=altezza;
    }
    public double perimetro(double base,double altezza){
        return (2*base)+(2*altezza);
    }
    public double area(double base,double altezza){
        return (base*altezza);
    }
}