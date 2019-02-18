/*
 * Created on 25-feb-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Elezione;
import utili.*;
/**
 * @author luciano
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class TestElezione {
	public static void main(String[]args){
		Scrutinio s=new Scrutinio(Console.readInt("Fornisci numero candidati"));
		s.spoglio();
		s.stampa();
	}

}
