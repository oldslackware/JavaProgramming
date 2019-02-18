/*
 * DatiNonValidi.java
 *
 * Created on November 18, 2007, 11:44 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Elezione;

/**
 *
 * @author frick
 */
public class DatiNonValidi extends RuntimeException{
    
    /** Creates a new instance of DatiNonValidi */
    public DatiNonValidi() {
    }
    public DatiNonValidi( String msg ){ super(msg); }
    
}
