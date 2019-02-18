/*
 * Impiegato.java
 *
 * Created on November 19, 2007, 1:30 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Impiegato;

/**
 *
 * @author frick
 */
import java.util.*;
public class Impiegato {
    private String nome;
    private String cognome;
    private double salario;
    private Date nascita;
    
    public Impiegato(String nome,String cognome,double salario,int anno,int mese,int giorno) {
    this.nome=nome;
    this.cognome=cognome;
    this.salario=salario;
    GregorianCalendar calendario=new GregorianCalendar(anno,mese-1,giorno);
    nascita=calendario.getTime();
    }
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public double getSalario(){
        return salario;
    }
    public Date getNascita(){
        return (Date)nascita.clone();//Poiche' nascita e' un oggetto Data'
    }
    public void aumentaSalario(double percentuale){
        double aumento=salario*percentuale/100;
        salario+=aumento;
    }
    public void diminuisciSalario(double percentuale){
        double diminuzione=salario*percentuale/100;
        salario-=diminuzione;
    }
    
    
    
    
    
    
}
