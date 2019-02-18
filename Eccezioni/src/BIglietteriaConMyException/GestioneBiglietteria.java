/*
 * GestioneBiglietteria.java
 *
 * Created on 11 maggio 2007, 20.45
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package BIglietteriaConMyException;

/**
 *
 * @author luciano
 */
public class GestioneBiglietteria {
    
    public static void main(String[]args){
        Biglietteria b=new Biglietteria();
    try{
        for(int i=1;i<105;i++){
            b.prenota();
        System.out.println("Prenotato posto numero "+i);
        }
    }catch(PrenotazioneException pe){
        System.out.println(pe.toString());
    }
    
    }
    
}
