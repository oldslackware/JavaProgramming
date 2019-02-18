/*
 * Gatto.java
 *
 * Created on 10 maggio 2007, 19.18
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ExtendsEPolformismoAmimali2;

/**
 *
 * @author luciano
 */
public class Gatto extends Animale{
    
    private String nome;
    private String razza;
    
    public Gatto(String nome,String razza) {
        super("Gatto");
        this.nome=nome;
        this.razza=razza;
    }
    public String toString(){
        return super.toString()+"\nLui e' "+nome+" il "+razza;
    }
    public String sound(){
        return super.sound()+"Miao miao";
    }
    
}
