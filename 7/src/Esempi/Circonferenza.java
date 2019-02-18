/*
 * Circonferenza.java
 *
 * Created on November 10, 2007, 6:19 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esempi;

/**
 *
 * @author frick
 */
public class Circonferenza {
private static final double PI=3.14;
private double raggio;
    /** Creates a new instance of Circonferenza */
    public Circonferenza(double raggio) {
        this.raggio=raggio;
    }
    public double perimetro(double raggio){
        return 2*PI*raggio;
        
    }
    public double area(double raggio)    {
        return PI*raggio*raggio;
    }
    
}
