//file DenominatoreNullo.java

package poo.razionali;

public class DenominatoreNullo extends Exception{
	public DenominatoreNullo(){}
	public DenominatoreNullo( String msg ){
		super( msg );
	}
}