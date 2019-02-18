/*
 * Created on 28-feb-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Banca;
import utili.*;

/**
 * @author luciano
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ContoEsteso extends ContoBancario {
	private double fido;
	private double scoperto=0;
	
	public ContoEsteso(String numero){
		super(numero);
		fido=1000;
	}
	public ContoEsteso(String numero,double bilancio,double fido){
		super(numero,bilancio);
		do{
		System.out.println("Immetti il fido bancario");
		fido=Console.readDouble(">");
		}while(fido<0);
		this.fido=fido;
	}
	public ContoEsteso(String numero,double bilancio){
		super(numero,bilancio);
	}
public void deposita(double ammontare){
	if(ammontare<0){
		return;
	}
	if(ammontare<=scoperto){
		scoperto-=ammontare;
		return;
	}
	double residuo=ammontare-scoperto;
	scoperto=0;
	
	super.deposita(residuo);
}
public boolean preleva(double ammontare){
	if(ammontare<0){
		return false;
	}
	if(ammontare<=saldo()){
		super.preleva(ammontare);
		return true;
	}
    if( ammontare<=saldo()+fido-scoperto ){
		  double residuo=saldo();
		  super.preleva( residuo );
		  scoperto+=ammontare-residuo;
		  return true;
	  }
	  return false;
  }//preleva
public double fido(){
	return this.fido;

}
public void NuovoFido(double fido){
this.fido=fido;	
}
public  double scoperto(){
	return scoperto;
}
public String toString(){
	return (super.toString()+",con un fido di " +fido); 
}
}
