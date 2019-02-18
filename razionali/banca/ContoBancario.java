//file ContoBancario.java

package poo.banca;
import java.io.*;

public class ContoBancario implements Serializable{
    private String numero;
    private double bilancio=0;
	public ContoBancario( String numero ){
		//primo costruttore
		this.numero=numero;
	}
	public ContoBancario( String numero, double bilancio ){
		//secondo costruttore
		this.numero=numero; this.bilancio=bilancio;
	}
	public void deposita( double ammontare ){
		if( ammontare<0 ) return;
		bilancio=bilancio+ammontare; //o bilancio +=ammontare;
	}//deposita
    public boolean preleva( double ammontare ){
	    if( ammontare<0 ) return false;
		if( ammontare>bilancio ) return false;
      	bilancio -= ammontare;
		return true;
	}//preleva
	public double saldo(){
		return bilancio;
	}
	public String conto(){
		return numero;
	}//conto
    public String toString(){
	  return String.format( "conto=%s bilancio=E %1.2f", numero, bilancio );
    }//toString
    public boolean equals( Object o ){
      if( !(o instanceof ContoBancario) ) return false;
      ContoBancario c=(ContoBancario)o;
      return numero.equals( c.numero );
    }//equals
}//ContoBancario

