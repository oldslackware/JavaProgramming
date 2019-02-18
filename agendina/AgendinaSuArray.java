/*
 * Created on 4-mar-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package agendina;
import java.io.*;
import java.util.*;
/**
 * @author luciano
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

import java.io.*;
import java.util.*;
public class AgendinaSuArray{
	private Nominativo []elenco;
	private int n; //dimensione dellarray
	private int size; //numero effettivo di nominativi
	public AgendinaSuArray(){
		this(100);
	}
	public AgendinaSuArray( int n )
	{ this.n=n; elenco=new Nominativo[n]; size=0; }
	public int size(){ return size; }
	protected void rialloca(){
		Nominativo []nuovoElenco=new Nominativo[n*2];
		System.arraycopy( elenco, 0, nuovoElenco, 0, size );
		n *=2;
		elenco=nuovoElenco;
	}//rialloca
	public void aggiungi( Nominativo n ){
		if( size==this.n ) rialloca();
		//cerca indice i per linserimento di n in elenco
		int i=0;
		while( i<size && elenco[i].compareTo(n)<0 ) i++;
		//se gia esiste, sovrascrivi
		if( i<size && elenco[i].equals(n) ){ elenco[i]=n; return; }
		//fai scorrere gli elementi da i a size-1 di un posto a destra
		for( int j=size-1; j>=i; j-- ) elenco[j+1]=elenco[j];
		//inserisci n
		elenco[i]=n;
		size++; //conta questa aggiunta
	}//aggiungi
	public void rimuovi( String cog, String nom ){
		Nominativo n=new Nominativo( cog, nom, "", "" );
		int i=ricercaBinaria( n );
		if( i==-1 ) return;
		//fai scorrere gli elementi da i a size-1 di un posto a sinistra
		for( int j=i+1; j<size; j++ ) elenco[j-1]=elenco[j];
		size--; //conta questa eliminazione
	}//rimuovi
	public Nominativo telefonoDi( String cog, String nom ){
    	Nominativo n=new Nominativo( cog, nom, "", "" );
		int i=ricercaBinaria( n );
		if( i==-1 ) return null;
		return elenco[i];
	}//telefonoDi
	public Nominativo  personaDi( String prefisso, String telefono ){
	for( int i=0; i<size; i++ )
		if( elenco[i].getTelefono().equals(telefono) &&
		    elenco[i].getPrefisso().equals(prefisso) )
		    return elenco[i];
		return null;
	}//personaDi
	public String toString(){
		String s="";
		for( int i=0; i<size; i++ )
			s += elenco[i]+"\n";
		return s;
	}//toString
	public void salva(String nomeFile) throws IOException{
		PrintWriter pw=new PrintWriter( new FileWriter(nomeFile) );
		for( int i=0; i<size; i++ )
			pw.println( elenco[i] ); //si sfrutta il toString di Nominativo
		pw.close();
	}//salva
	public void ripristina(String nomeFile) throws IOException{
		elenco=new Nominativo[n]; size=0;
		BufferedReader br=new BufferedReader( new FileReader( nomeFile ));
		String linea=null;
		StringTokenizer st=null;
		String cog, nom, pre, tel;
		for(;;){
			linea=br.readLine();
			if( linea==null ) break; //fine file
			st=new StringTokenizer(linea, " -");
			cog=st.nextToken(); nom=st.nextToken();
			pre=st.nextToken(); tel=st.nextToken();
			Nominativo n=new Nominativo( cog, nom, pre, tel );
			aggiungi( n );
		}
		br.close();
	}//ripristina
	protected int ricercaBinaria( Nominativo n ){
		int inf=0, sup=size-1;
		while( inf<=sup ){
			int med=(inf+sup)/2;
			int esito=elenco[med].compareTo(n);
			if( esito==0 ) return med;
			if( esito>0 ) sup=med-1;
			else inf=med+1;
		}
		return -1;
	}//ricercaBinaria
}//AgendinaSuArray
