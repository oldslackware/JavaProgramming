/*
 * Crittografia.java
 *
 * Created on October 14, 2007, 4:09 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esempi;

/**
 *
 * @author frick
 */
import javax.swing.JOptionPane;
public class Crittografia {
    public static void main(String[]args){
     int conta=1;
             
               int tmp1=0;
               int tmp3=0;
               int tmp2=0;
               int tmp4=0;
               int tmp5=0;
               int o1=0;
               int o2=0;
               int o3=0;
               int o4=0;
               int o5=0;
               int cifra1,cifra2,cifra3,cifra4,cifra5=0;
               int r1,r2,r3,r4,r5=0;
               int primo,secondo,terzo,quarto,quinto=0;
        while(conta<5){
                   String s=JOptionPane.showInputDialog(null,"Inserisci  una cifra");
              int cifra=Integer.parseInt(s);
                    cifra1=(cifra+7)%10;
                    o1=(cifra+7)/10;
                    r1=(cifra+7)-(o1*10);
                    System.out.println(o1+"-"+r1);
                    tmp1=cifra1;
                     ++conta;
 
                      s=JOptionPane.showInputDialog(null,"Inserisci  una cifra");
                      cifra=Integer.parseInt(s);
                    cifra2=(cifra+7)%10;
                     o2=(cifra+7)/10;
                    r2=(cifra+7)-(o2*10);
                    tmp2=cifra2;
                     ++conta;
                     s=JOptionPane.showInputDialog(null,"Inserisci  una cifra");
                     cifra=Integer.parseInt(s);
                    cifra3=(cifra+7)%10;
                     o3=(cifra+7)/10;
                    r3=(cifra+7)-(o3*10);
                    tmp3=cifra3;
                     ++conta;
                    s=JOptionPane.showInputDialog(null,"Inserisci  una cifra");
                    cifra=Integer.parseInt(s);
                    cifra4=(cifra+7)%10;
                     o4=(cifra+7)/10;
                    r4=(cifra+7)-(o4*10);
                    tmp4=cifra4;
              
                     ++conta;
         s=JOptionPane.showInputDialog(null,"Inserisci  una cifra");
                    cifra=Integer.parseInt(s);
                    cifra5=(cifra+7)%10;
                     o5=(cifra+7)/10;
                    r5=(cifra+7)-(o5*10);
                    tmp5=cifra5;
                   
                    JOptionPane.showMessageDialog(null,tmp1+""+tmp2+""+tmp3+""+tmp4+""+tmp5,"Password decriptata",JOptionPane.INFORMATION_MESSAGE);
                    primo=((r1*o1)+10)-7;
                    secondo=((r1*o1)+10)-7;
                    terzo=((r1*o1)+10)-7;
                    quarto=((r1*o1)+10)-7;
                    quinto=((r1*o1)+10)-7;
                    JOptionPane.showMessageDialog(null,primo+""+secondo+""+terzo+""+quarto+""+quinto,"Password Originale",JOptionPane.INFORMATION_MESSAGE);
     
        }
            }
    }
    
  
    

