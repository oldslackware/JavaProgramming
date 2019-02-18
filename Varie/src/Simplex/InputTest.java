/*
 * InputTest.java
 *
 * Created on April 29, 2007, 11:50 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Simplex;
import java.util.*;
/**
 *
 * @author francesca
 */
public class InputTest {
    
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Inserire Nome");
        String nome=in.next();
        System.out.println("Inserire eta'");
        int anni=in.nextInt();
        anni++;
        System.out.println("Ciao "+nome+ " l'anno prossimo avrai  "+ anni + " anni :)");
    }
}
