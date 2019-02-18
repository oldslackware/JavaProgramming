/*
 * Cilindro.java
 *
 * Created on May 1, 2007, 3:22 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package FigureGeometriche;

/**
 *
 * @author francesca
 */
public class Cilindro {
    static final double PI=3.14;
    protected double raggio;
    protected double altezza;
    public Cilindro(double raggio,double altezza) {
        this.raggio=raggio;
        this.altezza=altezza;
    }
    public double basiCilindro(double raggio){
        return 2*PI*raggio;
    }
    public double area(double raggio,double altezza){
        return 2*PI*raggio*altezza;
    }
}
