/*
 * Agendina.java
 *
 * Created on 7 maggio 2007, 17.06
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package AgendaConLinkedList;
import java.io.*;
import java.util.*;
/**
 *
 * @author luciano
 */
    public abstract class Agendina{
	public abstract int size();
	public abstract void aggiungi( Nominativo n );
	public abstract void rimuovi( String cog, String nom );
	public abstract Nominativo telefonoDi( String cognome, String nome );
	public abstract Nominativo personaDi( String prefisso, String telefono );
	public abstract void salva(String nomeFile) throws IOException;
	public abstract void ripristina(String nomeFile) throws IOException;
        public abstract void visualizza();
}
