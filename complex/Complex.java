package poo.complex;

import static java.lang.Math.*;

public class Complex {

  private double re;
  private double im;

  public static final Complex I=new Complex(0,1);

  public Complex(double a, double b, boolean polar) {
    if (polar) {
      re=a*cos(b);
      im=a*sin(b);
    }
    else {
      re=a;
      im=b;
    }
  }

  public Complex(double a, double b) {
    this(a,b,false);
  }

  public Complex(double d) {
    this(d,0,false);
  }
  
  public Complex(Complex c) {
    this(c.re,c.im,false);
  }

  public double getReal() {
    return re;
  }

  public double getImaginary() {
    return im;
  }

  public double getModulus() {
    return sqrt(re*re+im*im);
  }

  public double getPhase() {
    return atan2(im,re);
  }

  public Complex conjugate() {
    return new Complex(re,-im);
  }
  
  public Complex sum(Complex c) {
    return new Complex(re+c.re,im+c.im);
  }

  public Complex mul(Complex c) {
    return new Complex(re*c.re-im*c.im,re*c.im+im*c.re);
  }

  public Complex mul(double d) {
    return new Complex(re*d,im*d);
  }
  
  public Complex div(Complex w) {
	
    double den=w.getModulus();
	den*=den;
    return new Complex((re*w.re+im*w.im)/den,(im*w.re-re*w.im)/den);
}

  public String toString() {
    String pReale="";
    if (re!=0) pReale=""+re;
    String pImmag="";
    if (im>0) pImmag="+j"+im;
    else if (im<0) pImmag="-j"+(-im);
    String total=pReale+pImmag;
    if (total.length()==0) total="0";
    return total;
  }
  
}