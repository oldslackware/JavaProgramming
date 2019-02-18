/*
 * QuadratoECubo.java
 *
 * Created on October 8, 2007, 12:15 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esercizi;

/**
 *
 * @author frick
 */
import javax.swing.JOptionPane;
public class QuadratoECubo {
    public static void main(String[]args){

        int quadrato=0;
        int cubo=0;
        for(int n=0;n<=10;n++){
        quadrato=n*n;
        cubo=n*n*n;
   JOptionPane.showMessageDialog(null,"Numero-----Quadrato-----Cubo\n" + n +"-----------" + quadrato + "-----------" + cubo +"","Quadrato e cubo",JOptionPane.INFORMATION_MESSAGE);
        
        
        }
         
    }
    
}
