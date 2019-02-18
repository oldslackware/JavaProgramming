/*
 * Cane.java
 *
 * Created on 10 maggio 2007, 17.31
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ExtendsAnimali1;

/**
 *
 * @author luciano
 */
public class Cane extends Animale {
    
    private String nome;
    private String razza;
    public Cane(String nome) {
        super("Cane");
        this.nome=nome;
    }
    public Cane(String nome,String razza){
        super("Cane");
        this.nome=nome;
        this.razza=razza;
    }
    //Nuovo metodi toString eliminare per vedere come viene richiamato quello Di Animale
    /*public String toString(){
        return " Lui e' "+nome+" il "+razza;
    }*/
    //Questo metodo mi richiama il toString della classe base mediante keyword super
    public String toString(){
        return super.toString()+"\nLui e' "+nome+" il "+razza;
    }

}
