/*
 * Cerchio.java
 *
 * Created on April 30, 2007, 4:50 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package FigureGeometriche;

/**
 *
 * @author francesca
 */
public class Cerchio {
static final double PI=3.14;
protected double raggio;
    /** Creates a new instance of Cerchio */
    public Cerchio(double raggio) {
    this.raggio=raggio;
    }
    
    public double perimetro(double raggio){
        return 2*PI*raggio;
    }
    public double area(double raggio){
        return PI*raggio*raggio;
    }
}
