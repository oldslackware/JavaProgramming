/*
 * TerraSole.java
 *
 * Created on October 8, 2007, 12:56 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Esercizi;

/**
 *
 * @author frick
 */
import javax.swing.JOptionPane;
public class TerraSole {
    
  public static void main(String[]args){
      final double PI=3.1415;
      double raggioT=12231;
      double raggioS=1392083;
      double VolumeT=4/3*(PI*raggioT*raggioT*raggioT);
      double VolumeS=4/3*(PI*raggioS*raggioS*raggioS);
      long VT=(long)VolumeT;
      long VS=(long)VolumeS;
      double rapportoTS=VolumeS/VolumeT;
      JOptionPane.showMessageDialog(null,"Il volume della terra e' circa pari a:\n" + VT +" km\nmentre il volume del sole e' circa pari a:\n" + VS +" km\nIl rapporto Sole Terra e': " + rapportoTS +".","Informazioni Astronomiche",JOptionPane.INFORMATION_MESSAGE);
  }
    
}
