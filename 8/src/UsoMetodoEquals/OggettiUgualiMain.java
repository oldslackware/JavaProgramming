/*
 * OggettiUgualiMain.java
 *
 * Created on November 23, 2007, 1:29 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package UsoMetodoEquals;
import javax.swing.*;
/**
 *
 * @author frick
 */
public class OggettiUgualiMain {
    public static void main(String[]args){
        JTextArea tabella=new JTextArea(30,60);
    JScrollPane scroll=new JScrollPane(tabella);
    String s="";
    Impiegato uno=new Impiegato("Mario","Rossi",30000);
    Impiegato due=uno;
    Impiegato tre=new Impiegato("Mario","Rossi",30000);
    Impiegato quattro=new Impiegato("Mario","Bianchi",30000);
    s+="1)"+ uno.toString()+" "+uno.hashCode()+"\n\n2)"+ due.toString()+" "+due.hashCode()+"\n\n3)"+ tre.toString()+" "+tre.hashCode()+"\n\n4)"+ quattro.toString()+" "+quattro.hashCode()+"\n\n";
    s+="Impiegato uno==Impiegato due:"+(uno==due);
    s+="\n\nImpiegato uno==Impiegato tre:"+(uno==tre);
    s+="\n\nImpiegato uno.equals(Impiegato tre):"+uno.equals(tre);
    s+="\n\nImpiegato uno.equals(Impiegato quattro):"+uno.equals(quattro)+"\n\n";
    
    Manager m1=new Manager("Carlo","Neri",50000);
    Manager m2=new Manager("Carlo","Neri",50000);
    m2.setBonus(3000);
    s+="Manager 1)"+m1.toString()+" "+m1.hashCode()+"\n\nManager 2):"+m2.toString()+" "+m2.hashCode()+"\n\n";
    s+="\n\nManager uno.equals(Manager due):"+m1.equals(m2);
    
    tabella.setText(s);
    tabella.setEditable(false);
    JOptionPane.showMessageDialog(null,scroll,"Il metodo equals",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
