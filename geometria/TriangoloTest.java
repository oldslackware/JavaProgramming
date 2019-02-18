/*
 * Created on 24-feb-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package geometria;

import utili.Console;

/**
 * @author luciano
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class TriangoloTest {
	   public static void main( String []args ){
	   	System.out.println("\t\t\tInserisci ascissa e ordinata per il primo punto\n");
		  double ascissa=Console.readDouble("Inserisci ascissa\n");
		  double ordinata=Console.readDouble("Inserisci ordinata\n");
		  Punto p1=new Punto(ascissa,ordinata);
		  
		  System.out.println("\t\t\tInserisci ascissa e ordinata per il secondo punto\n");
		  ascissa=Console.readDouble("Inserisci ascissa\n");
		  ordinata=Console.readDouble("Inserisci ordinata\n");
		  Punto p2=new Punto(ascissa,ordinata);
		  
		  System.out.println("\t\t\tInserisci ascissa e ordinata per il primo punto\n");
		  ascissa=Console.readDouble("Inserisci ascissa\n");
		  ordinata=Console.readDouble("Inserisci ordinata\n");
		  Punto p3=new Punto(ascissa,ordinata);
		  
		  Triangolo t=new Triangolo(p1,p2,p3);
		   
		   System.out.println("perimetro="+t.perimetro()+" area="+t.area());
	   }//main

}
