/*
 * Impiegato.java
 *
 * Created on November 24, 2007, 5:04 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package UsoArrayList;

/**
 *
 * @author frick
 */
public class Impiegato {
private String nome;
private String cognome;
private double salario;
private double aumenta;
public Impiegato(String nome,String cognome,double salario){
    this.nome=nome;
    this.cognome=cognome;
    this.salario=salario;
}
public void aumento(double quanto){
    aumenta=salario*quanto/100;
    salario+=aumenta;
}
public String getNome(){
    return nome;
}
public String getCognome() {
    return cognome;
}
public double getSalario(){
    return  salario;
}
public String toString(){
    return nome+" "+cognome+" percepisce uno stipendio di "+salario+" euro";
}
public int hashCode(){
    return 7*nome.hashCode()+7*cognome.hashCode()+11*new Double(salario).hashCode();
}
public boolean equals(Object x){
    if(this==x)return true;
    if(x==null)return false;
    if(getClass()!=x.getClass())return false;
    Impiegato i=(Impiegato)x;
    return nome.equals(i.nome)&&cognome.equals(i.cognome)&&salario==i.salario;
}
    
    
    
    
    
    
    
    
    
}
