/*
 * Biglietteria.java
 *
 * Created on 11 maggio 2007, 20.38
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package BIglietteriaConMyException;

/**
 *
 * @author luciano
 */
public class Biglietteria {
    private int postiDisponibili;
    public Biglietteria() {
    postiDisponibili=100;
    }
    public void prenota()throws PrenotazioneException{
        if(postiDisponibili==0){
            throw new PrenotazioneException();
        }
        // se non viene generata l'eccezione'
        postiDisponibili--;
    }
    
}
