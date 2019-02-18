/*
 * MapAgendina.java
 *
 * Created on 7 maggio 2007, 12.41
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
import java.util.*;
import javax.swing.*;
import java.lang.*;
public class MapAgendina extends Agendina implements Serializable {

 private Map elenco=new HashMap();
 
 public int size(){
     return elenco.size();
 }
 public void aggiungi(Nominativo n){
     elenco.put(n,n);
 }
 public void rimuovi(String cog,String nom){
     elenco.remove(new Nominativo(cog,nom,"",""));
 }
 public Nominativo personaDi(String pre,String tel){
     Collection v=elenco.values();
     Iterator it=v.iterator();
     while(it.hasNext()){
         Nominativo n=(Nominativo)it.next();
         if(n.getPrefisso().equals(pre)&&n.getTelefono().equals(tel))
             return n;
     }
     return null;
 }
     public Nominativo telefonoDi(String cog,String nom){
         return (Nominativo)elenco.get(new Nominativo(cog,nom,"",""));
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
        oos.writeObject((Nominativo)it.next());
    }
}

public void ripristina(String nomeFile)throws IOException,ClassNotFoundException{
    ObjectInputStream ois=new ObjectInputStream(new FileInputStream(nomeFile));
    Nominativo n=new Nominativo();
    this.elenco=new HashMap();
    for(;;){
        try{
            n=(Nominativo)ois.readObject();
            
        }catch(IOException eof){break;}
            this.elenco.put(n,n);
        
    }
    
}


}

    

