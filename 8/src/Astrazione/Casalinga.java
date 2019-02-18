/*
 * Casalinga.java
 *
 * Created on November 21, 2007, 6:23 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Astrazione;

/**
 *
 * @author frick
 */
public class Casalinga extends Persona {
    private int numeroFigli;
    /** Creates a new instance of Casalinga */
    public Casalinga(String nome,String cognome,int numeroFigli) {
        super(nome,cognome);
        this.numeroFigli=numeroFigli;
    }
    public int getNumeroFigli() {
        return numeroFigli;
    }
    public String descrizione(){
        return " una casalinga con "+numeroFigli+" figlio/i a carico";
    }
    public String saluto(){
    return "\nDevo ancora finire di lavare i piatti\n";
}
}
