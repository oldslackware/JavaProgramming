/*
 * GestioneAgendinaLinkedList.java
 *
 * Created on 8 maggio 2007, 18.16
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package AgendaConLinkedList;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
/**
 *
 * @author luciano
 */
public class GestioneAgendinaLinkedList{
static Agendina agenda=new AgendinaLinkedList();    
   static String linea;
    static StringTokenizer st;
    
    
    
    public static void main(String []args)throws IOException,ClassNotFoundException{
        ciclo: for(;;){
            JOptionPane.showMessageDialog(null,"Inserisci\n A per aggiungere un contatto \n B per rimuoverlo\n T per ricercare il telefono di un tuo contatto \n P per ricercare un tuo contatto \n E per mostrare l'elenco dei tuoi contatti \n S per salvare \n C per caricare\n Q per chiudere \n H per l'aiuto sul programma","Welcome",JOptionPane.CLOSED_OPTION);
         
            linea=JOptionPane.showInputDialog("Inserisci comando");
            st=new StringTokenizer(linea," ");
            char comando=(st.nextToken().toUpperCase()).charAt(0);
			switch(comando){
                case 'Q':quit();break ciclo;
                case 'A':aggiungiNominativo();break;
                case 'B':rimuoviNominativo();break;
                case 'T':ricercaTelefono();break;
                case 'P':ricercaPersona();break;
                case 'E':mostraElenco();break;
                case 'S':salva();break;
                case 'C':carica();break;
                case 'H':errore();
                default:errore();
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
		//System.out.println( agenda );
                JOptionPane.showMessageDialog(null,agenda,"Elenco",JOptionPane.CLOSED_OPTION);
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
	/*static void errore(){
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
	}//errore*/
          static void errore(){
            JOptionPane.showMessageDialog(null,"Comandi ammessi:\n A Aggiungi con parametri  cog  nom  pre  tel\n esempio:\nA Rossi Mario 320 2456147\n R Rimuovi con parametri  cog  nom\n esempio:\n R Rossi Mario\n T Telefono con parametri  cog  nom\n esempio:\n T Rossi Mario\n P Persona con parametri  pre  tel\n esempio:\n P 320 2456147\n E Elenco \n esempio:\n E\n S Salva con parametro nomefile in cui salvare\nesempio:\n S MyAgend\n C Carica con paametro nomefile che si vuole caricare\n esempio:\n C MyAgend\n Q Chiude il programma\n esempio:\n Q\n ","Elenco Comandi",JOptionPane.CLOSED_OPTION);
            
        }
        
        
	 static void quit()throws IOException{
            String risposta=JOptionPane.showInputDialog("Vuoi salvare il programma prima di chiuderlo?Premi y per salvare n per chiudere senza salvare");
            if(risposta.toUpperCase().equals("Y")){
                String saveFile=JOptionPane.showInputDialog("Inserisci il nome del file in cui vuoi salvare\nEsempio:MyAgend.dat");
                agenda.salva(saveFile);
            }
                
            
        }
    
    
}
