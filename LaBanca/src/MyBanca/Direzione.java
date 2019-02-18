/*
 * Direzione.java
 *
 * Created on 8 maggio 2007, 19.34
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
import java.util.*;
import javax.swing.*;
import java.lang.*;
public class Direzione extends BancaInterface implements Serializable{
    private Map elenco=new HashMap();
    private double bilancio;
     public int size(){
     return elenco.size();
 }
     
      public void aggiungi(Cliente n){
     elenco.put(n,n);
    
}
      public void aggiungiNostroCliente(ClienteFidato n){
      elenco.put(n,n);
      }
public void rimuovi(String cog,String nom,String conto){
     elenco.remove(new Cliente(cog,nom,conto,0));
 }
 public Cliente personaDi(String con){
     Collection v=elenco.values();
     Iterator it=v.iterator();
     while(it.hasNext()){
         Cliente n=(Cliente)it.next();
         if(n.getNumeroConto().equals(con))
             return n;
     }
     return null;
 }

    public Cliente contoDi(String cog,String nom){
          Collection v=elenco.values();
     Iterator it=v.iterator();
     while(it.hasNext()){
         Cliente n=(Cliente)it.next();
         if(n.getCognome().equals(cog)&&n.getNome().equals(nom))
         return n;
    }
     return null;
    }

    public Cliente deposita(String con,double ammontare) {
      // return (Cliente).deposita(cog,ammontare);
    
        Collection v=elenco.values();
     Iterator it=v.iterator();
     while(it.hasNext()){
         Cliente n=(Cliente)it.next();
    if(n.getNumeroConto().equals(con))
        return n;
     }
     return null;
    }
   
      public String toString(){
         Map m=new TreeMap(elenco);
         String s="";
         Iterator it=m.values().iterator();
         while(it.hasNext()){
             s+=it.next()+"\n";
         }
        return s; 
     }
      
      public void salva(String nomeFile)throws IOException{
    ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(nomeFile));
    Iterator it=this.elenco.values().iterator();
    while(it.hasNext()){
        oos.writeObject((Cliente)it.next());
    }
}
      public void ripristina(String nomeFile)throws IOException,ClassNotFoundException{
    ObjectInputStream ois=new ObjectInputStream(new FileInputStream(nomeFile));
    Cliente n=new Cliente();
    this.elenco=new HashMap();
    for(;;){
        try{
            n=(Cliente)ois.readObject();
            
        }catch(IOException eof){break;}
            this.elenco.put(n,n);
        
    }
    
}
    
    

}
