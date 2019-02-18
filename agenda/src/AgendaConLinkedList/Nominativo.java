/*
 * Nominativo.java
 *
 * Created on 7 maggio 2007, 16.47
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package AgendaConLinkedList;
import java.io.*;
import java.util.*;
/**
 *
 * @author luciano
 */
public class Nominativo implements Comparable,Serializable {
    
    /** Creates a new instance of Nominativo */
    private String nome;
    private String cognome;
    private String prefisso;
    private String telefono;
    public Nominativo(String cognome,String nome,String prefisso,String telefono){
        this.nome=nome;
        this.cognome=cognome;
        this.prefisso=prefisso;
        this.telefono=telefono;
    }
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public String getPrefisso(){
        return prefisso;
    }
    public String getTelefono(){
        return telefono;
    } 
    public boolean equals(Object x){
        if(!(x instanceof Nominativo))
            return false;
        Nominativo n=(Nominativo)x;
        return this.cognome.equals(n.cognome)&&this.nome.equals(n.nome);
    }
    public int compareTo(Object x){
        Nominativo n=(Nominativo)x;
        if(this.cognome.compareTo(n.cognome)<0)return -1;
            if(this.cognome.equals(n.cognome)&&this.nome.compareTo(n.nome)<0)return -1;
        if(this.equals(n))return 0;
        else return 1;
    }
    public String toString(){
        return cognome+" "+nome+" "+prefisso+"-"+telefono;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
