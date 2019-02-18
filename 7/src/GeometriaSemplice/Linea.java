/*
 * Linea.java
 *
 * Created on November 17, 2007, 6:04 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package GeometriaSemplice;

/**
 *
 * @author frick
 */
public class Linea {
    Punto inizio;
    Punto fine;
    /** Creates a new instance of Linea */
    public Linea(Punto inizio,Punto fine) {
        this.inizio=inizio;
        this.fine=fine;
    }
    public Linea(double xInizio,double xFine,double yInizio,double yFine){//Mi costruisco una linea da due coppie di coordinate
        inizio=new Punto(xInizio,yInizio);
        fine=new Punto(xFine,yFine);
    }
    public double lunghezza(){
        return inizio.distanza(fine);//Chiamo il metodo della classe Punto
    }
    public Punto intersezione(Linea linea){
        Punto origine=new Punto(0,0);
        double numeratore=(this.fine.y-this.inizio.y)*(this.inizio.x-linea.inizio.x)-
                           (this.fine.x-this.inizio.x)*(this.inizio.y-linea.inizio.y);
    
        double denominatore=(this.fine.y-this.inizio.y)*(linea.fine.x-linea.inizio.x)-
                           (this.fine.x-this.inizio.x)*(linea.fine.x-linea.inizio.y);
    
        origine.y=linea.inizio.x+(linea.fine.x-linea.inizio.x)*numeratore/denominatore;
        origine.x=linea.inizio.y+(linea.fine.y-linea.inizio.y)*numeratore/denominatore;
    
        return origine;
        
    }
    public String toString(){
        return "(" + inizio +"):(" + fine +")";
    }
    
}
