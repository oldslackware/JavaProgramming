/*
 * ContaToken.java
 *
 * Created on October 7, 2007, 12:47 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package stringtokenizeresempi;

/**
 *
 * @author frick
 */
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class ContaToken extends JFrame {
    private JLabel etichetta;
    private JTextField input;
    private JTextArea output;
    
    public ContaToken(){
        super("Contiamo i token");
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        
        etichetta=new JLabel("Inserisci un po' di testo");
        c.add(etichetta);
        
        input=new JTextField(30);
        input.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String token=e.getActionCommand();
                StringTokenizer tokens=new StringTokenizer(token," ,.:;?|!()");
                
                output.setText("Numero di token:" + tokens.countTokens() + "\nI token trovati sono:\n");
                while(tokens.hasMoreTokens())
                    output.append(tokens.nextToken() + "\n");
                
            }
        }
        );
    
        c.add(input);
        output=new JTextArea(12,22);
        output.setEditable(false);
        c.add(new JScrollPane(output));
        setSize(425,380);
        show();
    }
    
    public static void main(String[]args){
        ContaToken applicazione=new ContaToken();
        applicazione.addWindowFocusListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        }
        );
        
        
    }
   
    
}
