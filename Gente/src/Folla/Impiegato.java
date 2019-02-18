/*
 * Impiegato.java
 *
 * Created on May 1, 2007, 8:07 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Folla;
import java.util.*;
/**
 *
 * @author francesca
 */
public class Impiegato extends Persona {
 private double salario;
 private Date giornoAssunzione;
    /** Creates a new instance of Impiegato */
    public Impiegato(String nome,String cognome,int eta,String titoloStudio,double salario,int anno,int mese,int giorno) {
    super(nome,cognome,eta,titoloStudio);
    this.salario=salario;
    GregorianCalendar calendario=new GregorianCalendar(anno,mese,giorno);
    giornoAssunzione=calendario.getTime();
    }
    
    public double getSalario(){
        return salario;
        
    }
    public Date getGiornoAssunzione(){
        return giornoAssunzione;
    }
    public String getDescrizione(){
        return String.format("E' un impiegato con un salario di $%.2f ",salario);
    }
    public void aumentaSalario(double percentuale){
        double aumento=salario+percentuale/100;
        salario+=aumento;
        }
    
    
    
    
}
