/*
 * Rettangolo.java
 *
 * Created on November 10, 2007, 6:09 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esempi;

/**
 *
 * @author frick
 */
public class Rettangolo {
    private double base;
    private double altezza;
    
    
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
