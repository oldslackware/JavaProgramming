/*
 * AcquisizioneCaratteri.java
 *
 * Created on October 3, 2007, 4:43 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package StringheOperazioni;

/**
 *
 * @author luciano
 */
import javax.swing.JOptionPane;
public class AcquisizioneCaratteri {
    public static void main(String[]args){
        String testo=JOptionPane.showInputDialog(null," Inserisci un po' di testo  ");
        int vocali=0;
        int spazi=0;
        int consonanti=0;
        for(int i=0;i<testo.length();i++){
            char car=Character.toLowerCase(testo.charAt(i));
            if(car=='a' || car=='e' || car=='i' || car=='o' || car=='u')
                vocali++;
        
            if(Character.isLetter(car))
            consonanti++;
    
            if(Character.isWhitespace(car))
                spazi++;
}
        JOptionPane.showMessageDialog(null," Il testo " + testo + " \n e' costituito da \n" + consonanti +" consonanti \n " + vocali +" vocali \n e da " + spazi +" spazi "," Acquisizione Caratteri ",JOptionPane.CLOSED_OPTION);
 
        
        
        
}
}