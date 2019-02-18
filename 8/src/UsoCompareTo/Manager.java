/*
 * Manager.java
 *
 * Created on November 25, 2007, 4:51 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package UsoCompareTo;

/**
 *
 * @author frick
 */
public class Manager extends Impiegato{
    private double bonus;
    /** Creates a new instance of Manager */
    public Manager(String nome,String cognome,double salario) {
        super(nome,cognome,salario);
        bonus=0;
    }
    public Manager(String nome,String cognome,double salario,double bonus){
        super(nome,cognome,salario);
        this.bonus=bonus;
    }
    
    public void setBonus(double bonus){
        this.bonus=bonus;
    }
    
    public double getSalario(){
        double stipendioBase=super.getSalario();
        return bonus+stipendioBase;
    }
    public String toString(){
        return super.getNome()+" "+super.getCognome()+" percepisce un guadagno di "+getSalario()+" euro avendo un bonus di "+bonus+" euro e uno stipendio di "+super.getSalario();
    }
    public int hashCode(){
        return super.hashCode()+17*new Double(bonus).hashCode();
    }
    public boolean equals(Object x){
        if(!super.equals(x))return false;
        Manager m=(Manager)x;
        return bonus==m.bonus;
    }
   /* public int compareTo(Impiegato x){
    int n=super.compareTo(x);
        return n;
    }*/
    
 }
