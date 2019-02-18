/*
 * Studente.java
 *
 * Created on November 21, 2007, 6:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Astrazione;

/**
 *
 * @author frick
 */
public class Studente extends Persona {
    private String facolta;
    /** Creates a new instance of Studente */
    public Studente(String nome,String cognome,String facolta) {
        super(nome,cognome);
        this.facolta=facolta;
    }
    public String descrizione(){
        return " uno studente iscritto in "+facolta;
    }
    public String saluto(){
        return "\nOggi non studio perche' domani copio\n";
    }
    public String getFacolta(){
        return facolta;
    }
    
    
}
