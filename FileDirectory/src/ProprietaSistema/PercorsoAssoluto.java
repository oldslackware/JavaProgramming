/*
 * PercorsoAssoluto.java
 *
 * Created on 18 maggio 2007, 17.47
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
public class PercorsoAssoluto {
    
  public static void main(String[]args){
      
      String tmp;
      String file;
      System.out.println("Inserire file da cercare");
      Scanner cerca=new Scanner(System.in);
      file=cerca.nextLine();
      tmp=System.getProperty("user.home");
      
      System.out.println("Il tuo percorso assoluto e' "+tmp);
      //file="italianciao";
      String sep=File.separator;
      System.out.println("Sto cercando il file....");
      System.out.println(tmp+sep+file);
     File my=new File(tmp+sep+file);
     if(my.exists()){
         System.out.println("Ho trovato il file");
        // my.delete();
     }
     else{
         System.out.println("Non ho trovato il file");
     }
     
  }
    
}
