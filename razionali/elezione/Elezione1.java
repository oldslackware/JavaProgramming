//Elezione1.java

package poo.elezione;
import java.util.*;
import java.io.*;

import poo.inout.*;

public class Elezione1 extends Elezione{
	private List elettori=new LinkedList();
	private List candidati=new ArrayList();
	private int n; //numero dei candidati
	private int vincitore;
	private int[] prelevaEValidaDati( String linea ){
		int []voti=new int[n];
		StringTokenizer st=new StringTokenizer( linea, " " );
		int c=0;
		while( st.hasMoreTokens() ){
			int x=(Integer.parseInt( st.nextToken() ) );
			if( x<0 || x>n-1 ) throw new DatiScorretti(x+" Preferenza Errata");
			if( c==n ) throw new DatiScorretti("Troppe Preferenze");
			for( int i=0; i<c; i++ )
				if( voti[i]==x ) throw new DatiScorretti(x+" Preferenza Duplicata");
			voti[c]=x;
			c++;
		}
		if( c<n ) throw new DatiScorretti("Preferenze Mancanti");
		return voti;
	}//prelevaEValidaDati
	private void contaVoti(){
		candidati.clear();
		for( int cand=0; cand<n; cand++ ){
			int freq=0;
			Iterator it=elettori.iterator();
			while( it.hasNext() ){
				Elettore e=(Elettore)it.next();
				if( e.getPreferenza()==cand ) freq++;
			}
			if( freq>0 )
				candidati.add( new Candidato( cand, freq ) );
		}
	}//contaVoti
	private int verificaVincitoreERimuovi(){
		int max=((Candidato)candidati.get(0)).getVoti();
		int min=max;
		int winner=((Candidato)candidati.get(0)).getId();
		for( int i=1; i<candidati.size(); i++ ){
			Candidato c=(Candidato)candidati.get(i);
			int v=c.getVoti();
			if( v>max ){ max=v; winner=c.getId(); }
			else if( v<min ) min=v;
		}
        if( max>elettori.size()/2 ) return winner;
        //aggiorna preferenza degli elettori che hanno scelto
        //un candidato col minimo numero di voti
        int indice=0;
        while( indice<candidati.size() ){
			Candidato c=(Candidato)candidati.get(indice);
			if( c.getVoti()==min ){
				//passa alla prossima preferenza degli elettori
				Iterator it=elettori.iterator()	;
				while( it.hasNext() ){
					Elettore e=(Elettore)it.next();
					if( e.getPreferenza()==c.getId() )
						e.prossimaPreferenza();
				}
			}
			indice++;
		}//for
        return -1;
	}//verificaVincitoreERimuovi
	public int faiScrutinio( String nomeFile ) throws IOException{
		BufferedReader br=new BufferedReader(
			new FileReader( nomeFile ) );
		n=Integer.parseInt( br.readLine() );
		String linea=null;
		for(;;){
			linea=br.readLine();
			if( linea==null ) break;
			int voti[]=prelevaEValidaDati( linea );
			elettori.add( new Elettore( voti ) );
		}
		br.close();
		for(;;){
			contaVoti();
			vincitore=verificaVincitoreERimuovi();
			if( vincitore!=-1 ) return vincitore;
            if( candidati.size()==0 ) return -1;
		}
	}//faiScrutinio
	public String toString(){
		String s="";
		if( vincitore!=-1 ) s+="Candidato vincitore="+vincitore;
		else s+="Nessun vincitore";
		return s;
	}//toString
	public static void main( String []args ) throws IOException {
		Elezione e=new Elezione1();
		String nomeFile=Console.readString("nome file=");
		int esito=e.faiScrutinio( nomeFile );
		if( esito!=-1 ) System.out.println("Candidato vincitore="+esito );
		else System.out.println("Nessun vincitore");
	}
}//Elezione1