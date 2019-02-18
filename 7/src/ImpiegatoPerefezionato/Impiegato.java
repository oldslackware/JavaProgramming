/*
 * Impiegato.java
 *
 * Created on November 19, 2007, 6:04 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ImpiegatoPerefezionato;
import java.util.*;
/**
 *
 * @author frick
 */
public class Impiegato {
   private static int id;
   private String cognome="Sconosciuto";
   private double salario;
   private static int nuovoId;
   public Impiegato(String cognome,double salario){
       this.cognome=cognome;
       this.salario=salario;
   }
   public Impiegato(double salario){
       //Chiamo il costruttore di sopra
       this("Impiegato "+nuovoId,salario);
   }
   public Impiegato(){ 
   }
   public String getCognome(){
       return cognome;
   }
   public double getSalario(){
       return salario;
   }
   public int getId(){ 
       return id;
   }
   //inizializzazione statica
   static{
   Random casuali=new Random();
   //Mi genero un id tra 0 e 999
   nuovoId=casuali.nextInt(1000);
   }
   //Inizializzo l'oggetto'
   static{
       id=nuovoId;
       nuovoId++;
   }
   
   
   
   
   
   
    
}
