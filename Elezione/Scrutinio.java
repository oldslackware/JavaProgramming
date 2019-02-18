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
public class Scrutinio {
	private Candidato[]candidati;
	public static int bianche;
	public static int nulle;
	
	public Scrutinio(int n){
		do{
			if(n<=0){
				System.out.println("Deve esistere almeno un candidato");
			}
			
		}while(n<=0);
		this.candidati=new Candidato[n];
		for(int i=0;i<this.candidati.length;i++){
			this.candidati[i]=new Candidato(Console.readString("Immetti candidato"));
		}
	}//costruttore
	public void spoglio(){
		
		for(;;){//ciclo infinito che si arresta quando viene digitato stop
			String voto=Console.readString("Immetere nome candidato che si vuole votare");
			if(voto.equals("stop")){
				System.out.println("fine");
				break;
			}
			if(voto.equals(" ")){
				bianche++;
			}
			else{
				int k=0;
              for(int i=0;i<candidati.length;i++){
              	if(voto.equals(candidati[i].getNome())){
              		candidati[i].ImmettiVoto();
              	}
              	else{
                      k++;
              	}
              }
              if(k==candidati.length){
              	nulle++;
              }
			}
			
			
		}
	}
	public void GraduatoriaOrdinata(){
		for(int j=candidati.length-1;j>0;j--){
			for(int i=0;i<candidati.length;i++){
				if((candidati[i].getVoti())<candidati[i+1].getVoti()){
					candidati[i+4]=candidati[i];
					candidati[i]=candidati[i+1];
					candidati[i]=candidati[i+4];
				}
			}
		}
	}
	public void stampa(){
		for(int i=0;i<candidati.length;i++)
			System.out.println(candidati[i].getNome()+" ha ottenuto "+candidati[i].getVoti()+" voti");
	}

}
