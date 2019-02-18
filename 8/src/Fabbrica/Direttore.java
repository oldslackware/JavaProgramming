/*
 * Direttore.java
 *
 * Created on November 21, 2007, 3:56 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Fabbrica;

/**
 *
 * @author frick
 */
public class Direttore extends Operaio{
    private double bonus;
    /** Creates a new instance of Direttore */
    public Direttore(String nome,String cognome,double salario) {
        super(nome,cognome,salario);
        bonus=0;
    }
    
    public double getSalario(){
        double base=super.getSalario();
        return base+bonus;
    }
    
    public void setBonus(double bonus){
        this.bonus=bonus;
        
    }
    public double getBonus(){
        return bonus;
    }
    
}
