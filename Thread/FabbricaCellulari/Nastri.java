package FabbricaCellulari;
import java.util.concurrent.Semaphore;
import java.util.LinkedList;
public class Nastri extends Thread{
	private Assemblatore assemblatore;
	private  int id;
	private int schedaId;
	private int coverId;
	private int tastieraId;

	

	public Nastri(Assemblatore assemblatore,int id){
		this.assemblatore=assemblatore;
		/*this.schedaId=schedaId;
		this.coverId=coverId;
		this.tastieraId=tastieraId;*/
		this.id=id;
	}
	public void attesa(int min,int max){
		int aspetta;
		try{
			aspetta=(min)+(int)(Math.random()*max);
			sleep(aspetta);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
    
	public void run(){
		while(true){
			
		
			int n= -1;
			if(id%2==0){
				System.out.println("IL NASTRO " +id+" VUOLE PRELEVARE LA SCHEDA "+n);
				n = assemblatore.estraiScheda();  
				//n=assemblatore.depositaScheda(n);
				attesa(3000,5000);

				System.out.println("IL NASTRO " +id+" HA PRELEVATO LA SCHEDA "+n);
				
		        }
			
			if(id%3==0){
				System.out.println("IL NASTRO " +id+" VUOLE PRELEVARE LA COVER "+n);
				n=assemblatore.estraiCover();
				//n=assemblatore.depositaCover(n);
				attesa(2000,3500);

				System.out.println("IL NASTRO " +id+" HA PRELEVATO LA COVER "+n);
				
			}
			
			else{
				System.out.println("IL NASTRO " +id+" VUOLE PRELEVARE LA TASTIERA "+n);
				n=assemblatore.estraiTastiera();
			//	n=assemblatore.depositaTastiera(n);
				attesa(300,500);

				System.out.println("IL NASTRO " +id+" HA PRELEVATO LA TASTIERA "+n);
				
				
			}
	
	}
	
	}
}
















