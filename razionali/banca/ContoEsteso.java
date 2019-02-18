//file ContoEsteso.java

package poo.banca;
import java.io.*;

public class ContoEsteso extends ContoBancario implements Serializable{
    private double fido=1000;
    private double scoperto=0;
    public ContoEsteso( String numero ){
       super( numero );
    }
    public ContoEsteso( String numero, double bilancio ){
        super( numero, bilancio );
    }
    public ContoEsteso( String numero, double bilancio, double fido ){
        super( numero, bilancio ); this.fido=fido;
    }
    public void deposita( double ammontare ){
		if( ammontare<0 ) return;
		if( ammontare<=scoperto ){
			scoperto -=ammontare; return;
		}
		double residuo=ammontare-scoperto;
		scoperto=0; super.deposita( residuo );
	}//deposita
    public boolean preleva( double ammontare ){
      if( ammontare<0 ) return false;
      if( ammontare<=saldo() ){
		  super.preleva( ammontare );
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
    public double fido(){ return this.fido; }
    public void nuovoFido( double fido ){ this.fido=fido; }//scoperto
    public double scoperto(){ return scoperto; }//scoperto
    public String toString(){
       return String.format( super.toString()+
              " fido=E %1.2f scoperto=E %1.2f", fido, scoperto );
    }
}//ContoEsteso

