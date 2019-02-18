/*
 * GestioneBanca.java
 *
 * Created on 8 maggio 2007, 20.32
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package MyBanca;

/**
 *
 * @author luciano
 */
import java.util.*;
import java.io.*;
import javax.swing.*;
public class GestioneBanca {
    static BancaInterface lista=new Direzione();
        static String linea;
    static StringTokenizer st;
    
      public static void main(String []args)throws IOException,ClassNotFoundException{
        ciclo: for(;;){
            JOptionPane.showMessageDialog(null,"Inserisci\nA per aggiungere un conto..............................\nN per aggiungere un nostroCliente..............................\nB per rimuoverlo..............................\nT per ricercare il conto di un cliente..............................\nD per effettuare un deposito..............................\nP per ricercare un cliente..............................\nE per mostrare l'elenco dei tuoi contatti..............................\nS per salvare..............................\nC per caricare..............................\nQ per chiudere..............................\nH per l'aiuto sul programma..............................","Welcome in the software Bank",JOptionPane.CLOSED_OPTION);
         
            linea=JOptionPane.showInputDialog("Inserisci comando");
            st=new StringTokenizer(linea," ");
            char comando=(st.nextToken().toUpperCase()).charAt(0);
			switch(comando){
                case 'Q':quit();break ciclo;
                case 'A':aggiungiCliente();break;
                case 'N':aggiungiNostroCliente();break;
               case  'D':depositoSemplice();break;
                case 'B':rimuoviCliente();break;
                case 'T':ricercaConto();break;
                case 'P':ricercaPersona();break;
                case 'E':mostraElenco();break;
                case 'S':salva();break;
                case 'C':carica();break;
                case 'H':errore();
                default:errore();
            }
		}//for
	}
      static void aggiungiCliente(){
		String cog=null, nom=null, con=null;
                        String bila; double bil;
		try{
			cog=st.nextToken().toUpperCase();
			nom=st.nextToken().toUpperCase();
			con=st.nextToken();
			bila=st.nextToken();
                        bil=Double.parseDouble(bila);
                        
		}catch( Exception e ){
			
			return;
		}
		Cliente n=new Cliente( cog, nom, con, bil );
		lista.aggiungi( n );
	}//aggiugiNominativo
      
      static void aggiungiNostroCliente(){
		String cog=null, nom=null, con=null;
                String bila;double bil;
                String fid;double fido;
                
		try{
			cog=st.nextToken().toUpperCase();
			nom=st.nextToken().toUpperCase();
                        con=st.nextToken();
			bila=st.nextToken();
                        bil=Double.parseDouble(bila);
			fid=st.nextToken();
                        fido=Double.parseDouble(fid);
		}catch( Exception e ){
			
			return;
		}
		ClienteFidato c=new ClienteFidato( cog, nom, con, bil,fido );
		lista.aggiungiNostroCliente(c);
	}//aggiugiNominativo
    static void rimuoviCliente(){
		String cog=null, nom=null,con=null;
		try{
			cog=st.nextToken().toUpperCase();
			nom=st.nextToken().toUpperCase();
                        con=st.nextToken();
		}catch( Exception e ){
			System.out.println("Dati incompleti!");
			return;
		}
		lista.rimuovi( cog, nom,con);
	}
   static void ricercaPersona(){
		String con=null;
		try{
			con=st.nextToken();
		}catch( Exception e ){
			System.out.println("Dati incompleti!");
			return;
		}
		Cliente n=lista.personaDi(con );
		if( n==null ) System.out.println("Cliente inesistente!");
		else //System.out.println(n.getCognome()+" "+n.getNome());
 JOptionPane.showMessageDialog(null,"La persona cercata con numero di conto"+n.getNumeroConto()+" e' "+n.getCognome()+" "+n.getNome(),"Elenco",JOptionPane.CLOSED_OPTION);
	}
   
   static void ricercaConto(){
		String cog=null, nom=null;
		try{
			cog=st.nextToken().toUpperCase();
			nom=st.nextToken().toUpperCase();
		}catch( Exception e ){
			System.out.println("Dati incompleti!");
			return;
		}
		Cliente n=lista.contoDi(cog,nom);
		if( n==null ) System.out.println("Conto inesistente!");
		else //System.out.println(n.getNumeroConto()+" ha un bilancio di "+n.getBilancio());
 JOptionPane.showMessageDialog(null,n.getCognome()+" "+n.getNome()+" ha il seguente numero di conto "+n.getNumeroConto(),"Elenco",JOptionPane.CLOSED_OPTION);
	}//ricercaConto
   
  
   static void depositoSemplice(){
       String con=null;
       String quanto=null;
       double ammontare;
       try{
           
           con=st.nextToken();
           quanto=st.nextToken();
           ammontare=Double.parseDouble(quanto);
           
       }catch(Exception e){
           System.out.println("Dati incompleti!");
			return;
       }
      Cliente n=lista.deposita(con,ammontare);
      if( n==null ) System.out.println("Conto inesistente!");
      else 
          //System.out.println(n.getNumeroConto()+" ha adesso un bilancio di "+n.deposita(con,ammontare));
      //lista.deposita(ammontare);
      JOptionPane.showMessageDialog(null,n.getCognome()+" "+n.getNome()+" ha adesso un bilancio di "+n.deposita(con,ammontare),"Elenco",JOptionPane.CLOSED_OPTION);
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   static void mostraElenco(){
		//System.out.println( agenda );
       
       JOptionPane.showMessageDialog(null,lista,"Elenco",JOptionPane.CLOSED_OPTION);
	}//mostraElenco
   
    static void salva() throws IOException{
		String nomeFile=null;
		try{
        	nomeFile=st.nextToken();
		}catch( Exception e ){
			System.out.println("Dati incompleti!");
			return;
		}
        lista.salva( nomeFile );
	}//salva
    
    static void carica() throws IOException,ClassNotFoundException{
		String nomeFile=null;
		try{
        	nomeFile=st.nextToken();
		}catch( Exception e ){
			System.out.println("Dati incompleti!");
			return;
		}
        lista.ripristina( nomeFile );
	}//carica
    
     static void errore(){
            JOptionPane.showMessageDialog(null,"Comandi ammessi:\n A Aggiungi con parametri  cog  nom  conto bilancio\n esempio:\nA Rossi Mario 352145 15.564\n R Rimuovi con parametri  cog  nom conto\n esempio:\n R Rossi Mario 352145\n T per ricercare un conto\n esempio  cog  nom\n esempio:\n T Rossi Mario\n P Ricerca Persona con parametro il numero del conto\n esempio:\n P 352145\n D Per effettuare un deposito\n esempio:T 352145 1000\nE Elenco \n esempio:\n E\n S Salva con parametro nomefile in cui salvare\nesempio:\n S MyAgend\n C Carica con paametro nomefile che si vuole caricare\n esempio:\n C MyAgend\n Q Chiude il programma\n esempio:\n Q\n ","Elenco Comandi",JOptionPane.CLOSED_OPTION);
            
        }
     
     
	 static void quit()throws IOException{
            String risposta=JOptionPane.showInputDialog("Vuoi salvare il programma prima di chiuderlo?Premi y per salvare n per chiudere senza salvare");
            if(risposta.toUpperCase().equals("Y")){
                String saveFile=JOptionPane.showInputDialog("Inserisci il nome del file in cui vuoi salvare\nEsempio:Clienti");
                lista.salva(saveFile);
            }
                
            
        }
    
    
}
