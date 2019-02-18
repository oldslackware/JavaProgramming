/*
 * AgendinaConcatenata.java
 *
 * Created on 6 maggio 2007, 22.54
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package AgendaConListe;

/**
 *
 * @author luciano
 */

import java.io.*;
import java.util.*;
import javax.swing.*;

class Nodo{
	Nominativo info;
	Nodo next;
}//Nodo

public class AgendinaConcatenata extends Agendina{
	private Nodo testa;
	private int size=0;
	public int size(){ return size; }
	public void aggiungi( Nominativo n ){
    	//cerca posizione di inserimento di n nell'elenco
    	Nodo cor=testa, pre=null;
    	while( cor!=null && cor.info.compareTo(n)<0 ){
			pre=cor; cor=cor.next;
		}
    	if( cor!=null && cor.info.equals(n) ){
			/*sovrascrivi*/
			cor.info=n;
			return;
		}
    	Nodo nuovo=new Nodo();
    	nuovo.info=n; nuovo.next=cor;
        if( cor==testa ) testa=nuovo;
    	else pre.next=nuovo;
    	size++; //conta questa aggiunta
    }//aggiungi
	public void rimuovi( String cog, String nom ){
		Nominativo n=new Nominativo( cog, nom, "", "" );
    	Nodo cor=testa, pre=null;
    	while( cor!=null && cor.info.compareTo(n)<0 ){
			pre=cor; cor=cor.next;
		}
    	if( cor==null || cor.info.compareTo(n)>0 ) return;
    	if( cor==testa ) testa=testa.next;
    	else pre.next=cor.next;
		size--; //conta questa eliminazione
	}//rimuovi
	public Nominativo telefonoDi( String cognome, String nome ){
		Nominativo n=new Nominativo( cognome, nome, "", "" );
    	Nodo cor=testa;
    	while( cor!=null && cor.info.compareTo(n)<0 ) cor=cor.next;
    	if( cor==null || cor.info.compareTo(n)>0 ) return null;
		return cor.info;
	}//telefonoDi
	public Nominativo personaDi( String prefisso, String telefono ){
    	Nodo cor=testa;
    	while( cor!=null  ){
			if( cor.info.getNumeTelefono().equals(telefono) &&
				cor.info.getPrefisso().equals(prefisso) ) return cor.info;
			cor=cor.next;
		}
		return null;
	}//personaDi
	public void salva(String nomeFile) throws IOException{
		PrintWriter pw=new PrintWriter( new FileWriter(nomeFile) );
		for( Nodo p=testa; p!=null; p=p.next )
			pw.println( p.info ); //si sfrutta il toString di Nominativo
		pw.close();
	}//salva
	
		public void ripristina(String nomeFile) throws IOException{
		testa=null; size=0;
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
			Nominativo n=new Nominativo(cog,nom,pre,tel);
			aggiungi( n );
		}
		br.close();
	}//ri
	public String toString(){
		String s="";
		Nodo cor=testa;
		while( cor!=null ){
			s += cor.info+"\n";
			cor=cor.next;
		}
		return s;
	}//toString
        
        public void visualizza(){
            Nodo cor=testa;
		while( cor!=null ){
                      JOptionPane.showMessageDialog(null,cor.info+"\n","Elencoooooooooo",JOptionPane.CLOSED_OPTION);
                cor=cor.next;
                }
        }
}//AgendinaConcatenata
