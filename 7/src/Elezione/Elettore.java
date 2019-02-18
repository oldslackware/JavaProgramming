/*
 * Elettore.java
 *
 * Created on November 18, 2007, 11:17 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Elezione;

/**
 *
 * @author frick
 */
public class Elettore {
    private int[]preferenze;
    private int scelta=0;
    public Elettore(int[]preferenze) {
        this.preferenze=preferenze;
    }
    public int getPreferenza(){
        return preferenze[scelta];
    }
    public void prossimaPreferenza(){
        scelta++;
    }
    public String toString(){
        String s="";
        for(int i=0;i<preferenze.length;i++)
            s+=preferenze[i]+" ";
        return s;
    }
    
}
