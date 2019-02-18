/*
 * Manager.java
 *
 * Created on November 23, 2007, 11:32 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package UsoMetodoEquals;

/**
 *
 * @author frick
 */
public class Manager extends Impiegato {
    private double bonus;
    
    public Manager(String nome,String cognome,double salario) {
    super(nome,cognome,salario);
    bonus=0;
    }
    public double getSalario(){
        double stipendioBase=super.getSalario();
        return stipendioBase+bonus;
    }
    public void setBonus(double bonus){
        this.bonus=bonus;
    }
    public boolean equals(Object x){
        if(!super.equals(x))return false;
        //Adesso appartengono alla stessa classe
        Manager m=(Manager)x;
        return bonus==m.bonus;
    }
    public int hashCode(){
        return super.hashCode()+17*new Double(bonus).hashCode();
    }
    public String toString(){
        return super.toString()+" e ha un bonus di "+bonus+" euro";
    }
    
}
