/*
 * CancellaDirectory.java
 *
 * Created on 19 maggio 2007, 19.28
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
import java.io.IOException;
public class CancellaDirectory {
   public static void main(String[]args)throws IOException{
      String sistOp="Linux";
       String tmp;
       String sep=File.separator;
      tmp=System.getProperty("os.name");
      if(tmp.equals(sistOp)){
          System.out.println("Sei su linux");
       }else{
           System.out.println("Non lo so e non vorrei sapere");
       }
      File myDir=new File("/home/luciano/virus");
      myDir.mkdir();
     File[]contenuto=myDir.listFiles();
   for(int i=0;i<contenuto.length;i++){
         if(contenuto[i].isDirectory()){
             String s=contenuto[i].getName();
             System.out.println(s);
           File nuova=new File(myDir+sep+s);
              File[]newcontenuto=nuova.listFiles();
              for(int j=0;j<newcontenuto.length;j++){
                  if(newcontenuto[j].isDirectory()){
                      s+=newcontenuto[j].getName();
                       File nuova1=new File(myDir+sep+s);
              File[]newcontenuto1=nuova.listFiles(); 
                  for(int k=0;k<newcontenuto.length;k++){
                  newcontenuto[k].delete();
                   nuova1.delete();
             
              
              
              
              
              
              
              
              
              
                  }
                  
                   
              }
              
                  newcontenuto[j].delete();
                
             nuova.delete();
              
         }
         }
         contenuto[i].delete();
        
      }
          
       myDir.delete();
       
      
   }
    
}
