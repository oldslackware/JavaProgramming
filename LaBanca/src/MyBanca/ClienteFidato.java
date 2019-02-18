/*
 * ClienteFidato.java
 *
 * Created on 8 maggio 2007, 20.02
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
import java.lang.*;
public class ClienteFidato extends Cliente implements Serializable {
  
    private double fido;
    private double scoperto;
    /** Creates a new instance of ClienteFidato */
    
    
    
    public ClienteFidato(String cognome,String nome,String numeroConto,double bilancio,double fido) {
      super(cognome,nome,numeroConto,bilancio);
       
        
        this.fido=fido;
        
    }
        public double deposita( String cog,double ammontare ){
		if( ammontare<0 ) System.exit(0);
		if( ammontare<=scoperto ){
			scoperto -=ammontare; System.exit(0);
		}
		double residuo=ammontare-scoperto;
		return residuo;
	}//deposita
    public boolean preleva( double ammontare ){
      if( ammontare<0 ) return false;
      if( ammontare<=getBilancio() ){
		  super.preleva( ammontare );
		  return true;
	  }
      if( ammontare<=getBilancio()+fido-scoperto ){
		  double residuo=getBilancio();
		  super.preleva( residuo );
		  scoperto+=ammontare-residuo;
		  return true;
	  }
  	  return false;
    }//preleva
    
     
    
    
    
    
    
    
    
    
    
    public double getFido(){
        return fido;
    }
    public double getScoperto(){
        return scoperto;
    }
    public double fido(){ return this.fido; }
    public void nuovoFido( double fido ){ this.fido=fido; }//scoperto
    public double scoperto(){ return scoperto; }//scoperto
    public String toString(){
        return super.toString()+" e' ha un fido di "+getFido();
    }
}
