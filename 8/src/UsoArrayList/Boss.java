/*
 * Boss.java
 *
 * Created on November 24, 2007, 5:17 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package UsoArrayList;

/**
 *
 * @author frick
 */
public class Boss extends Impiegato{
    private double bonus;
    /** Creates a new instance of Boss */
    public Boss(String nome,String cognome,double salario) {
        super(nome,cognome,salario);
        bonus=0;
    }
    public Boss(String nome,String cognome,double salario,double bonus) {
        super(nome,cognome,salario);
        this.bonus=bonus;
    }
    public double getSalario(){
        double stipendioBase=super.getSalario();
        return stipendioBase+bonus;
        
    }
   public void setBonus(double  bonus){
       this.bonus=bonus;
   }
   public boolean equals(Object x){
       if(!super.equals(x))return false;
       Boss b=(Boss)x;
       return bonus==b.bonus;
       
   }
   
   public String toString() {
       return super.getNome()+" "+super.getCognome()+" percepisce un guadagno di "+getSalario()+" euro avendo un bonus di "+bonus+" euro e uno stipendio di "+super.getSalario();
   }
    public int hashCode(){
        return super.hashCode()+17*new Double(bonus).hashCode();
    }
}
