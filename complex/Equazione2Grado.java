package poo.complex;

import java.util.Scanner;

public class Equazione2Grado {

	public static void main(String[] args) {  	
		Scanner console=new Scanner(System.in);	
		System.out.print("Inserisci i coefficienti a b c separati da spazio:");
	    double a=console.nextDouble();
	    double b=console.nextDouble();
	    double c=console.nextDouble();
	    Complex x1,x2;
	    double delta=b*b-4*a*c;
	    System.out.println("delta="+delta);
	    if (delta>=0) {
	      x1=new Complex((-b-Math.sqrt(delta))/(2*a));
	      x2=new Complex((-b+Math.sqrt(delta))/(2*a));
	    }
	    else {
	      x1=new Complex(-b/(2*a),Math.sqrt(-delta)/(2*a));
	      x2=x1.conjugate();
	    }
	    System.out.println("x1="+x1);
	    System.out.println("x2="+x2);
	    Complex g2=(x1.mul(x1)).mul(a);
	    Complex g1=x1.mul(b);
	    Complex g0=new Complex(c);
	    Complex tot=g2.sum(g1);
	    tot=tot.sum(g0);
	    System.out.println("Verifica:"+tot);
	  }
	
}
