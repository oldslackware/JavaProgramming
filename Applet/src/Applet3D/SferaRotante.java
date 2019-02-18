/*
 * SferaRotante.java
 *
 * Created on 14 maggio 2007, 5.00
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */



/**
 *
 * @author luciano
 */
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
import javax.media.j3d.*;
import javax.vecmath.*;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.image.TextureLoader;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.applet.MainFrame;

public class SferaRotante extends Applet {
 private SimpleUniverse u = null;
    
    public SferaRotante() {
    }
    public void init(){
       setLayout(new BorderLayout());
        GraphicsConfiguration config =
           SimpleUniverse.getPreferredConfiguration();

        Canvas3D c = new Canvas3D(config);
        add("Center",c);

       BranchGroup scene = createContentBranch();
	u = new SimpleUniverse(c);

        // This will move the ViewPlatform back a bit so the
        // objects in the scene can be viewed.
        u.getViewingPlatform().setNominalViewingTransform();

	u.addBranchGraph(scene);

 

        

    }

    public void destroy() {
	u.cleanup();
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

        Sphere textureSphere = new Sphere(0.5f,
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
 public static void main(String[] args) {
	new MainFrame(new SferaRotante(), 256, 256);
    }
}
