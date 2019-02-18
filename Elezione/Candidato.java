/*
 * Created on 25-feb-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Elezione;

/**
 * @author luciano
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Candidato {
private String s;
private int voti;

public Candidato(String s){
	this.s=s;
	this.voti=0;
	}
public void ImmettiVoto(){
	voti++;
}
public void RimuoviVoti(){
	voti--;
}
public String getNome(){
	return this.s;
}
public int getVoti(){
	return this.voti;
}
public String toString(){
	return new String(getNome()+",ha ottenuto "+getVoti()+" voti");
}
}
