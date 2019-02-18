/*
 * Created on 24-feb-2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package geometria;

/**
 * @author luciano
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Punto {
	   private double x, y;
	   public Punto(){//costruttore di default
	      x=0; y=0;
	   }
	   public Punto( double x, double y ){//costruttore normale
	      this.x=x; 
	      this.y=y;
	   }
	   public Punto( Punto p ){//costruttore di copia
	      x=p.x; y=p.y;
	   }
	   public double getX(){ 
	   	return x; 
	   	}
	   public double getY(){
	   	return y; 
	   	}
	   public void sposta( double nuovaX, double nuovaY ){
	      x=nuovaX; 
	      y=nuovaY;
	   }//sposta
	   public double distanza( Punto p ){
	      return Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));
	   }//distanza
	   public String toString(){
	      return "<"+x+","+y+">";
	   }//toString
	   public boolean equals( Object p ){
	      if( !(p instanceof Punto) ) return false;
	      Punto pt=(Punto)p;
	      return x==pt.x && y==pt.y;
	   }//equals
	}//Punto
