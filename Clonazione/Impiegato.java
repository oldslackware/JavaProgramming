/*
 * Created on 19-feb-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Clonazione;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author luciano
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

public class Impiegato implements Cloneable {
	private String nome;
	private double salario;
	private Date assunzioneGiorno;
	public Impiegato(String n,double s){
		nome=n;
		salario=s;
	}
	public Impiegato clone(Object clonedObject)throws CloneNotSupportedException{
		Impiegato cloned=(Impiegato)clonedObject;
		cloned=(Impiegato)super.clone();
		
		cloned.assunzioneGiorno=(Date)assunzioneGiorno.clone();
		return cloned;
	}
	public void setAssunzioneGiorno(int anno,int mese,int giorno){
		GregorianCalendar calendario=new GregorianCalendar(anno,mese-1,giorno);
		assunzioneGiorno=calendario.getTime();
	}
	public void rataSalario(double percentuale){
		double rata=salario*percentuale/100;
		salario+=rata;
	}
	public String toString(){
		return "Impiegato[nome=" +nome +",salario=" + salario +",assunzioneGiorno=" + assunzioneGiorno +"]";
	}
	
	}


