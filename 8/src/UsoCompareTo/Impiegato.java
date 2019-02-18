/*
 * Impiegato.java
 *
 * Created on November 25, 2007, 4:34 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package UsoCompareTo;

/**
 *
 * @author frick
 */
public class Impiegato implements Comparable<Impiegato> {
    private String cognome;
    private String nome;
    private double salario;
    private double aumento;
    
    public Impiegato(String cognome,String nome,double salario){
        this.cognome=cognome;
        this.nome=nome;
        this.salario=salario;
    }
    public String getCognome(){
        return cognome;
    }
    public String getNome(){
        return nome;
    }
    public double getSalario(){
        return salario;
    }
    
    public void aumenta(double quanto){
        aumento=salario*quanto/100;
        salario+=aumento;
    }
    public String toString(){
        return cognome+" "+nome+" percepisce un guadagno di "+salario+" euro";
    }
    
    public int hashCode(){
        return 7*nome.hashCode()+7*cognome.hashCode()+13*new Double(salario).hashCode();
    }
    
    public boolean equals(Object x){
        
       if(this==x)return true;
        if(getClass()!=x.getClass())return false;
        Impiegato i=(Impiegato)x;
        return nome.equals(i.nome)&&cognome.equals(i.cognome)&&salario==i.salario;
    }
    
     final public int compareTo(Impiegato x){
         
        if(salario<x.salario)return 1;
        if(salario>x.salario)return -1;
    return 0;
    }
    
    }
