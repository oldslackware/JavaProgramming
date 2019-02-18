/*
 * Persona.java
 *
 * Created on November 21, 2007, 6:10 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Astrazione;

/**
 *
 * @author frick
 */
abstract class Persona {
    private String nome;
    private String cognome;

    public Persona(String nome,String cognome) {
        this.nome=nome;
        this.cognome=cognome;
    }
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public abstract String descrizione();//ogni persona si descrive
    public abstract String saluto();
    
}
