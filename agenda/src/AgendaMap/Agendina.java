/*
 * Agendina.java
 *
 * Created on 7 maggio 2007, 12.42
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package AgendaMap;

/**
 *
 * @author luciano
 */
import java.io.*;
public abstract class Agendina {
    
public abstract int size();
public abstract void aggiungi(Nominativo n);
public abstract void rimuovi(String cog,String nom);
public abstract Nominativo personaDi(String pre,String tel);
public abstract Nominativo telefonoDi(String cog,String nom);
public abstract void salva(String nomeFile) throws IOException;
public abstract void ripristina(String nomeFile)throws IOException,ClassNotFoundException;
    
}
