/*
 * FattorialeRicorsivoApplet.java
 *
 * Created on October 24, 2007, 3:46 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */



/**
 *
 * @author frick
 */
import java.awt.*;
import javax.swing.*;
public class FattorialeRicorsivoApplet extends JApplet{
    JTextArea tabella;
    public void init(){
        tabella=new JTextArea();
        Container c=getContentPane();
        c.add(tabella);
        tabella.setEditable(false);
        for(int i=0;i<=10;i++)
            tabella.append(i+"!="+fattoriale(i)+"\n");
    }
    public int fattoriale(int x){
        if(x<=1)
            return 1;
        else
            return x*fattoriale(x-1);
    }
    

}
