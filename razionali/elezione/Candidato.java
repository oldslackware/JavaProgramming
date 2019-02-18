//Candidato.java

package poo.elezione;

public class Candidato implements Comparable{
	protected int id;
	protected int voti=0;
	public Candidato( int id, int voti ){ this.id=id; this.voti=voti; }
	public boolean equals( Object x ){
		if( !(x instanceof Candidato) ) return false;
		return ((Candidato)x).id==this.id;
	}//equals
	public int compareTo( Object x ){
		Candidato c=(Candidato)x;
		if( this.voti>c.voti ) return -1;
		if( this.voti<c.voti ) return +1;
		return 0;
	}//compareTo
	public String toString(){
		return "candidato "+id+" voti "+voti;
	}//toString
	public int getId(){ return id; }
	public int getVoti(){ return voti; }
}//Candidato