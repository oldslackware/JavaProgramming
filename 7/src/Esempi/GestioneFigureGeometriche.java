/*
 * GestioneFigureGeometriche.java
 *
 * Created on November 10, 2007, 6:40 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esempi;

/**
 *
 * @author frick
 */
import javax.swing.JOptionPane;
public class GestioneFigureGeometriche {
public static void main(String[]args){
    String fine="end";
    String scelta;
    do{
           scelta=JOptionPane.showInputDialog("Scrivere il nome della figura\nDigitare end per uscire");
       if(scelta.equalsIgnoreCase("quadrato")){
           String lato=JOptionPane.showInputDialog("Inserire il lato del quadrato");
           double Mylato=Double.parseDouble(lato);
           Quadrato my=new Quadrato(Mylato);
           double perimetro=my.perimetro(Mylato);
           double area=my.area(Mylato);
           JOptionPane.showMessageDialog(null,"Il perimetro e' "+perimetro+".\nL'area e' "+area+ " ","QUADRATO",JOptionPane.CLOSED_OPTION);
           continue;
           }
       if(scelta.equalsIgnoreCase("rettangolo")){
           String mybase=JOptionPane.showInputDialog("Inserire la base del rettangolo");
           double base=Double.parseDouble(mybase);
           String myaltezza=JOptionPane.showInputDialog("Inserire l'altezza del rettangolo");
           double altezza=Double.parseDouble(myaltezza);
           Rettangolo rettangolo=new Rettangolo(base,altezza);
           double perimetro=rettangolo.perimetro(base,altezza);
           double area=rettangolo.area(base,altezza);
           JOptionPane.showMessageDialog(null,"Il perimetro e' "+perimetro+".\nL'area e' "+area+ " ","RETTANGOLO",JOptionPane.CLOSED_OPTION);
           continue;
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
           Triangolo triangolo=new Triangolo(lato1,lato2,lato3);
           double perimetro=triangolo.perimetro(lato1,lato2,lato3);
           double area=triangolo.area(base,altezza);
           JOptionPane.showMessageDialog(null,"Il perimetro e' "+perimetro+".\nL'area e' "+area+ " ","TRIANGOLO",JOptionPane.CLOSED_OPTION);
           continue;
       }
        if(scelta.equalsIgnoreCase("circonferenza")){
           String myraggio=JOptionPane.showInputDialog("Inserire il raggio della circonferenza");
           double raggio=Double.parseDouble(myraggio);
           Circonferenza cerchio=new Circonferenza(raggio);
           double perimetro=cerchio.perimetro(raggio);
           double area=cerchio.area(raggio);
           JOptionPane.showMessageDialog(null,"Il perimetro e' "+perimetro+".\nL'area e' "+area+ " ","CIRCONFERENZA",JOptionPane.CLOSED_OPTION);
           continue;
        }
       
       if(scelta.equalsIgnoreCase("cilindro")){
        String myraggio=JOptionPane.showInputDialog("Inserire il raggio del circonferanza del cilindro");
        double raggio=Double.parseDouble(myraggio);
        String myaltezza=JOptionPane.showInputDialog("Inserire l'altezza del cilindro");
        double altezza=Double.parseDouble(myaltezza);
        Cilindro cilindro=new Cilindro(raggio,altezza);
        double perimetro=cilindro.perimetro(raggio);
        double area=cilindro.area(raggio,altezza);
       JOptionPane.showMessageDialog(null,"Il perimetro di ciascuna circonferenza e'  "+perimetro+" .\nL'area e' "+area+ " ","CILINDRO",JOptionPane.CLOSED_OPTION);
           continue;
       
       }
        else{
           JOptionPane.showMessageDialog(null,"Figura Geometrica non disponibile ","ERRORE",JOptionPane.ERROR_MESSAGE);
           continue;
        }
    
    }while(!scelta.equalsIgnoreCase(fine));
    }
}
