/*
 * CrapsApplet.java
 *
 * Created on October 22, 2007, 11:39 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */


/**
 *
 * @author frick
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CrapsApplet extends JApplet implements ActionListener{
    final int vinto=0,perso=1,continua=2;
     boolean primoTiro=true;//primo lancio
     int sommaDadi=0;
     int myScore=0;//punto da fare se non si vince al primo lancio
     int statoGioco=continua;
     
     //Prepariamo la grafica
     
     JLabel dado1Label,dado2Label,sommaLabel,scoreLabel;
     JTextField primoDado,secondoDado,somma,punteggio;
     JButton lancia;
     
     public void init()    {
         Container c=getContentPane();
         c.setLayout(new FlowLayout());
         
         //Grafica primo Dado
         
         dado1Label=new JLabel("Dado 1");
         c.add(dado1Label);
         primoDado=new JTextField(5);
         primoDado.setEditable(false);
         c.add(primoDado);
         
         //Grafica secondo Dado
        
        dado2Label=new JLabel("Dado 2");
        c.add(dado2Label);
        secondoDado=new JTextField(5);
        secondoDado.setEditable(false);
        c.add(secondoDado);
        
        //Grafica di somma

        sommaLabel=new JLabel("Somma");
        c.add(sommaLabel);
        somma=new JTextField(5);
        somma.setEditable(false);
        c.add(somma);
        
        //Grafica punteggio
        
        scoreLabel=new JLabel("Punteggio");
        c.add(scoreLabel);
        punteggio=new JTextField(5);
        punteggio.setEditable(false);
        c.add(punteggio);
        
        //Bottone lancia
        
        lancia=new JButton("Lancia dadi");
        lancia.addActionListener(this);
        c.add(lancia);
         
     }
     
     //Implementiamo actionPerformed con il metodo gioca
     public void actionPerformed(ActionEvent e){
         gioca();
     }
     
     public void gioca(){
         if(primoTiro){
             sommaDadi=lanciaDadi();
             switch(sommaDadi){
                 case 7:case 11:
                     statoGioco=vinto;
                     punteggio.setText("");//Svuoto il punteggio
                     break;
                 case 2:case 3:case 12:
                     statoGioco=perso;
                     punteggio.setText("");
                     break;
                 default:
                     statoGioco=continua;
                     myScore=sommaDadi;
                     punteggio.setText(Integer.toString(myScore));
                     primoTiro=false;
                     break;
             }
         
         }else{
             sommaDadi=lanciaDadi();
             if(sommaDadi==myScore)
                 statoGioco=vinto;
             else if(sommaDadi==7)
                 statoGioco=perso;//Se adesso faccio sette perdo
             
         }
     if(statoGioco==continua)
         showStatus("Tira ancora");
     else {
             if(statoGioco==vinto)
                 showStatus("Il giocatore ha vinto.Clicca sul pulsante lancia per giocare ancora");
             else
                  showStatus("Il giocatore ha perso.Clicca sul pulsante lancia per giocare ancora");
             primoTiro=true;
     }
   }
     
   public int lanciaDadi(){
       int dado1,dado2,totale;
       dado1=1+(int)(Math.random()*6);
       dado2=1+(int)(Math.random()*6);
       totale=dado1+dado2;
       
       primoDado.setText(Integer.toString(dado1));
       secondoDado.setText(Integer.toString(dado2));
       somma.setText(Integer.toString(totale));
       return totale;
   }  
     
     
   
    
}
