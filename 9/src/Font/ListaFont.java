/*
 * ListaFont.java
 *
 * Created on November 27, 2007, 8:39 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Font;

/**
 *
 * @author frick
 */
import javax.swing.*;
import java.awt.*;
public class ListaFont {
    public static void main(String[]args){
        String s="";
        JTextArea tabella=new JTextArea(30,40);
        JScrollPane scroll=new JScrollPane(tabella);
        
        String[]font=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(int i=0;i<font.length;i++){
            s+="\n"+font[i];
        }
        tabella.setText(s);
        tabella.setEditable(false);
        JOptionPane.showMessageDialog(null,scroll,"Sono stati trovati "+font.length+" font",JOptionPane.INFORMATION_MESSAGE);
      
    }
    
    
}
