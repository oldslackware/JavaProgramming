/*
 * Created on 18-feb-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Astrazione;

/**
 * @author luciano
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
abstract class Persona {
	private String nome;
	
	public Persona(String n){
		nome=n;
	}
	public abstract String getDescrizione();
	
	public String getNome(){
		return nome;
	}

}
