/*
 * Cane.java
 *
 * Created on 10 maggio 2007, 19.14
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ExtendsEPolformismoAmimali2;

/**
 *
 * @author luciano
 */
public class Cane extends Animale {
    private String nome;
    private String razza;
    
    public Cane(String nome,String razza) {
        super("Cane");
        this.nome=nome;
        this.razza=razza;
    }
       public String toString(){
        return super.toString()+"\nLui e' "+nome+" il "+razza;
    }
       public String sound(){
           return super.sound()+"Bau Bau";
       }
       
    
}
