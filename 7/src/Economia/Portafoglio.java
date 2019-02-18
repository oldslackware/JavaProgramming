/*
 * Portafoglio.java
 *
 * Created on November 20, 2007, 4:55 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Economia;

/**
 *
 * @author frick
 */
public class Portafoglio {
    private int centesimi;
    private int euro;
    public Portafoglio(int centesimi,int euro) {
        this.centesimi=centesimi;
        this.euro=euro;
    }
    public void inserisci(int c,int e){
        centesimi+=c;
        if(centesimi>99){
            centesimi-=100;
        euro++;
        }
        euro+=e;
    }
    public void rimuovi(int c,int e){
        centesimi-=c;
        if(centesimi<0){
            centesimi+=100;
        euro--;
        }
        euro-=e;
    }
    public int getCentesimi(){
        return centesimi;
    }
    public int getEuri(){
        return euro;
    }
    public String toString(){
        return "Hai a disposizione "+euro+" euro e "+centesimi+" centesimi";
    }
    
}
