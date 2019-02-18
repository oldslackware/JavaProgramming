/*
 * Cubo.java
 *
 * Created on 14 maggio 2007, 5.08
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */



/**
 *
 * @author luciano
 */
import java.awt.*;

import java.awt.event.*;

import javax.media.j3d.*;

import javax.vecmath.*;

import com.sun.j3d.utils.geometry.*;

public class Cubo1 extends Frame {

  public static void main(String args[]) {

    new Cubo1();

  }

  public Cubo1() {

 // la finestra avrà "Cubo1" come titolo e sarà di 400x300

  super("Cubo1");

    setSize(400,300);

 // Canvas3D estende Component quindi è heavyweight; in esso

 // Java3D disegna la scena; lo piazziamo in mezzo alla finestra

    Canvas3D canvas = new Canvas3D(canvas);

    add("Center", canvas);

 // da qui in avanti conviene seguire il codice sulla immagine

 // del scene graph.

 // VirtualUniverse è il fondamento di qualsiasi scena di Java3D

 // Una volta creato gli si attacca uno o più oggetti Locale

    VirtualUniverse virtualUniverse = new VirtualUniverse();

  Locale locale = new Locale(virtualUniverse);

 // creiamo il lato sinistro dell'albero, il view branch; è piuttosto

 // complesso e permette di fare cose sofisticate. Però per un

 // scena semplice è solo una scomodità, ecco perchè c'è

 // SimpleUniverse

  BranchGroup viewBranchGroup = new BranchGroup();

  TransformGroup viewTransformGroup = new TransformGroup();

  ViewPlatform viewPlatform = new ViewPlatform();

  viewTransformGroup.addChild(viewPlatform);

  viewBranchGroup.addChild(viewTransformGroup);

  locale.addBranchGraph(viewBranchGroup);

 /* View contiene i parametri per visualizzare la scena da questo

 *  punto di vista

 *  ad esso attacchiamo:

 *    il Canvas3D

 *   un PhysicalBody, che contiene i dati della "testa" dell'osservatore

 *    (la posizione degli occhi e delle orecchie, per esempio)

 *   un setPhysicalEnvironment, che specifica i dispositivi di imput

 *    e di output

 */

  View myView = new View();

  myView.addCanvas3D(canvas);

  myView.setPhysicalBody(new PhysicalBody());

  myView.setPhysicalEnvironment(new PhysicalEnvironment());

  myView.attachViewPlatform(viewPlatform);

 // adesso creiamo l'altro ramo, che contiene il cubo

  BranchGroup contentBranchGroup = new BranchGroup();

  TransformGroup contentTransformGroup = new TransformGroup();

  Shape3D cubo = new ColorCube(0.2);

  contentTransformGroup.addChild(cubo);

  contentBranchGroup.addChild(contentTransformGroup);

  setVisible(true);

  addWindowListener(new WindowAdapter()

      {public void windowClosing(WindowEvent e)

         {dispose(); System.exit(0);}

      }

    );

  }

} 
