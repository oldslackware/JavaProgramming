/*
 * BancaInterface.java
 *
 * Created on 8 maggio 2007, 20.34
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package MyBanca;

/**
 *
 * @author luciano
 */
import java.io.*;
public abstract class BancaInterface{
    
    public abstract int size();
public abstract void aggiungi(Cliente n);
public abstract void aggiungiNostroCliente(ClienteFidato n);
public abstract void rimuovi(String cog,String nom,String conto);
public abstract Cliente personaDi(String con);
public abstract Cliente contoDi(String cog,String nom);
public abstract Cliente deposita(String con,double ammontare);
public abstract void salva(String nomeFile) throws IOException;
public abstract void ripristina(String nomeFile)throws IOException,ClassNotFoundException;
    
}
