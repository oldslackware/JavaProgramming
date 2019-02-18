/*
 * EsplorazionePercorso.java
 *
 * Created on 19 maggio 2007, 14.49
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ProprietaSistema;

/**
 *
 * @author luciano
*/
import java.util.Date;
import java.io.File;
public class EsplorazionePercorso {
    public static void main(String[]args){
    File myDir=new File("/");
    File[]contenuto=myDir.listFiles();
    if(contenuto!=null){
    System.out.println("Sono presenti "+contenuto.length+" elementi in "+myDir.getName());  
    for(int i=0;i<contenuto.length;i++){
        System.out.println(contenuto[i] +" e' di tipo "+ (contenuto[i].isDirectory() ? "directory" : "file")+" ed e' stato modificato "+new Date(contenuto[i].lastModified()));
    }
    
    
}else{
        System.out.println(myDir.getName()+" Non e' un percorso valido...");
}
    System.exit(0);
}
}