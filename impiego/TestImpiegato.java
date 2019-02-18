/*
 * Created on 15-feb-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package impiego;

/**
 * @author luciano
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class TestImpiegato {
	public static void main(String[]args){
		Impiegati[]staff=new Impiegati[3];
		staff[0]=new Impiegati("John Smith ",75000,1987,12,15);
		staff[1]=new Impiegati("Michael Jordan ",15000,1985,01,02);
		staff[2]=new Impiegati("John Xinay ",125000,1980,8,10);
		//aumento il salario degl'impiegati del 10% e' il valore double passato ad Impiegati.rataSalario
		for (int i=0;i<staff.length;i++){
			staff[i].rataSalario(10);
		}
		//visualizzo tutte le informazioni relative agl'oggetti impiegato
		for(int i=0;i<staff.length;i++){
		System.out.println("L'impiegato"+staff[i].getNome()+"ha un salario di "+staff[i].getSalario()+"\ned e' stato assunto il "+staff[i].getAssunzioneGiorno()+"\n");
		}
		
		
	}

}
