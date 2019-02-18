/*
 * DirectotyPercorsoAssoluto.java
 *
 * Created on 19 maggio 2007, 14.37
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ProprietaSistema;

/**
 *
 * @author luciano
 */
import java.io.File;
import java.util.*;
import java.lang.*;
public class DirectotyPercorsoAssoluto {
    public static void main(String[]args){
        File[]radice=File.listRoots();
        //
        for(int i=0;i<radice.length;i++)
            System.out.println("Ecco il tuo percorso assoluto: "+radice[i]);
    }
    
    
}
