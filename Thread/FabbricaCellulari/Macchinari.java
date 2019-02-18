package FabbricaCellulari;
import java.util.concurrent.Semaphore;
import java.util.LinkedList;
public class Macchinari extends Thread{
	private Assemblatore assemblatore;
	private static int id;
	private int schedaId;
	private int coverId;
	private int tastieraId;
	
	public Macchinari(Assemblatore assemblatore,int id){
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
			int n=(int)(Math.random()*100);
			if(n%2==0){
				id=2;
				System.out.println("IL MACCHINARIO " +id+" VUOLE INSERIRE LA SCHEDA "+n);
				assemblatore.insScheda(n);
				attesa(3000,5000);

				System.out.println("IL MACCHINARIO " +id+" HA INSERITO LA SCHEDA "+n);
		        }
			
			if(n%3==0){
				id=3;
				System.out.println("IL MACCHINARIO " +id+" VUOLE INSERIRE LA COVER "+n);
				assemblatore.insCover(n);
				attesa(2000,3500);

				System.out.println("IL MACCHINARIO " +id+" HA INSERITO LA COVER "+n);
			}
			
			else{
				id=1;
				System.out.println("IL MACCHINARIO " +id+" VUOLE INSERIRE LA TASTIERA "+n);
				assemblatore.insTastiera(n);
				attesa(300,500);

				System.out.println("IL MACCHINARIO " +id+" HA INSERITO LA TASTIERA "+n);
			}
		}
	}
	}
