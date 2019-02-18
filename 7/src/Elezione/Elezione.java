/*
 * Elezione.java
 *
 * Created on November 18, 2007, 11:22 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Elezione;

/**
 *
 * @author frick
 */
import java.io.*;
public abstract class Elezione {
    public abstract int faiScrutinio(String nomeFile)throws IOException;
    public abstract String toString();
    
    
}
