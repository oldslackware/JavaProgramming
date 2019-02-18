/*
 * MyRam.java
 *
 * Created on 21 maggio 2007, 1.41
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package MyPc;

/**
 *
 * @author luciano
 */

//Il programma calcola la memoria totale e in uso dalla JAVA VIRTUAL MACHINE
import java.io.IOException;
import java.lang.Runtime;
import java.lang.System;

public class MyRam{
    
    public static void main (String[]args){
        Runtime r=Runtime.getRuntime();
        System.out.println("Memoria totale");
        System.out.println(r.totalMemory());
        System.out.println("Memoria libera");
        System.out.println(r.freeMemory());
    }
    
}
