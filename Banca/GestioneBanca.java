/*
 * Created on 28-feb-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Banca;

/**
 * @author luciano
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class GestioneBanca {
	   private ContoBancario []clientela;
	   private int size=0, capacita;
	   public GestioneBanca(){
	      this( 50 );
	   }
	   public GestioneBanca( int capacita ){
	      this.capacita=capacita;
	      clientela=new ContoBancario[capacita];
	   }
	   public int size(){ return size; }
	   public void aggiungiConto( ContoBancario cb ){
	      if( size==capacita ){
	         ContoBancario []vecchiaC=clientela; //alias
	         clientela=new ContoBancario[capacita*2];
	         System.arraycopy( vecchiaC, 0, clientela, 0, size );
	         capacita *= 2;
	      }
	      clientela[size]=cb; size++;
	   }//aggiungiConto
	   public void rimuoviConto( ContoBancario cb ){
	      rimuoviConto( indexOf( cb ) );
	   }//rimuoviConto
	   public void rimuoviConto( int i ){
	      if( i<0 || i>=size ) return;
	      for( int j=i+1; j<size; j++ )
	           clientela[j-1]=clientela[j];
	      size--;
	   }//rimuoviConto
	   public int indexOf( ContoBancario cb ){
	      for( int i=0; i<size; i++ )
	         if( clientela[i].equals( cb ) ) return i;
	      return -1;
	   }//indexOf
	   public ContoBancario getConto( int i ){
	      if( i<0 || i>=size ){
	         return null;
	      }
	      return clientela[i];
	   }//getConto
	   public String toString(){
		   String s="";
		   for( int i=0; i<size(); i++ ){
			   s+=clientela[i]+"\n";
		   }
		   return s;
	   }//toString
	   public void salva( String nomeFile ){
	   }//salva da terminare
	   public void carica( String nomeFile ){
	   }//carica da terminare
}

