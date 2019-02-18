/*
 * GestioneFigureGeometriche.java
 *
 * Created on April 30, 2007, 4:55 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package FigureGeometriche;
import javax.swing.*;


/**
 *
 * @author francesca
 */
public class GestioneFigureGeometriche {
   public static void main(String []args){
       String scelta=JOptionPane.showInputDialog("Scrivere il nome della figura");
       if(scelta.equalsIgnoreCase("quadrato")){
           String lato=JOptionPane.showInputDialog("Inserire il lato del quadrato");
           double Mylato=Double.parseDouble(lato);
           Quadrato my=new Quadrato(Mylato);
           double perimetro=my.perimetro(Mylato);
           double area=my.area(Mylato);
           JOptionPane.showMessageDialog(null,"Il perimetro e' "+perimetro+".L'area e' "+area+ " ","QUADRATO",JOptionPane.CLOSED_OPTION);
           System.exit(0);
           }
       if(scelta.equalsIgnoreCase("rettangolo")){
           String mybase=JOptionPane.showInputDialog("Inserire la base del rettangolo");
           double base=Double.parseDouble(mybase);
           String myaltezza=JOptionPane.showInputDialog("Inserire l'altezza del rettangolo");
           double altezza=Double.parseDouble(myaltezza);
           Rettangolo rettangolo=new Rettangolo(base,altezza);
           double perimetro=rettangolo.perimetro(base,altezza);
           double area=rettangolo.area(base,altezza);
           JOptionPane.showMessageDialog(null,"Il perimetro e' "+perimetro+".L'area e' "+area+ " ","RETTANGOLO",JOptionPane.CLOSED_OPTION);
           System.exit(0);
       }
       if(scelta.equalsIgnoreCase("triangolo")){
           String mylato1=JOptionPane.showInputDialog("Inserire il primo lato del triangolo");
           double lato1=Double.parseDouble(mylato1);
           String mylato2=JOptionPane.showInputDialog("Inserire il secondo lato del triangolo");
           double lato2=Double.parseDouble(mylato2);
           String mylato3=JOptionPane.showInputDialog("Inserire il terzo lato del triangolo");
           double lato3=Double.parseDouble(mylato3);
           String mybase=JOptionPane.showInputDialog("Inserire la base del triangolo");
           double base=Double.parseDouble(mybase);
            String myaltezza=JOptionPane.showInputDialog("Inserire l'altezza del rettangolo");
           double altezza=Double.parseDouble(myaltezza);
           Triangolo triangolo=new Triangolo(lato1,lato2,lato3,base,altezza);
           double perimetro=triangolo.perimetro(lato1,lato2,lato3);
           double area=triangolo.area(base,altezza);
           JOptionPane.showMessageDialog(null,"Il perimetro e' "+perimetro+".L'area e' "+area+ " ","TRIANGOLO",JOptionPane.CLOSED_OPTION);
           System.exit(0);
       }
        if(scelta.equalsIgnoreCase("cerchio")){
           String myraggio=JOptionPane.showInputDialog("Inserire il raggio del cerchio");
           double raggio=Double.parseDouble(myraggio);
           Cerchio cerchio=new Cerchio(raggio);
           double perimetro=cerchio.perimetro(raggio);
           double area=cerchio.area(raggio);
           JOptionPane.showMessageDialog(null,"Il perimetro e' "+perimetro+".L'area e' "+area+ " ","CERCHIO",JOptionPane.CLOSED_OPTION);
           System.exit(0);
        }
       
       if(scelta.equalsIgnoreCase("cilindro")){
        String myraggio=JOptionPane.showInputDialog("Inserire il raggio del circonferanza del cilindro");
        double raggio=Double.parseDouble(myraggio);
        String myaltezza=JOptionPane.showInputDialog("Inserire l'altezza del cilindro");
        double altezza=Double.parseDouble(myaltezza);
        Cilindro cilindro=new Cilindro(raggio,altezza);
        double perimetro=cilindro.basiCilindro(raggio);
        double area=cilindro.area(raggio,altezza);
       JOptionPane.showMessageDialog(null,"Il perimetro di ciascuna circonferenza e'  "+perimetro+" .L'area e' "+area+ " ","CILINDRO",JOptionPane.CLOSED_OPTION);
           System.exit(0);
       
       }
        else{
           JOptionPane.showMessageDialog(null,"Figura Geometrica non disponibile ","ERRORE",JOptionPane.ERROR_MESSAGE);
           System.exit(0);
        }
   } 
    
   
    
}
