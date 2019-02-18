/*
 * Giorno.java
 *
 * Created on November 20, 2007, 3:12 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Calendario;

/**
 *
 * @author frick
 */
public class Giorno {
  private int numeroGiorno;
  
  public Giorno(int numeroGiorno){
      this.numeroGiorno=numeroGiorno;
  }
  
  public Giorno(Giorno g){
      numeroGiorno=g.numeroGiorno;
  }
  
  public String toString(){
      switch(numeroGiorno%7){
      case 0:return "Domenica";
      case 1:return "Lunedi";
      case 2:return "Martedi";
      case 3:return "Mercoledi";
      case 4:return "Giovedi";
      case 5:return "Venerdi";
      default:return "Sabato";
      }
  }
  

  
  
  
  
  
  
  
  
  
}
