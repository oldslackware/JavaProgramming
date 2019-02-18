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
public class BancaEseguibile {
	   public static void main( String [] args ){
		   ContoBancario c1=new ContoBancario("51/2233",2000);
		   ContoBancario c2=new ContoEsteso("53/1122",10000);
		   ContoEsteso c3=new ContoEsteso("53/1713",20000,0);
		   GestioneBanca b=new GestioneBanca();
		   b.aggiungiConto(c1);
		   b.aggiungiConto(c2);
		   b.aggiungiConto(c3);
		   System.out.println(b);
		   int i=b.indexOf( c1 );
		   b.rimuoviConto( i );
		   c2.preleva(10000);
		   c3.preleva(25000);
		   System.out.println("Abbiamo "+ b.size() +" clienti\n");
		   System.out.println(b);
	   }
	}//BancaEseguibile


