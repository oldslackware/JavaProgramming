package Buffer;

public class Producer extends Thread {
	private int id;
	private BoundedBuffer b;
	
	public Producer(int id,BoundedBuffer b){ 
		this.id=id;
		this.b=b;
	}
	public void run(){
		while(true){
			long waitingTime=(long)(Math.random()*1000+500);
			try{
				sleep(waitingTime);
			}catch(InterruptedException e){
				System.err.println(e);
			}
		int itemValue=(int)(Math.random()*1000);
		Item item=new Item(itemValue);
		System.out.println("Il Produttore "+id+" vuole inserire: "+item.getVallue());
		b.put(item);
		System.out.println("Il produttore "+id+" ha inserito: "+item.getVallue());
		
		}
	}
	
	
	
}
