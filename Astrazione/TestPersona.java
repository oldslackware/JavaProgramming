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
public class TestPersona {
	public static void main(String[]args){
		Persona[]gente=new Persona[2];
		gente[0]=new Impiegato("Luciano Demuru",50000,2005,12,10);
		gente[1]=new Studente("Francesca Di Mare","Fisica");
		
		for (int i=0;i<gente.length;i++){
			System.out.println("Il signor "+gente[i].getNome()+","+gente[i].getDescrizione()+"\n");
		}
	}

}
