/*
 * Cubo2.java
 *
 * Created on 14 maggio 2007, 5.04
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
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;

public class Cubo2 extends Frame {

  public static void main(String args[]) {
    new Cubo2();
  }

  public Cubo2() {
		super("Cubo2");
    setSize(400,300); 

    Canvas3D c = new Canvas3D(null);
    add("Center",c);
	
	// SimpleUniverse comprende un Virtual Universe con un view branch
	// completo
		SimpleUniverse u = new SimpleUniverse(c);

	// con questo metodo spostiamo tutto "all'indietro" per poter vedere
	// qualcosa
		u.getViewingPlatform().setNominalViewingTransform();

	// adesso creiamo l'altro ramo, che contiene il cubo
	// è dentro una procedura così in futuro modificheremo solo quella
		BranchGroup contentBranchGroup = createContentBranch();
		u.addBranchGraph(contentBranchGroup);
	
		setVisible(true);
	
		addWindowListener(new WindowAdapter() 
			{public void windowClosing(WindowEvent e) 
				{dispose(); System.exit(0);}  
			}
		);
	}
  
	BranchGroup createContentBranch() {
		BranchGroup contentBranchGroup = new BranchGroup();
		TransformGroup contentTransformGroup = new TransformGroup();
	// il cubo lo istanziamo un po' più piccolo
		Shape3D cubo = new ColorCube(0.2);
		contentTransformGroup.addChild(cubo);
		contentBranchGroup.addChild(contentTransformGroup);
		return contentBranchGroup;
	}
}
