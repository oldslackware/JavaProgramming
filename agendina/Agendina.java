/*
 * Created on 4-mar-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package agendina;

/**
 * @author luciano
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
import java.io.*;
public abstract class Agendina {
public abstract int size();
public abstract void aggiungi(Nominativo n);
public abstract void rimuovi(String cognome,String nome);
public abstract Nominativo telefonoDi(String cognome,String nome);
public abstract Nominativo personaDi(String prefisso,String telefono);
public abstract void salva(String nomeFile)throws IOException;
public abstract void ripristina(String nomeFile)throws IOException;

}
