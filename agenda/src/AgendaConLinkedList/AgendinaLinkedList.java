/*
 * AgendinaLinkedList.java
 *
 * Created on 7 maggio 2007, 17.09
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package AgendaConLinkedList;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.lang.*;
/**
 *
 * @author luciano
 */
public class AgendinaLinkedList extends Agendina{
    private LinkedList elenco=new LinkedList();
    
    public int size(){
        return elenco.size();
    }
    
    public void aggiungi(Nominativo n){
        int i=0;
        while(i<elenco.size()){
            Nominativo q=(Nominativo)elenco.get(i);
            if(q.compareTo(n)>=0)break;
            i++;
        }
        if(i<elenco.size()&&elenco.get(i).equals(n)){
            elenco.remove();
        }
        elenco.add(i,n);
    }
    
    public void rimuovi(String cog,String nom){
        Nominativo n=new Nominativo(cog,nom,"","");
        int i=elenco.indexOf(n);
        if(i==-1)return;
        elenco.remove(i);
    }
    
    public Nominativo telefonoDi(String cog,String nom){
        Nominativo n=new Nominativo(cog,nom,"","");
        int i=elenco.indexOf(n);
        if(i==-1)return null;
        return (Nominativo)elenco.get(i);
        
    }
    
    public Nominativo personaDi(String pre,String tel){
        Iterator it=elenco.iterator();
        while(it.hasNext()){
            Nominativo n=(Nominativo)it.next();
            if(n.getPrefisso().equals(pre)&&n.getTelefono().equals(tel))
                return n;
        }
        return null;
        
    }
    
    public void salva(String nomeFile)throws IOException{
        PrintWriter pw=new PrintWriter(new FileWriter(nomeFile));
        Iterator it=elenco.iterator();
        while(it.hasNext())
            pw.println(it.next());
        pw.close();
            
        
    }
    
    public void ripristina(String nomeFile)throws IOException{
        BufferedReader br=new BufferedReader(new FileReader(nomeFile));
        //elenco.clear();
        String linea=null;
        StringTokenizer st=null;
        String cog, nom, pre, tel;
        for(;;){
            linea=br.readLine();
            if(linea==null)break;
            st=new StringTokenizer(linea," -");
            cog=st.nextToken();
             nom=st.nextToken();
             pre=st.nextToken();
            tel=st.nextToken();
            Nominativo n=new Nominativo(cog,nom,pre,tel);
            elenco.add(n);
            
        }
        br.close();
        
    }
            
  
        
    
    
    public String toString(){
        String s="";
        Iterator it=elenco.iterator();
        while(it.hasNext()){
            s+=it.next()+"\n";
        }
        return s;
    }
      public void visualizza(){
        Iterator it=elenco.iterator();
        while(it.hasNext()){
            JOptionPane.showMessageDialog(null,it.next()+"\n","La mia agenda",JOptionPane.CLOSED_OPTION);
        }
    
      }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}







































