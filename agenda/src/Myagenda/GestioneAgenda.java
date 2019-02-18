/*
 * GestioneAgenda.java
 *
 * Created on 6 maggio 2007, 15.37
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Myagenda;
import java.io.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author luciano
 */
public class GestioneAgenda {
    static AgendinaSuArray agenda=new AgendinaSuArray(100);
    static String linea;
    static StringTokenizer st;
    
    
    
    public static void main(String []args)throws IOException,ClassNotFoundException{
        ciclo: for(;;){
            JOptionPane.showMessageDialog(null,"Inserisci\n A per aggiungere un contatto \n B per rimuoverlo\n T per ricercare il telefono di un tuo contatto \n P per ricercare un tuo contatto \n E per mostrare l'elenco dei tuoi contatti \n S per salvare \n C per caricare\n Q per chiudere ","Welcome",JOptionPane.CLOSED_OPTION);
         
            linea=JOptionPane.showInputDialog("Inserisci comando");
            st=new StringTokenizer(linea," ");
            char comando=(st.nextToken().toUpperCase()).charAt(0);
            switch(comando){
                case 'Q':quit();break ciclo;
                case 'A':aggiungiNominativo();break;
                case 'B':rimuoviNominativo();break;
                case 'T':trovaTelefono();break;
                case 'P':cercaPersona();break;
                case 'E':mostraElenco();break;
                case 'S':salva();break;
                case 'C':carica();break;
                default:errore();
            }
        
        
        }
    }
        static void aggiungiNominativo(){
            String cog=null;
            String nom=null;
            String pre=null;
            String tel=null;
            try{
                cog=st.nextToken().toUpperCase();
                nom=st.nextToken().toUpperCase();
                pre=st.nextToken();
                tel=st.nextToken();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Dati incompleti","Errore",JOptionPane.ERROR_MESSAGE);
                return;
            }
            Nominativo n=new Nominativo(cog,nom,pre,tel);
            agenda.aggiungi(n);
            
        }
        static void rimuoviNominativo(){
		String cog=null;
                String nom=null;
                try{
                    cog=st.nextToken().toUpperCase();
                    nom=st.nextToken().toUpperCase();
                }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Dati incompleti","Errore",JOptionPane.ERROR_MESSAGE);
                return;
                }
        agenda.rimuovi(cog,nom);
        }
        
        static void trovaTelefono(){
            String cog=null;
            String nom=null;
            try{
                cog=st.nextToken().toUpperCase();
                nom=st.nextToken().toUpperCase();
            }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"Dati incompleti","Errore",JOptionPane.ERROR_MESSAGE);
                return;
            }
            Nominativo n=agenda.telefonoDI(cog,nom);
            if(n==null)
                JOptionPane.showMessageDialog(null,"Telefono non trovato","Errore",JOptionPane.ERROR_MESSAGE);
            else
                JOptionPane.showMessageDialog(null," Numero telefonico trovato"+n.getPrefisso()+"/"+n.getNumeTelefono(),"Numero Trovato",JOptionPane.CLOSED_OPTION);
        
     }
        static void cercaPersona(){
            String pre=null;
            String tel=null;
        try{
            pre=st.nextToken();
            tel=st.nextToken();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Dati incompleti","Errore",JOptionPane.ERROR_MESSAGE);
                return;
            
        }
            Nominativo n=agenda.personaDi(pre,tel);
            if(n==null)
                JOptionPane.showMessageDialog(null,"Persona non trovata","Errore",JOptionPane.ERROR_MESSAGE);
            else
                JOptionPane.showMessageDialog(null," Persona Trovata"+n.getCognome()+"/"+n.getNome(),"Numero Trovato",JOptionPane.CLOSED_OPTION);
        
        
        
        
        
        
        
        
        
        
        
        }
        
        static void mostraElenco(){
             
JOptionPane.showMessageDialog(null,agenda,"Elenco",JOptionPane.CLOSED_OPTION);
        }
        
        static void salva()throws IOException{
            String nomeFile=null;
            try{
                nomeFile=st.nextToken().toUpperCase();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Dati incompleti","Errore",JOptionPane.ERROR_MESSAGE);
                return;
            }
            agenda.salva(nomeFile);
        }
        
        static void carica()throws IOException,ClassNotFoundException{
            String nomeFile=null;
             try{
                nomeFile=st.nextToken();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Dati incompleti","Errore",JOptionPane.ERROR_MESSAGE);
                return;
            }
            agenda.ripristina(nomeFile);
          
        }
        
        static void errore(){
            JOptionPane.showMessageDialog(null,"Comandi ammessi:\n A Aggiungi con parametri  cog  nom  pre  tel\n esempio:\nA Rossi Mario 320 2456147\n R Rimuovi con parametri  cog  nom\n esempio:\n R Rossi Mario\n T Telefono con parametri  cog  nom\n esempio:\n T Rossi Mario\n P Persona con parametri  pre  tel\n esempio:\n P 320 2456147\n E Elenco \n esempio:\n E\n S Salva con parametro nomefile in cui salvare\nesempio:\n S MyAgend.dat\n C Carica con paametro nomefile che si vuole caricare\n esempio:\n C MyAgend.dat\n Q Chiude il programma\n esempio:\n Q\n ","Elenco Comandi",JOptionPane.CLOSED_OPTION);
            
        }
        
        static void quit()throws IOException{
            String risposta=JOptionPane.showInputDialog("Vuoi salvare il programma prima di chiuderlo?Premi y per salvare n per chiudere senza salvare");
            if(risposta.toUpperCase().equals("Y")){
                String saveFile=JOptionPane.showInputDialog("Inserisci il nome del file in cui vuoi salvare\nEsempio:MyAgend.dat");
                agenda.salva(saveFile);
            }
                
            
        }
    







}
