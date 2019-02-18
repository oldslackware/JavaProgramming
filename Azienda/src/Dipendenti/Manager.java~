/*
 * Manager.java
 *
 * Created on May 1, 2007, 6:28 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Dipendenti;

/**
 *
 * @author francesca
 */
public class Manager extends Impiegato {
   private double bonus; 
   private double newsalarioBoss;
    /** Creates a new instance of Manager */
    public Manager(String nome,double salario,int anno,int mese,int giorno) {
        super(nome,salario,anno,mese,giorno);
        bonus=0;
    }
    
    public void aumentaSalarioManager(double percentuale){
        double aumento=(salario*percentuale)/100;
        newsalarioBoss=salario+aumento+bonus;
    }
    public double getSalarioManager(){
        return newsalarioBoss;
        
    }
    public void setBonus(double bonus){
        this.bonus=bonus;
    }
}
