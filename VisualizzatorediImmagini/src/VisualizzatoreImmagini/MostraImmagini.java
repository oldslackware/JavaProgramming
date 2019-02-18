/*
 * MostraImmagini.java
 *
 * Created on April 28, 2007, 4:56 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package VisualizzatoreImmagini;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.JFrame;


/**
 *
 * @author francesca
 */




public class MostraImmagini{


 
    
public static void main(String[]args){
        JFrame frame=new MostraImmaginFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
