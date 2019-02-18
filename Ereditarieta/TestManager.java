/*
 * Created on 18-feb-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Ereditarieta;

/**
 * @author luciano
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

public class TestManager {
	public static void main(String[]args){
		Manager boss=new Manager("Demuru Luciano ",80000,2005,12,15);
		boss.setBonus(2000);
		
		Impiegato[]staff=new Impiegato[3];
		staff[0]=boss;
		staff[1]=new Impiegato("Michael Jordan ",15000,1985,01,02);
		staff[2]=new Impiegato("John Xinay ",125000,1980,8,10);
		//visualizzo tutte le informazioni relative agli oggetti Impiegato
		//Per l'oggetto staff[0] che e' di tipo Manager viene richiamato il metodo getsalrio()
		//della classe Manager che e' incrementato dal bonus
		for(int i=0;i<staff.length;i++){
			System.out.println("L'impiegato "+staff[i].getNome()+"ha un salario di "+staff[i].getSalario()+"\ned e' stato assunto il "+staff[i].getAssunzioneGiorno()+"\n");
			}
	}
	

}
