/*
 * Trigoniometria.java
 *
 * Created on April 29, 2007, 5:38 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Mathematic;
import javax.swing.*;
/**
 *
 * @author francesca
 */
public class Trigoniometria {
    public static void main(String[]args){
    String numero=JOptionPane.showInputDialog("Inserisci l'angolo");
    double angolo1=Double.parseDouble(numero);
    double angolo=Math.toRadians(angolo1);
    double seno=Math.sin(angolo);
    double coseno=Math.cos(angolo);
    double arcoseno=Math.asin(angolo);
    double arcocoseno=Math.acos(angolo);
    double tangente=Math.tan(angolo);
    double arcotangente=Math.atan(angolo);
    JOptionPane.showMessageDialog(null,"Il seno di " +angolo1+" e' "+seno+"","Messaggio",JOptionPane.CLOSED_OPTION);
    JOptionPane.showMessageDialog(null,"Il coseno di " +angolo1+" e' "+coseno+"","Messaggio",JOptionPane.CLOSED_OPTION);
    JOptionPane.showMessageDialog(null,"L'arcoseno di " +angolo1+" e' "+arcoseno+"","Messaggio",JOptionPane.CLOSED_OPTION);
    JOptionPane.showMessageDialog(null,"L'arcocoseno di " +angolo1+" e' "+arcocoseno+"","Messaggio",JOptionPane.CLOSED_OPTION);
    JOptionPane.showMessageDialog(null,"La tangente di " +angolo1+" e' "+tangente+"","Messaggio",JOptionPane.CLOSED_OPTION);
    JOptionPane.showMessageDialog(null,"L'arcotangente " +angolo1+" e' "+arcotangente+"","Messaggio",JOptionPane.CLOSED_OPTION);
    System.exit(0);
}
}