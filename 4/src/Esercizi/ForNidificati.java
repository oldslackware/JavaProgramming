/*
 * ForNidificati.java
 *
 * Created on October 16, 2007, 10:12 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esercizi;

/**
 *
 * @author frick
 */
public class ForNidificati {
    public static void main(String[]args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=3;j++){
                for(int k=1;k<=4;k++){
                    System.out.print('*');
                }
                System.out.println("Fine ciclo k");
            
            }
            System.out.println("Fine ciclo j");
            
    }
        System.out.println("Fine ciclo i");
    
}
}