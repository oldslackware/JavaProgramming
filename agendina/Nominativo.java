/*
 * Created on 4-mar-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package agendina;

/**
 * @author luciano
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
import java.io.*;
public class Nominativo implements Comparable,Serializable {
private String nome;
private String cognome;
private String prefisso;
private String telefono;

public Nominativo(String nome,String cognome,String prefisso,String telefono){
	this.nome=nome;
	this.cognome=cognome;
	this.prefisso=prefisso;
	this.telefono=telefono;
}
public String getNome(){
	return nome;
}
public String getCognome(){
	return cognome;
}
public String getPrefisso(){
	return prefisso;
}
public String getTelefono(){
	return telefono;
}
public boolean equals(Object x){
	if( !(x instanceof Nominativo) )return false;
	Nominativo n=(Nominativo)x;
	return this.cognome.equals(n.cognome)&&this.nome.equals(n.nome);
	
	}
public int compareTo(Object x){
	Nominativo n=(Nominativo)x;
	if(this.cognome.compareTo(n.cognome)<0)return -1;//This.cognome precede n.cognome
	if(this.cognome.equals(n.cognome)&&(this.nome.compareTo(n.nome))<0)return -1;//cognomi uguali ma this.nome precede n.nome
	if(this.equals(n))return 0;//Nominativo uguali
	return 1;//Altrimenti l'oggetto this segue
}
public String ToString(){
	return cognome+" "+nome+" "+prefisso+"-"+telefono;
}

public int hashCode(){ 
	return (cognome+nome).hashCode(); 
	}
}
