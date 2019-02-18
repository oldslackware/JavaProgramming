/*
 * PrenotazioneException.java
 *
 * Created on 11 maggio 2007, 20.33
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package BIglietteriaConMyException;

/**
 *
 * @author luciano
 */
public class PrenotazioneException extends Exception {
    
    
    public PrenotazioneException() {
    super("Problema con la Prenotazione");
    }
    public String toString(){
        return getMessage()+":posti esauriti";
    }
    
}
