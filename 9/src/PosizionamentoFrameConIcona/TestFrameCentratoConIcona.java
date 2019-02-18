/*
 * TestFrameCentratoConIcona.java
 *
 * Created on November 26, 2007, 2:50 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package PosizionamentoFrameConIcona;

/**
 *
 * @author frick
 */
import javax.swing.*;
public class TestFrameCentratoConIcona {
    public static void main(String[]args){
        FrameCentrato frame=new FrameCentrato();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setUndecorated(true);//Disabilito il sistema operativo a disegnarmi il frame,decomenttare per provare
        frame.setVisible(true);
    }
    
    
}
