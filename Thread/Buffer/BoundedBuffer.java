package Buffer;
import java.util.concurrent.Semaphore;
public class BoundedBuffer {
private int size;
private Item buffer[];
private int in;
private int out;
private int counter;
private Semaphore pieno;
private Semaphore empty;
private Semaphore mutex;

public BoundedBuffer(int size){
	this.size=size;
	buffer=new Item[size];
	in=0;
	out=0;
	counter=0;
	pieno=new Semaphore(size);
	empty=new Semaphore(size);
	mutex=new Semaphore(1);
	try{
		pieno.acquire(size);
		
	}catch(InterruptedException e){
		System.err.println(e);
	}
}
public void put(Item item){
	try{
		empty.acquire();
		mutex.acquire();
	}catch(InterruptedException e){
		System.err.println(e);
	}
	buffer[in]=item;
	in=(in+1)%size;
	counter++;
	mutex.release();
	pieno.release();
}

public Item get(){
	try{
		pieno.acquire();
		mutex.acquire();
	}catch(InterruptedException e){
		System.err.println(e);
	}
	Item item=buffer[out];
	out=(out+1)%size;
	counter--;
	mutex.release();
	empty.release();
	return item;
}
public int getCount(){
	return counter;
}

}
