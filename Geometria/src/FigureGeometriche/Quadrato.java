/*
 * Quadrato.java
 *
 * Created on April 30, 2007, 4:33 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package FigureGeometriche;

/**
 *
 * @author francesca
 */
public class Quadrato {
protected double lato;    
    /** Creates a new instance of Quadrato */
    public Quadrato(double lato) {
        this.lato=lato;
    }
    public double perimetro(double lato){
        return lato*4;
    }
    public double area(double lato){
        return lato*lato;
    }
}
