/*
 * Created on 19-feb-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Interfaccie;

/**
 * @author luciano
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
import java.util.*;
public class TestImpiegatiOrdinati {
	public static void main(String[]args){
		Impiegato[]staff=new Impiegato[3];
		staff[0]=new Impiegato("Demuru Luciano",80000);
		staff[1]=new Impiegato("Di Mare Francesca",95000);
		staff[2]=new Impiegato("Demuru Mario",82000);
		Arrays.sort(staff);
		for(int i=0;i<staff.length;i++){
			System.out.println("L'impiegato "+staff[i].getNome()+" ,percepisce un salario di " +staff[i].getSalario()+"\n");
		}
		
	}

}
