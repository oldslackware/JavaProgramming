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
class Studente extends Persona {
	private String facolta;
	public Studente(String n,String facolta){
		super(n);
		this.facolta=facolta;
		}
	public String getDescrizione(){
		return " frequenta la facolta' di "+ facolta;
	}

}
