package FabbricaCellulari;
import java.util.concurrent.Semaphore;
import java.util.LinkedList;
public class Assemblatore {
private int max;
private LinkedList<Integer> scheda;
private LinkedList<Integer> tastiera;
private LinkedList<Integer> cover;
private Semaphore mutex;
private Semaphore empty_scheda;
private Semaphore empty_cover;
private Semaphore empty_tastiera;
private Semaphore full_scheda;
private Semaphore full_cover;
private Semaphore full_tastiera;

public Assemblatore(int max){
	this.max=max;
	mutex=new Semaphore(1);
	empty_scheda=new Semaphore(max);
	empty_cover=new Semaphore(max);
	empty_tastiera=new Semaphore(max);
	full_scheda=new Semaphore(max);
	full_cover=new Semaphore(max);
	full_tastiera=new Semaphore(max);
	scheda=new LinkedList<Integer>();
	cover=new LinkedList<Integer>();
	tastiera=new LinkedList<Integer>();
	try{
		full_scheda.acquire();
		full_cover.acquire();
		full_tastiera.acquire();
	}catch(InterruptedException e){
		e.printStackTrace();
	}
}
public void insScheda(int n){
	try{
		empty_scheda.acquire();
		mutex.acquire();
		scheda.add(new Integer(n));
	}catch(InterruptedException e){
		e.printStackTrace();
	}finally{
		mutex.release();
		full_scheda.release();
	}
		}

public void insCover(int n){
	try{
		empty_cover.acquire();
		mutex.acquire();
		cover.add(new Integer(n));
	}catch(InterruptedException e){
		e.printStackTrace();
	}finally{
		mutex.release();
		full_cover.release();
	}
		}


public void insTastiera(int n){
	try{
		empty_tastiera.acquire();
		mutex.acquire();
		tastiera.add(new Integer(n));
	}catch(InterruptedException e){
		e.printStackTrace();
	}finally{
		mutex.release();
		full_tastiera.release();
	}
		}

public int estraiScheda(){
	int n=-1;
	try{
		full_scheda.acquire();
		mutex.acquire();
		n=scheda.removeFirst().intValue();
	}catch(InterruptedException e){
		e.printStackTrace();
	}finally{
		mutex.release();
		empty_scheda.release();
	}
	return n;
}

public int estraiCover(){
	int n=-1;
	try{
		full_cover.acquire();
		mutex.acquire();
		n=cover.removeFirst().intValue();
	}catch(InterruptedException e){
		e.printStackTrace();
	}finally{
		mutex.release();
		empty_cover.release();
	}
	return n;
}

public int estraiTastiera(){
	int n=-1;
	try{
		full_tastiera.acquire();
		mutex.acquire();
		n=tastiera.removeFirst().intValue();
	}catch(InterruptedException e){
		e.printStackTrace();
	}finally{
		mutex.release();
		empty_tastiera.release();
	}
	return n;
}/*
public int depositaScheda(int n){
	return n;
}
public int depositaCover(int m){
	return m;
}
public int depositaTastiera(int o){
	return o;
}
public void Costruisci(int n,int m,int o){
	System.out.println("Costruito");
}*/
}

