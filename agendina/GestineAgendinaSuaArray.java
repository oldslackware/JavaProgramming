/*
 * Created on 4-mar-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package agendina;
import agendina.*;
import java.util.*;
import java.io.*;
import utili.*;
/**
 * @author luciano
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class GestineAgendinaSuaArray {
		static AgendinaSuArray agenda=new AgendinaSuArray();
		static String linea;
		static StringTokenizer st;
		public static void main( String []args ) throws IOException{
			ciclo: for(;;){
				linea=Console.readString(">");
				st=new StringTokenizer(linea, " ");
				char comando=(st.nextToken().toUpperCase()).charAt(0);
				switch( comando ){
					case 'Q': quit(); break ciclo;
					case 'A': aggiungiNominativo(); break;
					case 'R': rimuoviNominativo(); break;
					case 'T': ricercaTelefono(); break;
					case 'P': ricercaPersona(); break;
					case 'E': mostraElenco(); break;
					case 'S': salva(); break;
					case 'C': carica(); break;
					default: errore();
				}
			}//for
		}//main
		static void aggiungiNominativo(){
			String cog=null, nom=null, pre=null, tel=null;
			try{
				cog=st.nextToken().toUpperCase();
				nom=st.nextToken().toUpperCase();
				pre=st.nextToken();
				tel=st.nextToken();
			}catch( Exception e ){
				System.out.println("Dati incompleti!");
				return;
			}
			Nominativo n=new Nominativo( cog, nom, pre, tel );
			agenda.aggiungi( n );
		}//aggiugiNominativo
		static void rimuoviNominativo(){
			String cog=null, nom=null;
			try{
				cog=st.nextToken().toUpperCase();
				nom=st.nextToken().toUpperCase();
			}catch( Exception e ){
				System.out.println("Dati incompleti!");
				return;
			}
			agenda.rimuovi( cog, nom );
		}//rimuoviNominativo
		static void ricercaTelefono(){
			String cog=null, nom=null;
			try{
				cog=st.nextToken().toUpperCase();
				nom=st.nextToken().toUpperCase();
			}catch( Exception e ){
				System.out.println("Dati incompleti!");
				return;
			}
			Nominativo n=agenda.telefonoDi( cog, nom );
			if( n==null ) System.out.println("Nominativo inesistente!");
			else System.out.println(n.getPrefisso()+"-"+n.getTelefono());
		}//ricercaTelefono
		static void ricercaPersona(){
			String pre=null, tel=null;
			try{
				pre=st.nextToken();
				tel=st.nextToken();
			}catch( Exception e ){
				System.out.println("Dati incompleti!");
				return;
			}
			Nominativo n=agenda.personaDi( pre, tel );
			if( n==null ) System.out.println("Nominativo inesistente!");
			else System.out.println(n.getCognome()+" "+n.getNome());
		}//ricercaPersona
		static void mostraElenco(){
			System.out.println( agenda );
		}//mostraElenco
		static void salva() throws IOException{
			String nomeFile=null;
			try{
	        	nomeFile=st.nextToken();
			}catch( Exception e ){
				System.out.println("Dati incompleti!");
				return;
			}
	        agenda.salva( nomeFile );
		}//salva
		static void carica() throws IOException{
			String nomeFile=null;
			try{
	        	nomeFile=st.nextToken();
			}catch( Exception e ){
				System.out.println("Dati incompleti!");
				return;
			}
	        agenda.ripristina( nomeFile );
		}//carica
		static void errore(){
			System.out.println("Comando sconosciuto!");
			System.out.println();
			System.out.println("Comandi ammessi:");
			System.out.println("A(ggiungi  cog  nom  pre  tel");
			System.out.println("R(imuovi  cog  nom");
			System.out.println("T(elefono  cog  nom");
			System.out.println("P(persona  pre  tel");
			System.out.println("E(lenco");
			System.out.println("S(alva  nomefile");
			System.out.println("C(arica  nomefile");
			System.out.println("Q(uit");
		}//errore
		static void quit() throws IOException{
			String yesno=Console.readString("Vuoi salvare il contenuto dell'agenda prima di terminare(y/n)?");
			if( yesno.toLowerCase().equals("y") ){
				String nomeFile=Console.readString("nome file=");
				agenda.salva( nomeFile );
			}
		}//quit
	}//GestioneAgendina
