/*
 * Impiegato.java
 *
 * Created on November 21, 2007, 6:14 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Astrazione;

/**
 *
 * @author frick
 */
public class Impiegato extends Persona {
    private double salario;
    private double aumento;
    /** Creates a new instance of Impiegato */
    public Impiegato(String nome,String cognome,double salario) {
        super(nome,cognome);
        this.salario=salario;
    }
    public double getSalario(){ 
        return salario;
    }
    public String descrizione(){
        return " un operaio con uno stipendio di "+salario+" euro";
    }
    public String saluto(){
        return "\nCiao,scusa se scappo ma devo lavorare altrimenti mi licenziano\n";
    }
    
    public void aumentaSalario(double quanto){
        aumento=salario+quanto/100;
        salario+=aumento;
    }
    
}
