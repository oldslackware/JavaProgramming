//Elezione.java

package poo.elezione;
import java.io.*;

public abstract class Elezione{
	public abstract int faiScrutinio( String nomeFile ) throws IOException;
	public abstract String toString();
}//Elezione