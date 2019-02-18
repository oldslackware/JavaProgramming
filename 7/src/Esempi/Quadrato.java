/*
 * Quadrato.java
 *
 * Created on November 10, 2007, 5:55 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esempi;

/**
 *
 * @author frick
 */
public class Quadrato {
    private double lato;
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
