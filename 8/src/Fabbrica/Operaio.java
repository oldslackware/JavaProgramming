/*
 * Operaio.java
 *
 * Created on November 21, 2007, 3:47 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Fabbrica;
import java.util.*;
/**
 *
 * @author frick
 */
public class Operaio {
    private String nome;
    private String cognome;
    private double salario;
    private double aumento;
    
    public Operaio(String nome,String cognome,double salario) {
    this.nome=nome;
    this.cognome=cognome;
    this.salario=salario;
 
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
    
 
    public void aumentaStipendio(double quanto){
        aumento=salario*quanto/100;
        salario+=aumento;
    }
}
