/*
 * Persona.java
 *
 * Created on May 1, 2007, 7:57 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Folla;

/**
 *
 * @author francesca
 */
abstract class Persona {
 private String nome;
 private String cognome;
 private int eta;
 private String titoloStudio;
    public Persona(String nome,String cognome,int eta,String titoloStudio) {
        this.nome=nome;
        this.eta=eta;
        this.titoloStudio=titoloStudio;
        this.cognome=cognome;
    }
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public int getEta(){
        return eta;
    }
    public String getTitoloStudio(){
        return titoloStudio;
    }
    public abstract String getDescrizione();
    
}
