/*
 * Studente.java
 *
 * Created on May 1, 2007, 8:18 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Folla;

/**
 *
 * @author francesca
 */
public class Studente extends Persona {
    private String TipoStudio;
    /** Creates a new instance of Studente */
    public Studente(String nome,String cognome,int eta,String titoloStudio,String TipoStudio) {
        super(nome,cognome,eta,titoloStudio);
        this.TipoStudio=TipoStudio;
    }
    public String getDescrizione() { 
        return "E' uno studente che studia "+TipoStudio;
    }
}
