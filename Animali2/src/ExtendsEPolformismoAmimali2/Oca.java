/*
 * Oca.java
 *
 * Created on 10 maggio 2007, 19.23
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ExtendsEPolformismoAmimali2;

/**
 *
 * @author luciano
 */
public class Oca extends Animale{
    private String nome;
    private String razza;
    
    /** Creates a new instance of Oca */
    public Oca(String nome,String razza) {
        super("Oca");
        this.nome=nome;
        this.razza=razza;
    }
    public String toSting(){
        return super.toString()+"\nLei e' "+nome+" il "+razza;
    }
    public String sound(){
        return super.sound()+"Qua qua qua";
    }
    
}
