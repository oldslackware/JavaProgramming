/*
 * HelloJava3Da.java
 *
 * Created on 14 maggio 2007, 3.16
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
import com.sun.j3d.utils.image.TextureLoader;
import com.sun.j3d.utils.universe.*;

public class HelloJava3Da extends Frame {

    public static void main(String args[]) {

        new HelloJava3Da();

    }

    public HelloJava3Da() {

        super("SferaRotante");
        setSize(400,300); 

        Canvas3D c = new Canvas3D(null);
        add("Center",c);

        SimpleUniverse u = new SimpleUniverse(c);
        u.getViewingPlatform().setNominalViewingTransform();

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

        BranchGroup objRoot = new BranchGroup();

        TransformGroup objTrans = new TransformGroup();
        objTrans.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        objRoot.addChild(objTrans);

        Appearance app = new Appearance();
        app = new Appearance();

        // è necessario associare un Material
        Material material = new Material();
        app.setMaterial(material);

        Texture tex = new TextureLoader("earth.jpg", this).getTexture();
        app.setTexture(tex);

        Sphere textureSphere = new Sphere(0.4f,
        Sphere.GENERATE_TEXTURE_COORDS | Sphere.GENERATE_NORMALS, 15, app);
        objTrans.addChild(textureSphere);

        BoundingSphere worldBounds = new BoundingSphere(
        new Point3d(0.0, 0.0, 0.0), // Centro
        1000.0); // Estensione


        // qui creiamo l'interpolatore che fa ruotare la terra
        Transform3D yAxis = new Transform3D();
        Alpha rotationAlpha = new Alpha(-1, Alpha.INCREASING_ENABLE,
        0, 0,
        15000, 0, 0,
        0, 0, 0);

        RotationInterpolator rotator =
        new RotationInterpolator(rotationAlpha, objTrans, yAxis,
        0.0f, (float) Math.PI*2.0f);
        rotator.setSchedulingBounds(worldBounds);
        objTrans.addChild(rotator);

        // la luce
        DirectionalLight light = new DirectionalLight();
        light.setDirection(new Vector3f(-1.0f, 0.0f, -0.5f));
        light.setColor(new Color3f(1.0f, 1.0f, 1.0f));
        light.setEnable(true);
        light.setInfluencingBounds(worldBounds);
        objRoot.addChild(light);

        // la prossima istruzione serve per migliorare le prestazioni
        objRoot.compile();

        return objRoot;

    }

}
