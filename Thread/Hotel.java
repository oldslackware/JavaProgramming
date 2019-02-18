
import java.util.concurrent.locks.*;



public class Hotel {


	private Lock l;
	private Condition condition;

	private Taxi [] taxi;
	private int ng = 100;

	public Hotel(Taxi [] taxi) {
		this.taxi = taxi;
		l = new ReentrantLock();
		condition = l.newCondition();
	}

	private boolean mioTurno(Gruppo gr) {
		for (int i = 0; i < taxi.length; i++)
			if (!taxi[i].pieno())
				if (gr.getPersone()<=taxi[i].postiLiberi())
					if (gr.getDestinazione()==taxi[i].getDestinazione() || taxi[i].getDestinazione()==-1)
						return true;

		return false;
	}

	public Taxi richiediTaxi(Gruppo gr) {
		Taxi t = null;
		l.lock();
		try {
			while(!mioTurno(gr))
				condition.await();
			int i = 0;
			boolean flag = false;
			for (; i < taxi.length; i++) {
				flag = taxi[i].occupa(gr.getPersone(), gr.getDestinazione());
				if (flag) break;
			}
			if (taxi[i].pieno()) condition.signalAll();
			t = taxi[i];
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			l.unlock();
			return t;
		}
	}

	public void parti(int id) {
		l.lock();
		try {
			while(!taxi[id].pieno())
				condition.await();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			l.unlock();
		}
	}

	public void parcheggia(int id) {
		l.lock();
		try {
			taxi[id].arrivo();
			condition.signalAll();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			l.unlock();
		}
	}

	public static void main(String [] args) {
		Taxi [] tx = new Taxi[5];
		Hotel hotel = new Hotel(tx);
		for (int i = 0; i < tx.length; i++) {
			tx[i] = new Taxi(hotel, i);
			tx[i].start();
		}

		Gruppo [] gruppo = new Gruppo[100];

		for (int i = 0; i < gruppo.length; i++) {
			gruppo[i] = new Gruppo(hotel, i);
			gruppo[i].start();
		}
	}

}

class Taxi extends Thread {

	public static int AREOPORTO = 0;
	public static int PORTO = 1;
	public static int STAZIONE = 2;

	private int CAPIENZA = 4;

	private int id;
	private int destinazione = -1;
	private int persone = 0;
	private boolean stato = false;

	private Hotel hotel;

	public Taxi(Hotel hotel, int id) {
		this.id = id;
		this.hotel = hotel;
	}

	public void attesa(int min, int max) {

		try {
			sleep(min+(int)(Math.random()*max));
		}

		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		try {
			while(true) {
				System.out.println("Il taxi n. "+id+" e' in attesa di clienti..");
				hotel.parti(id);
				System.out.println("Il taxi n. "+id+" e' partito "+destinazione(destinazione));
				attesa(2000,4000);
				hotel.parcheggia(id);
				System.out.println("Il taxi n. "+id+" ha parcheggiato nello 'hotel...");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean pieno() {
		return stato;
	}


	public int getDestinazione() {
		return destinazione;
	}

	public int postiLiberi() {
		return CAPIENZA-persone;
	}

	public void arrivo() {
		destinazione = -1;
		persone = 0;
		stato = false;
	}

	public boolean occupa(int n, int dest) {
		if (persone+n > CAPIENZA) return false;
		if (destinazione == -1) destinazione = dest;
		persone += n;
		if (persone == CAPIENZA) stato = true;
		return true;
	}

	private String destinazione(int n) {
		switch (n) {
			case 0 : return "per l' aereoporto";
			case 1 : return "per il porto";
			case 2 : return "per la stazione";
		}
		return "";
	}

}


class Gruppo extends Thread {

	private int id;
	private Hotel hotel;
	private int nPers;
	private int destinazione;

	public Gruppo(Hotel hotel, int id) {
		this.hotel = hotel;
		this.id = id;
		nPers = (int)(Math.random()*4)+1;
		destinazione = (int)(Math.random()*3);
	}

	public void attesa(int min, int max) {
		try {

			sleep(min+(int)(Math.random()*max));

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void run() {
		try {
			attesa(2000,4000);
			hotel.richiediTaxi(this);
			System.out.println("Il gruppo n. "+id+" e' giunto a destinazione..");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getDestinazione() {
		return destinazione;
	}

	public int getPersone() {
		return nPers;
	}



}