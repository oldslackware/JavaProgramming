/*
 * Impiegato.java
 *
 * Created on November 23, 2007, 11:05 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package UsoMetodoEquals;

/**
 *
 * @author frick
 */
class Impiegato {
    private String nome;
    private String cognome;
    private double salario;
    private double aumento;
    public Impiegato(String nome,String cognome,double salario) {
        this.nome=nome;
        this.cognome=cognome;
        this.salario=salario;
    }
    
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return nome;
    }
    public double getSalario(){
        return salario;
    }
    public void aumenta(double quanto){
        aumento=salario*quanto/100;
        salario+=aumento;
        
    }
    
    public boolean equals(Object x){
        if(this==x)return true;//verifica per cvedere se gli oggetti sono identici
        //Se il parametro implicito e' null restituisco false
        if(x==null)return false;
        //se le classi non coincidono non possono essere uguali
        if(getClass()!=x.getClass())
            return false;
        //Adesso i due oggetti sono di tipo impiegato
        Impiegato i=(Impiegato)x;
        //verifichiamo se hanno le stessa variabile di istanza
        return nome.equals(i.nome)&&cognome.equals(i.cognome)&&salario==i.salario;
    }
    
    //Facciamoci restituire il codice hash
    
    public int hashCode(){
        return 7*nome.hashCode()+7*cognome.hashCode()+11*new Double(salario).hashCode();
    }
    
    public String toString(){
        return cognome+" "+nome+" percepisce "+salario+" euro";
    }
    
 }
