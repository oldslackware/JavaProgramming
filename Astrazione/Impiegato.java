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

import java.util.Date;
import java.util.GregorianCalendar;


class Impiegato extends Persona {
	private double salario;
	private Date assunzioneGiorno;
	public Impiegato(String n,double s,int anno,int mese,int giorno){
		super(n);
		salario=s;
		GregorianCalendar calendario=new GregorianCalendar(anno,mese-1,giorno);
		assunzioneGiorno=calendario.getTime();
	}
	public double getSalario(){
		return salario;
	}
	public Date getAssunzioneGiorno(){
		return assunzioneGiorno;
	}

public String getDescrizione(){
	return (" ha un salario di "+salario);
	}

public void rataSalario(double percentuale){
	double rate=salario*percentuale/100;
	salario+=rate;
}


}
