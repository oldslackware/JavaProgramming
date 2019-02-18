//file Razionale.java

package poo.razionali;

public class Razionale implements Comparable{
   private int numeratore, denominatore;
   private static int contatore=0;
   public Razionale( int num, int den ) throws DenominatoreNullo{//costruttore
      if( den==0 ) throw new DenominatoreNullo();
      int n=Math.abs( num ), d=Math.abs( den );
      int cd=mcd( n, d );
      numeratore=num/cd; denominatore=den/cd;
      if( denominatore<0 ){
         numeratore *= -1;
         denominatore *= -1;
      }
      contatore++;
   }
   public Razionale( Razionale r ){//costruttore di copia
      numeratore=r.numeratore;
      denominatore=r.denominatore;
      contatore++;
   }
   public int getNumeratore(){//metodo accessore
      return numeratore;
   }// getNumeratore
   public int getDenominatore(){//metodo accessore
      return denominatore;
   }//getDenominatore
   public Razionale add( Razionale r ) throws DenominatoreNullo{
      int mcm=r.denominatore*denominatore;
      int num=(mcm/denominatore)*numeratore +
                    (mcm/r.denominatore)*r.numeratore;
      int den=mcm;
      return new Razionale( num, den );
   }//add
   public Razionale sub( Razionale r ) throws DenominatoreNullo{
      int mcm=r.denominatore*denominatore;
      int num=(mcm/denominatore)*numeratore -
                    (mcm/r.denominatore)*r.numeratore;
      int den=mcm;
      return new Razionale( num, den );
   }//sub
   public Razionale mul( Razionale r ) throws DenominatoreNullo{
      return new Razionale( numeratore*r.numeratore,
                            denominatore*r.denominatore );
   }//mul
   public Razionale mul( int s ) throws DenominatoreNullo{
      return new Razionale( numeratore*s, denominatore );
   }//mul

   public Razionale div( Razionale r ) throws DenominatoreNullo{
      return new Razionale( numeratore*r.denominatore,
                            denominatore*r.numeratore );
   }//div
   private int mcd( int x, int y ){//metodo ad uso interno
     if( y==0 ) return x;
     return mcd( y, x%y );
   }//mcd
   public static int razionaliCreati(){ return contatore; }
   public String toString(){
      if( denominatore==1 ) return ""+numeratore;
      return ""+numeratore+"/"+denominatore;
   }//toString
   public boolean equals( Object o ){
      Razionale r=(Razionale)o;
      return numeratore==r.numeratore && denominatore==r.denominatore;
   }//equals
   public boolean maggioreDi( Razionale r ){
	   int mcm=(denominatore*r.denominatore)/mcd(denominatore,r.denominatore);
	   int n1=(mcm/denominatore)*numeratore;
	   int n2=(mcm/r.denominatore)*r.numeratore;
	   if( n1>n2 ) return true;
	   return false;
   }//maggioreDi
   public int compareTo( Object o ){
	   Razionale r=(Razionale)o;
	   int mcm=(denominatore*r.denominatore)/mcd(denominatore,r.denominatore);
	   int n1=(mcm/denominatore)*numeratore;
	   int n2=(mcm/r.denominatore)*r.numeratore;
	   if( n1<n2 ) return -1;
	   if( n1>n2 ) return +1;
	   return 0;
   }//compareTo
   protected void finalize(){ contatore--; }
}//Razionale

