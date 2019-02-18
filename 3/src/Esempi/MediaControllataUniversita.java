/*
 * MediaControllataUniversita.java
 *
 * Created on October 8, 2007, 6:49 PM
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
import java.text.DecimalFormat;
public class MediaControllataUniversita {
    public static void main(String[]args){
        int promossi=0;
        int respinti=0;
        int ammessiOrale=0;
        int studenti=0;
        int tot=0;
        int voto=-1;;
        int somma=0;
        int orale=0;
        String dati=JOptionPane.showInputDialog(null,"Inserisci il voto,quando hai finito  inserisci -1 per terminare ");
        voto=Integer.parseInt(dati);
        
        if(voto>18){
               somma+=voto;
                promossi++;
                tot++;
            }
            else if(voto<18&&voto>15){
                somma+=voto;
                orale++;
                tot++;
            }
        
            else if(voto<15&&voto>0){
                somma+=voto;
                respinti++;
                tot++;
            }
        
        
        while(voto!=-1){
        dati=JOptionPane.showInputDialog(null,"Inserisci il voto,quando hai finito  inserisci -1 per terminare ");
        voto=Integer.parseInt(dati);
            if(voto>18){
               somma+=voto;
                promossi++;
                tot++;
            }
            else if(voto<18&&voto>15){
                somma+=voto;
                orale++;
                tot++;
            }
        
            else if(voto<15&&voto>0){
                somma+=voto;
                respinti++;
                tot++;
            }
        }
        
        DecimalFormat df=new DecimalFormat("0.00");
        if(tot!=0){
            double media=(double)somma/tot;
            System.out.println(tot);
            System.out.println(somma);
                  JOptionPane.showMessageDialog(null,"La media dei voti risulta:" + df.format(media) +"","Media Voti",JOptionPane.INFORMATION_MESSAGE);
                  JOptionPane.showMessageDialog(null,"Sono stati promossi:" + promossi +" studenti.\nNe sono stati respinti " + respinti +" ","Studenti Promossi e Respinti",JOptionPane.INFORMATION_MESSAGE);
                  
                  JOptionPane.showMessageDialog(null,"Sono stati ammessi all'orale obbligatorio " + orale +"","Numero Orali",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"Non hai inserito nessun voto ","Errore di input",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        }
    }
