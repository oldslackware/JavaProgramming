/*
 * Cliente.java
 *
 * Created on 8 maggio 2007, 19.36
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package MyBanca;

/**
 *
 * @author luciano
 */
import java.io.*;
public class Cliente implements Comparable,Serializable {
    protected String cognome;
    protected String nome;
    
    protected String numeroConto;
    protected double bilancio;
    private double newbilancio;
   private double ammontare=0;
    public Cliente() {
        this.cognome="";
        this.nome="";
        this.numeroConto="";
        this.bilancio=0;
    }
    public Cliente(String cognome,String nome,String numeroConto,double bilancio){
        this.cognome=cognome;
        this.nome=nome;
        this.numeroConto=numeroConto;
        this.bilancio=bilancio;
    }
    public String getCognome(){
       return cognome;
   }
   
   public String getNome(){
       return nome;
   }
   
   public String getNumeroConto(){
       return numeroConto;
   }
   public double getBilancio(){
       return bilancio;
   }
   public boolean equals(Object x){
       if(!(x instanceof Cliente))
           return false;
       Cliente n=(Cliente)x;
       return numeroConto.equals(n.numeroConto);
   }
   public int compareTo(Object x){
       Cliente n=(Cliente)x;
       if(this.cognome.compareTo(n.cognome)<0)return -1;
        if(this.cognome.equals(n.cognome)&&this.nome.compareTo(n.nome)<0)return -1;
        if(this.equals(n))return 0;
        else return 1;
       
   }
   public double deposita( String cog,double ammontare ){
		if( ammontare<0 )System.exit(0);
		newbilancio=bilancio+ammontare;
                return newbilancio;//o bilancio +=ammontare;
	}
   public double getNewBilancio(){
       return newbilancio;
   }
   /*public double getSomma(){
       return somma;
   }*/
  public boolean preleva( double ammontare ){
	    if( ammontare<0 ) return false;
		if( ammontare>bilancio ) return false;
      	bilancio -= ammontare;
		return true;
	}//preleva
   
   
   public String toString(){
       
       if(newbilancio>0)
       return cognome+" "+nome+"-"+numeroConto+" ha un saldo di "+newbilancio;
       return cognome+" "+nome+"-"+numeroConto+" ha un saldo di "+bilancio;
   }
    public int hashCode(){
        return (cognome+nome).hashCode();
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
}
