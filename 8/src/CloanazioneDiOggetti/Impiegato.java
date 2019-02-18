/*
 * Impiegato.java
 *
 * Created on November 25, 2007, 6:26 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package CloanazioneDiOggetti;
import java.util.*;
/**
 *
 * @author frick
 */
public class Impiegato implements Cloneable{
    private String cognome;
    private String nome;
    private double salario;
    private double aumento;
    protected String saluto;
    public Impiegato(String cognome,String nome,double salario){
        this.cognome=cognome;
        this.nome=nome;
        this.salario=salario;
    }
    public Impiegato clone() throws CloneNotSupportedException{
        Impiegato copia=(Impiegato)super.clone();
        //copia.saluto=(String)saluto.clone();
        return copia;
    }
    public String getCognome(){
        return cognome;
    }
    public void saluto(String s){
        saluto=s;
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
        return cognome+" "+nome+" percepisce un guadagno di "+salario+" euro\n"+saluto;
    }
    
    public int hashCode(){
        return 7*nome.hashCode()+7*cognome.hashCode()+13*new Double(salario).hashCode();
    }
    

    
    }

