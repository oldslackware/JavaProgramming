//file Banca.java

package poo.banca;

public class Banca{
   private ContoBancario []clientela;
   private int size=0, capacita;
   public Banca(){
      this( 50 );
   }
   public Banca( int capacita ){
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
   }//salva
   public void carica( String nomeFile ){
   }//carica
   public static void main( String [] args ){
	   ContoBancario c1=new ContoBancario("51/2233",2000);
	   ContoBancario c2=new ContoEsteso("53/1122",10000);
	   ContoEsteso c3=new ContoEsteso("53/1713",20000);
	   Banca b=new Banca();
	   b.aggiungiConto(c1);
	   b.aggiungiConto(c2);
	   b.aggiungiConto(c3);
	   System.out.println(b);
	   int i=b.indexOf( c2 );
	   b.rimuoviConto( i );
	   System.out.println(b);
   }
}//Banca
