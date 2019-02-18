/*
 * Created on 19-feb-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Interfaccie;

/**
 * @author luciano
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

//Utilizzo dell'intefaccia COMPARABLE
public class Impiegato implements Comparable{
	private String nome;
	private double salario;
	public Impiegato(String n,double s){
		nome=n;
		salario=s;
		}
	public String getNome(){
		return nome;
	}
	public double getSalario(){
		return salario;
	}
	public void rataSalario(double percentuale){
		double rata=salario*percentuale/100;
		salario+=rata;
	}
	/*Confronta gli impiegati in base allo STIPENDIO
	 @param other un altro oggetto Impiegato
	 @return un valore negativo se questo impiegato ha uno stipendio inferiore
      inferiore a quello di OTHEROBJECT,zero se gli stipendi sono uguali,altrimenti un
      valore positivo*/
	
	public int compareTo(Object otherObject){
		Impiegato other=(Impiegato)otherObject;
		if(salario<other.salario)return -1;
		if(salario>other.salario)return 1;
		else return 0;
	}
}
