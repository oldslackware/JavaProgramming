//file TR.java

import poo.razionali.*;
import poo.inout.*;

public class TR{
   static String linea;
   static int i;
   static Razionale leggiRazionale() throws DenominatoreNullo {
      if( linea.charAt( i )=='(' ){
        i++; Razionale r=valuta(); i++; return r;
      }
      int j=linea.indexOf('/',i);
      int num=Integer.parseInt( linea.substring(i,j) );
      j++;//salta /
      i=j;
      while( j<linea.length() &&
             '0'<=linea.charAt(j) && linea.charAt(j)<='9' ) j++;
      int den=Integer.parseInt( linea.substring(i,j) );
      i=j;
      return new Razionale( num, den );
   }//leggiRazionale
   static Razionale valuta() throws DenominatoreNullo {
      Razionale ris=leggiRazionale();
      for(;;){
         if( i==linea.length() || linea.charAt(i)==')' ) break;
         char op=linea.charAt(i); i++;
         Razionale r=leggiRazionale();
         switch( op ){
            case '+': ris=ris.add(r); break;
            case '-': ris=ris.sub(r); break;
            case '*': ris=ris.mul(r); break;
            case ':': ris=ris.div(r); break;
            default: System.out.println("Operatore illegale");
                     System.exit(-1);
         }
      }
      return ris;
   }//valuta
   public static void main( String []args ) throws DenominatoreNullo {
      System.out.println("Fornisci una espressione di razionali");
      linea=Console.readString();
      if( linea==null || linea.length()==0 ) System.exit(0);
      i=0;
      Razionale ris=valuta();
      System.out.println("Risultato="+ris);
   }//main
}//TR

