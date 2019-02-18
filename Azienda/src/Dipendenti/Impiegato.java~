/*
 * Impiegato.java
 *
 * Created on May 1, 2007, 3:53 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Dipendenti;
import java.util.*;
/**
 *
 * @author francesca
 */
public class Impiegato {
    protected String nome;
    protected double salario;
    protected double newsalario;
    protected Date assunzioneGiorno;
    /** Creates a new instance of Impiegato */
    public Impiegato(String nome,double salario,int anno,int mese,int giorno) {
        this.nome=nome;
        this.salario=salario;
        GregorianCalendar calendario=new GregorianCalendar(anno,mese-1,giorno);
        assunzioneGiorno=calendario.getTime();
    }
    public String getNome(){
        return nome;
    }
    public double getSalario(){
        return salario;
    }
    public Date getAssunzioneGiorno(){
        return assunzioneGiorno;
    }
    public void aumentaSalario(double percentuale){
        double aumento=(salario*percentuale)/100;
        newsalario=salario+aumento;
    }
    public double getNewSalario(){
        return newsalario;
    }
    
}
