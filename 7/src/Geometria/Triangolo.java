/*
 * Triangolo.java
 *
 * Created on November 13, 2007, 5:15 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Geometria;

/**
 *
 * @author frick
 */
import javax.swing.JOptionPane;
public class Triangolo {
    private Punto p1,p2,p3;
    public Triangolo(Punto p1,Punto p2,Punto p3) {
        if(p1.getX()==p2.getX()&&p2.getX()==p3.getX()
        ||p1.getX()!=p2.getX()&&p2.getX()!=p3.getX() &&
                Math.abs((p2.getY()-p1.getY())/(p2.getX()-p1.getX())
                -(p3.getY()-p2.getY())/(p3.getX()-p2.getX()))<1.0E-10){
            JOptionPane.showMessageDialog(null,"Triangolo Inesistente","Errore",JOptionPane.ERROR_MESSAGE);
            System.exit(-1);
        }
        this.p1=new Punto(p1);
        this.p2=new Punto(p2);
        this.p3=new Punto(p3);
    }
    
    public Triangolo(Triangolo t){
        p1=new Punto(t.p1);
        p2=new Punto(t.p2);
        p3=new Punto(t.p3);
    }
    public double perimetro(){
        return p1.distanza(p2)+p2.distanza(p3)+p3.distanza(p1);
    }
    
    
   public double area(){
       double s=this.perimetro()/2;
       double a=p1.distanza(p2);
       double b=p2.distanza(p3);
       double c=p3.distanza(p1);
       return Math.sqrt(s*(s-a)*(s-b)*(s-c));
   }
   
   public String toString(){
       return "Triangolo con vertici: "+p1+" "+p2+" "+p3;
   }
    
}
