/*
 * Barbone.java
 *
 * Created on November 21, 2007, 6:26 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Astrazione;

/**
 *
 * @author frick
 */
public class Barbone extends Persona {
    private String scatola;
    /** Creates a new instance of Barbone */
    public Barbone(String nome,String cognome,String scatola) {
    super(nome,cognome);
    this.scatola=scatola;
    }
    public String getScatola(){
        return scatola;
    }
    public String descrizione() {
        return " un barbone che abita in  una scatola di "+scatola;
    }
    public String saluto(){
    return "\nCiao fratello non e' che hai qualche spicciolo\n";
    }
}
