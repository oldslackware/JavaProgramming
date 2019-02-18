package FabbricaCellulari;


public class TestFabbrica {

	public static void main(String [] argv) {
		int MAX_MACCHINARI = 3;
		int MAX_NASTRI = 3;
		int MAX_BUFFER = 12;
		Assemblatore assemblatore = new Assemblatore(MAX_BUFFER);
		Macchinari [] macchinari = new Macchinari[MAX_MACCHINARI];
		Nastri [] nastri = new Nastri[MAX_NASTRI];

		for (int i = 0; i < MAX_MACCHINARI; i++) {
			macchinari[i] = new Macchinari(assemblatore,i);
			macchinari[i].start();
		}

		for (int i = 0; i < MAX_NASTRI; i++) {
			nastri[i] = new Nastri(assemblatore,i);
			nastri[i].start();
		}
	}
}