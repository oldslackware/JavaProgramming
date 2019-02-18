/*
 * CancellaFile.java
 *
 * Created on 19 maggio 2007, 14.32
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ProprietaSistema;
/**
 *
 * @author luciano
 */
import java.util.*;
import java.io.File;
import java.lang.*;
public class CancellaFile {
  public static void main(String[]args){
      String tmp;
      String file;
      System.out.println("Inserire file da eliminare");
      Scanner cerca=new Scanner(System.in);
      file=cerca.nextLine();
      tmp=System.getProperty("user.home");
      
      System.out.println("Il tuo percorso assoluto e' "+tmp);
      String sep=File.separator;
      System.out.println("Sto cercando il file....");
      System.out.println(tmp+sep+file);
     File my=new File(tmp+sep+file);
     if(my.exists()){
         System.out.println("Ho trovato il file e adesso lo cancello");
        my.delete();
        System.out.println(my+" e' stato eliminato");
     }
     else{
         System.out.println("Non ho trovato il file");
     }
    
}
}