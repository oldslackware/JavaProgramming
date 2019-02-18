//Elettore.java

package poo.elezione;

public class Elettore{
	protected int []preferenze;
	protected int scelta=0; //ridondante
	public Elettore( int []preferenze ){ this.preferenze=preferenze; }
	public int getPreferenza(){ return preferenze[scelta]; }
	public void prossimaPreferenza(){
		scelta++;
	}//prossimaPreferenza
	public String toString(){
		String s="";
		for( int i=0; i<preferenze.length; i++ )
			s+=preferenze[i]+" ";
		return s;
	}//toString
}//Elettore