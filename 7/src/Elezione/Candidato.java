/*
 * Candidato.java
 *
 * Created on November 18, 2007, 10:40 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Elezione;

/**
 *
 * @author frick
 */
public class Candidato implements Comparable{
    protected int id;
    protected int voti=0;
    
    public Candidato(int id,int voti) {
    this.id=id;
    this.voti=voti;
    }
    
    public boolean equals(Object x){
        if(!(x instanceof Candidato))return false;
        Candidato c=(Candidato)x;
        return c.id==this.id;
        
    }
    public int compareTo(Object x){
        Candidato c=(Candidato)x;
        if(this.voti>c.voti)return -1;
        if(this.voti<c.voti)return +1;
        return 0;
    }
    public String toString(){
        return "Candidato "+id+" ha ricevuto "+voti+" voti";
    }
    public int getId(){
        return id;
    }
    public int getVoti(){
        return voti;
    }
    
}
