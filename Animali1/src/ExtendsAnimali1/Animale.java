/*
 * Animale.java
 *
 * Created on 10 maggio 2007, 17.26
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ExtendsAnimali1;

/**
 *
 * @author luciano
 */
public class Animale {
private String tipo;    

    public Animale(String tipo) {
        this.tipo=tipo;
    }
    
    public String toString(){
        return "Questo e' un "+tipo;
    }
    
}
