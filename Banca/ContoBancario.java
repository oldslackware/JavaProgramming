/*
 * Created on 28-feb-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Banca;


/**
 * @author luciano
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ContoBancario  {
	private String numero;
	private double bilancio;



public ContoBancario(String numero){
	this.numero=numero;
	bilancio=0;
}
public ContoBancario(String numero,double bilancio){
	this.numero=numero;
	this.bilancio=bilancio;
}
public void deposita(double ammontare){
	if(ammontare<0) return;
	bilancio+=ammontare;
}
public boolean preleva(double quanto){
	if(quanto<0){
		return false;
	}
	else if(quanto>bilancio){
		return false;
	}
	bilancio-=quanto;
	return true;
	}
public double saldo(){
	return bilancio;
}
public String conto(){
	return numero;
}

public boolean equals( Object o ){
    if( !(o instanceof ContoBancario) ) return false;
    ContoBancario c=(ContoBancario)o;
    return numero.equals( c.numero );
  }



public String toString(){
return ("Il conto=" +numero+"ha un saldo di "+bilancio);
}
}
