/*
 * AgendinaSuArray.java
 *
 * Created on 6 maggio 2007, 13.38
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Myagenda;
import java.io.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author luciano
 */
public class AgendinaSuArray {
    private int size;//numero effettivo elementi
    private Nominativo[]elenco;
    private int n;//dimensione dell'array
    
    public AgendinaSuArray() {
        this.elenco=new Nominativo[100];
        size=0;
    }
    public AgendinaSuArray(int n){
        this.n=n;
        elenco=new Nominativo[n];
        size=0;
        }
    public int size(){
        return size;
    }
    public void rialloca(){
       Nominativo []nuovoElenco=new Nominativo[n*2];
       System.arraycopy(elenco,0,nuovoElenco,0,size);
       n=n*2;
       elenco=nuovoElenco;
        }
    public void aggiungi(Nominativo n){
        if(size==this.n)
            rialloca();
        int i=0;
        while(i<size&&elenco[i].compareTo(n)<0)i++;
        //se e' gia presente sovrascrivi
        if(i<size&&elenco[i].equals(n)){
            elenco[i]=n;return;
        }
        //Fai scorrere gli elementi di una posizione a destra
     for( int j=size-1; j>=i; j-- )
            elenco[j+1]=elenco[j];
        //aggiungi
        elenco[i]=n;
        //conta questa aggiunta
        size++;
   
        
    }
    public void rimuovi(String cog,String nom){
        Nominativo n=new Nominativo(cog,nom,"","");
        int i=ricercaBinaria(n);
        if(i==-1){
            return;
        }
        //fai scorrere gli elementi di una posizione a destra
        for(int j=i+1;j<size;j++)
        elenco[j-1]=elenco[j];
        size--;//conta questa rimozione;
   }
    
    protected int ricercaBinaria(Nominativo n){
        	int inf=0, sup=size-1;
		while( inf<=sup ){
			int med=(inf+sup)/2;
			int esito=elenco[med].compareTo(n);
			if( esito==0 ) return med;
			if( esito>0 ) sup=med-1;
			else inf=med+1;
		}
		return -1;
	
    }
    
    
    public Nominativo telefonoDI(String cog,String nom){
        Nominativo n=new Nominativo(cog,nom,"","");
        int i=ricercaBinaria(n);
        if(i==-1){
            return null;
        }
        return elenco[i];
    }
    
    
    public Nominativo personaDi(String pref,String tel){
        for(int i=0;i<size;i++)
            if(elenco[i].getPrefisso().equals(pref)&&elenco[i].getNumeTelefono().equals(tel))
                return elenco[i];
        return null;
        
    }
        
    public void visualizza(){// JOptionPane.showMessageDialog(null,agenda,"Elenco",JOptionPane.CLOSED_OPTION);
        //String s="";
        for(int i=0;i<size;i++)
      JOptionPane.showMessageDialog(null,elenco[i].toString()+"\n","Elencoooooooooo",JOptionPane.CLOSED_OPTION);//elenco[i]+"\n";//elenco[i] e' il toString di Nominativo'
       
    }
    public String toString(){
		String s="";
		for( int i=0; i<size; i++ )
			s += elenco[i]+"\n";
		return s;
	}
    
    public void salva(String nomeFile)throws IOException{
        PrintWriter pw=new PrintWriter(new FileWriter(nomeFile));
        for(int i=0;i<size;i++)
            pw.println(elenco[i].toString());
        pw.close();
        
    }
    
    public void ripristina(String nomeFile)throws IOException,ClassNotFoundException{
        //elenco=new Nominativo[n]; size=0;
		BufferedReader br=new BufferedReader( new FileReader(nomeFile));
		String linea=null;
		StringTokenizer st=null;
		String cog, nom, pre, tel;
		for(;;){
			linea=br.readLine();
			if( linea==null ) break; //fine file
			st=new StringTokenizer(linea, " -");
			cog=st.nextToken(); nom=st.nextToken();
			pre=st.nextToken(); tel=st.nextToken();
			Nominativo n=new Nominativo( cog, nom, pre, tel );
			aggiungi( n );
                       
		}
		br.close();
	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
