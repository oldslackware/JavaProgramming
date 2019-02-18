package Buffer;

public class Consumer extends Thread{
	private int id;
	private BoundedBuffer b;
	
	public Consumer(int id,BoundedBuffer b){
		this.id=id;
		this.b=b;
	}
	
	public void run(){
		while(true){
			long waitingTime=(long)(Math.random()*1000+300);
			try{
				sleep(waitingTime);
			}catch(InterruptedException e){
				System.err.println(e);
			}
		System.out.println("Il consumatore " +id+ " vuole prelevare un item");
		Item item=b.get();
		System.out.println("Il consumatore "+id+ " ha prelevato :"+item.getVallue());
		
		}
		
	}

}
