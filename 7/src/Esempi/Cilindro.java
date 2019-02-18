/*
 * Cilindro.java
 *
 * Created on November 10, 2007, 6:23 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esempi;

/**
 *
 * @author frick
 */
public class Cilindro {
    private static final double PI=3.14;
    private double raggio;
    private double altezza;
    /** Creates a new instance of Cilindro */
    public Cilindro(double raggio,double altezza) {
        this.raggio=raggio;
        this.altezza=altezza;
    }
    public double perimetro(double raggio){//la base di una circonferenza
        return PI*raggio;
    }
    public double area(double raggio,double altezza) {
        return 2*PI*raggio*altezza;
    }
}
