/*
 * Created on 19-feb-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Clonazione;
/**
 * @author luciano
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class TestClonazione {
public static void main(String[]args){
	try{
		Impiegato originale=new Impiegato("Demuru Luciano ",50000);
		originale.setAssunzioneGiorno(2005,4,16);
		Impiegato copia=originale.clone(originale);
		copia.rataSalario(10);
		copia.setAssunzioneGiorno(2006,4,16);
		System.out.println("Originale "+originale);
		System.out.println("Copia~Originale~Modificata "+copia);
	}
	catch(CloneNotSupportedException e){
		e.printStackTrace();
	}
	
		
	}
}
