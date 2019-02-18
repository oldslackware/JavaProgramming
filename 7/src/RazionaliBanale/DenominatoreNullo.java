/*
 * DenominatoreNullo.java
 *
 * Created on November 15, 2007, 1:39 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package RazionaliBanale;

/**
 *
 * @author frick
 */
public class DenominatoreNullo extends Exception{
	public DenominatoreNullo(){}
	public DenominatoreNullo( String msg ){
		super( msg );
	}
}
