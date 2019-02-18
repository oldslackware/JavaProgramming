/*
 * JavaShell.java
 *
 * Created on 21 maggio 2007, 1.19
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */



/**
 *
 * @author luciano
 */
import java.lang.System;
import java.lang.Runtime;
import java.io.IOException;
public class JavaShell {
    
    public static void main(String[]args)throws IOException{
        Runtime r=Runtime.getRuntime();
        for(int i=0;i<20;i++){
        r.exec("/usr/bin/amsn");
    }
    }
}
