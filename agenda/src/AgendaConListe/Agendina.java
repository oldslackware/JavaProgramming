/*
 * Agendina.java
 *
 * Created on 6 maggio 2007, 22.56
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package AgendaConListe;

/**
 *
 * @author luciano
 */

    


import java.io.*;
public abstract class Agendina{
	public abstract int size();
	public abstract void aggiungi( Nominativo n );
	public abstract void rimuovi( String cog, String nom );
	public abstract Nominativo telefonoDi( String cognome, String nome );
	public abstract Nominativo personaDi( String prefisso, String telefono );
	public abstract void salva(String nomeFile) throws IOException;
	public abstract void ripristina(String nomeFile) throws IOException;
        public abstract void visualizza();
}//Agendina